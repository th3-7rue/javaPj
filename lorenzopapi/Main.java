package lorenzopapi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Registro r = new Registro();
        // menu
        String scelta = null;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Menu:");
            System.out.println("1. Carica");
            System.out.println("2. Salva");
            System.out.println("3. Aggiungi prova");
            System.out.println("4. Rimuovi prova");
            System.out.println("5. Ordina");
            System.out.println("6. Esci");
            scelta = sc.next();

            switch (scelta) {
                case "1":
                    r.carica();
                    break;
                case "2":
                    r.salva();
                    break;
                case "3":
                    r.aggiungiProva();
                    break;
                case "4":
                    r.rimuoviProva();
                    break;
                case "5":
                    r.ordina();
                    break;
                case "6":
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        } while (!scelta.equals("6"));
        sc.close();
    }
}
