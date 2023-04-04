package arrayList0;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductList l = new ProductList();
        int scelta = -1;
        do {
            try {
                scelta = -1;
                Scanner t = new Scanner(System.in);
                System.out.println("\n--- MENU ---");
                System.out.println("0. Esci");
                System.out.println("1. Aggiungi prodotto");
                System.out.println("2. Rimuovi prodotto");
                System.out.println("3. Stampa prodotti");

                if (t.hasNext()) {
                    scelta = t.nextInt();
                }
                if (scelta < 0 || scelta > 3) {
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Errore: scelta non valida");
            }
            Scanner t = new Scanner(System.in);

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    break;
                case 1:
                    System.out.println("--- AGGIUNGI PRODOTTO ---");
                    System.out.print("Inserisci nome: ");
                    String nome = t.next();
                    System.out.print("Inserisci prezzo: ");
                    Float prezzo = t.nextFloat();
                    l.aggiungi(nome, prezzo);
                    System.out.println("Il prodotto è stato aggiunto");
                    break;
                case 2:
                    System.out.println("--- RIMUOVI PRODOTTO ---");
                    System.out.print("Inserisci nome: ");
                    String nomen = t.next();
                    System.out.println(l.rimuovi(nomen));
                    break;
                case 3:
                    System.out.println("--- STAMPA PRODOTTI ---");
                    l.stampa();
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        } while (scelta != 0);
    }
}
