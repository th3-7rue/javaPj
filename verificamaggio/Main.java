package verificamaggio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        System.out.println("Benvenuto nel programma ClinicaRasori!");
        boolean esci = false;
        Scanner input = new Scanner(System.in);
        String scelta;
        while (!esci) {
            // menu di scelta
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi una nuova cartella clinica");
            System.out.println("2. Cancella una cartella clinica");
            System.out.println("3. Visualizza tutte le cartelle cliniche");
            System.out.println("4. Cerca una cartella clinica");
            System.out.println("5. Ordina le cartelle cliniche");
            System.out.println("6. Esci");
            // leggi la scelta
            scelta = input.next();
            // esegui la scelta
            switch (scelta) {
                case "1":
                    System.out.println(clinica.aggiungi());
                    break;
                case "2":
                    System.out.println(clinica.cancella());
                    break;
                case "3":
                    System.out.println(clinica.visualizza());
                    break;
                case "4":
                    System.out.println(clinica.cerca());
                    break;
                case "5":
                    System.out.println(clinica.ordina());
                    break;
                case "6":
                    System.out.println("Arrivederci!");
                    esci = true;
                    break;
                default:
                    System.out.println("Scelta non valida!");
                    break;
            }
        }
        input.close();
    }
}