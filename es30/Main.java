package es30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Porto v0 = new Porto();
        int scelta;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("0. Esci");
            System.out.println("1. Aggiungi una nuova barca");
            System.out.println("2. Libera posto");
            System.out.println("3. Ricerca barca");
            System.out.println("4. Salva stato del porto");
            System.out.println("5. Mostra barche per nazionalità");
            scelta = scanner.nextInt();
            if (scelta < 0 || scelta > 9) {
                System.out.println("Scelta non valida");
            }
            switch (scelta) {
                case 1:
                    v0.assegnaPosto();
                    break;
                case 2:
                    v0.liberaPosto();
                    break;
                case 3:
                    v0.ricerca();
                    break;
                case 4:
                    v0.salva();
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
        scanner.close();
    }
}
