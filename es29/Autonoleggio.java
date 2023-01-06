import java.util.Scanner;

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
            v[posizione] = new Veicolo(targa, marca, modello, nPosti, codice, posizione);
            codice++;
            return "Veicolo aggiuntom con successo";
        }
        return "Posizione non valida";
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
}
