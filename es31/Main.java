import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scelta = -1;
        Biblioteca b = new Biblioteca();
        do {
            try {
                scelta = -1;
                Scanner t = new Scanner(System.in);
                System.out.println("Menu:");
                System.out.println("0. Esci");
                System.out.println("1. Aggiungi un nuovo libro alla biblioteca");
                System.out.println("2. Ricerca un libro a partire dal titolo");
                System.out.println("3. Ricerca tutti i libri di uno specifico autore");
                System.out.println("4. Determina il numero di libri presenti");
                System.out.println("5. Rimuovi un libro");
                System.out.println("6. Salva su file");
                System.out.println("7. Ripristina da file");

                if (t.hasNext()) {
                    scelta = t.nextInt();
                }
                if (scelta < 0 || scelta > 5) {
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Errore: scelta non valida");
            }
            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    break;
                case 1:
                    b.aggiungiLibro();
                    break;
                case 2:
                    b.ricercaDaTitolo();
                    break;
                case 3:
                    b.ricercaPerAutore();
                    break;
                case 4:
                    b.stampaNlibri();
                    break;
                case 5:
                    b.rimuoviLibro();
                    break;
                default:
                    break;
            }
        } while (scelta != 0);

    }
}
