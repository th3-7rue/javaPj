import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
    private Libro[] l;
    private final int DIM = 1000;

    public Biblioteca() {
        l = new Libro[DIM];
    }

    public void aggiungiLibro() {
        int posizione;
        String autore, editore, titolo;
        int anno;
        try {
            Scanner t = new Scanner(System.in);
            System.out.println("Aggiunta di un libro:");
            System.out.print("Inserisci l'autore: ");
            autore = t.nextLine();
            System.out.print("Inserisci il titolo: ");
            titolo = t.nextLine();
            System.out.print("Inserisci l'anno di pubblicazione: ");
            anno = t.nextInt();
            System.out.print("Inserisci l'editore: ");
            editore = t.next();
            System.out.print("Inserisci la posizione: ");
            posizione = t.nextInt();
            if (l[posizione] != null) {
                throw new IllegalArgumentException("La posizione e' gia' occupata");
            }
            l[posizione] = new Libro(autore, titolo, editore, anno);
            System.out.println("Libro inserito con successo in posizione " + posizione);
        } catch (InputMismatchException e) {
            System.out.println("Errore: dato non valido");
        } catch (ArrayStoreException e) {
            System.out.println("Errore: dati non validi");
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Errore: posizione non valida");
        }

    }

    public void ricercaDaTitolo() {
        Scanner t = new Scanner(System.in);
        String titolo;
        int conta = 0;
        System.out.print("Inserisci il titolo del libro da cercare: ");
        titolo = t.nextLine();
        for (int i = 0; i < l.length; i++) {
            if (l[i] != null) {
                if (l[i].getTitolo().equals(titolo)) {
                    System.out.println(l[i]);
                    conta++;
                }
            }
        }
        System.out.println("Sono stati trovati " + conta + " libri");
    }

    public void ricercaPerAutore() {
        Scanner t = new Scanner(System.in);
        String autore;
        int conta = 0;
        System.out.print("Inserisci l'autore del quale si vogliono ricercare i libri: ");
        autore = t.nextLine();
        for (int i = 0; i < l.length; i++) {
            if (l[i] != null) {
                if (l[i].getAutore().equals(autore)) {
                    System.out.println(l[i]);
                    conta++;
                }
            }
        }
        System.out.println("Sono stati trovati " + conta + " libri");
    }

    public void stampaNlibri() {
        int conta = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] != null) {
                conta++;
            }
        }
        System.out.println("Sono stati trovati " + conta + " libri");
    }

    public void rimuoviLibro() {
        Scanner t = new Scanner(System.in);
        try {
            System.out.print("Inserisci la posizione del libro da rimuovere: ");
            int posto = t.nextInt();
            l[posto] = null;
            System.out.println("Il libro in posizione " + posto + " e' stato rimosso");
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Posizione non valido");
        } catch (NullPointerException e) {
            System.out.println("La posizuone non e' occupata");
        }
    }

    public void salva() {
        Scanner scanner = new Scanner(System.in);
        String nomeFile;
        System.out.println("Come vuoi chiamare il file? ");
        nomeFile = scanner.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile + ".txt"))) {
            for (int i = 0; i < l.length; i++) {
                if (l[i] != null) {
                    bw.write(l[i].toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // salvataggio su file dat
        try (FileOutputStream fos = new FileOutputStream(nomeFile + ".dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(l);
            System.out.println("Inventario salvato con successo");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Errore");
        }

    }

    public void ripristina() {
        String nomeFile;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Da quale file vuoi effettuare il ripristino? ");
        nomeFile = scanner.next() + ".dat";
        try (FileInputStream fis = new FileInputStream(nomeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
            l = (Libro[]) ois.readObject();
            System.out.println("Ripristino effettuato con successo");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Il file indicato non esiste");
        }

    }
}
