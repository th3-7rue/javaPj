package es32;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int scelta = -1;
        Gestione b = new Gestione();
        do {
            try {
                scelta = -1;
                Scanner t = new Scanner(System.in);
                System.out.println("Menu:");
                System.out.println("0. Esci");
                System.out.println("1. Aggiungi");
                System.out.println("2. Elimina");
                System.out.println("3. Ricerca codice");
                System.out.println("4. Ricerca caratteristiche");
                System.out.println("5. Salva");
                System.out.println("6. Ripristina");

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
                    System.out.println(b.aggiungi());
                    break;
                case 2:
                    System.out.println(b.rimuovi());
                    break;
                case 3:
                    System.out.println(b.ricercaPerCodice());
                    break;
                case 4:
                    //System.out.println(b.());
                    break;
                case 5:
                    System.out.println(b.salva());
                    break;
                case 6:
                    System.out.println(b.carica());
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
    }
}
