package cinema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scelta = -1;
        Coda b = new Coda();
        do {
            try {
                scelta = -1;
                Scanner t = new Scanner(System.in);
                System.out.println("Menu:");
                System.out.println("0. Esci");
                System.out.println("1. Aggiungi persona");
                System.out.println("2. Rimuovi persona in testa");
                System.out.println("3. Estrai prossimo");
                System.out.println("4. Visualizza coda");

                if (t.hasNext()) {
                    scelta = t.nextInt();
                }
                if (scelta < 0 || scelta > 4) {
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
                    System.out.println(b.addPersona());
                    break;
                case 2:
                    System.out.println(b.rimuoviInTesta());
                    break;
                case 3:
                    System.out.println(b.estraiProssimo());
                    break;
                case 4:
                    System.out.println(b.visualizzaLista());
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
    }
}
