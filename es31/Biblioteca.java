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
}
