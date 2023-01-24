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
            System.out.println("9. Mostra barche per nazionalità");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta < 0 || scelta > 9) {
                System.out.println("Scelta non valida");
            }
            switch (scelta) {
                case 1:
                    System.out.println(v0.aggiungiVeicolo());
                    break;
                case 2:
                    System.out.println(v0.eliminaVeicoloCodice());
                    break;
                case 3:
                    System.out.println(v0.eliminaVeicoloTarga());
                    break;
                case 4:
                    System.out.println(v0.ricercaVeicoloCodice());
                    break;
                case 5:
                    System.out.println(v0.ricercaVeicoloTarga());
                    break;
                case 6:
                    System.out.println(v0.ricercaVeicoli_nPosti());
                    break;
                case 7:
                    System.out.println(v0.salvaSuFile());
                    break;
                case 8:
                    System.out.println(v0.ripristinaDaFile());
                    break;
                case 9:
                    System.out.println(v0.inventario());
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
        scanner.close();
    }
}
