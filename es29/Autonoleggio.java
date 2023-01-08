import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Autonoleggio {
    private Veicolo[] v;

    private int codice = 1;

    public Autonoleggio() {
        v = new Veicolo[1000];
    }

    public String aggiungiVeicolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci targa: ");
        String targa = scanner.nextLine();
        System.out.print("Inserisci marca: ");
        String marca = scanner.nextLine();
        System.out.print("Inserisci modello: ");
        String modello = scanner.nextLine();
        System.out.print("Inserisci numero di posti: ");
        int nPosti = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserisci posizione: ");
        int posizione = Integer.parseInt(scanner.nextLine());

        if (posizione >= 0 && posizione < 1000) {
            if (v[posizione] == null) {
                v[posizione] = new Veicolo(targa, marca, modello, nPosti, codice, posizione);
                codice++;
                return "Veicolo aggiunto con successo";
            } else {
                return "Posto già occupato dal veicolo " + v[posizione].getCodice();
            }
        } else {
            return "Posizione non valida";
        }
    }

    public String ricercaVeicoloTarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci targa: ");
        String targa = scanner.nextLine();

        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {

                if (v[i].getTarga() == targa) {
                    System.out.println(v[i]);
                    return "Ricerca completata con successo";
                }
            }
        }
        return "Veicolo non trovato";

    }

    public String eliminaVeicoloTarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci targa: ");
        String targa = scanner.nextLine();

        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {

                if (v[i].getTarga() == targa) {
                    v[i] = null;
                    return "Veicolo eliminato con successo";
                }
            }
        }
        return "Veicolo non trovato";
    }

    public String ricercaVeicoloCodice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci codice: ");
        int codice = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {

                if (v[i].getCodice() == codice) {
                    System.out.println(v[i]);
                    return "Ricerca completata con successo";
                }
            }
        }
        return "Veicolo non trovato";

    }

    public String eliminaVeicoloCodice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci codice: ");
        int codice = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {

                if (v[i].getCodice() == codice) {
                    v[i] = null;
                    return "Veicolo eliminato con successo";
                }
            }
        }

        return "Veicolo non trovato";
    }

    public String ricercaVeicoli_nPosti() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci numero di posti: ");
        int nPosti = Integer.parseInt(scanner.nextLine());
        int nVeicoliTrovati = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                if (v[i].getnPosti() == nPosti) {
                    nVeicoliTrovati++;
                    System.out.println(v[i]);
                }
            }
        }
        return "Sono stati trovati " + nVeicoliTrovati + " veicoli con " + nPosti + " posti";

    }

    public String salvaSuFile() {
        // salvataggio su file di testo
        Scanner scanner = new Scanner(System.in);
        String nomeFile;
        System.out.println("Come vuoi chiamare il file? ");
        nomeFile = scanner.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile + ".txt"))) {
            for (int i = 0; i < v.length; i++) {
                if (v[i] != null) {
                    bw.write(v[i].toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // salvataggio su file dat
        try (FileOutputStream fos = new FileOutputStream(nomeFile + ".dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(v);
            return "Inventario salvato con successo";
        } catch (IOException e) {
            e.printStackTrace();
            return "Errore";
        }
    }

    public String ripristinaDaFile() {
        String nomeFile;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Da quale file vuoi effettuare il ripristino? ");
        nomeFile = scanner.nextLine() + ".dat";
        try (FileInputStream fis = new FileInputStream(nomeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
            v = (Veicolo[]) ois.readObject();
            return "Ripristino effettuato con successo";
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return "Errore";
        }
    }

    public String inventario() {
        String[] marche = new String[1000];
        int m = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                marche[m] = v[i].getMarca();
                m++;
            }
        }
        if (m == 0) {
            return "Non ci sono veicoli";
        }
        String marca = marche[0];
        int conta = 1;
        for (int i = 1; i < marche.length; i++) {
            if (marche[i] != marca) {
                System.out.println(marca + ": " + conta);
                conta = 1;
                marca = marche[i];
            } else {
                conta++;
            }
        }
        return "Inventario creato con successo";

    }
}
