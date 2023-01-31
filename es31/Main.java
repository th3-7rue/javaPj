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
                System.out.println("4. Ricerca tutti i libri di uno specifico autore");
                System.out.println("5. Determina il numero di libri presenti");
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (scelta != 0);

    }
}
