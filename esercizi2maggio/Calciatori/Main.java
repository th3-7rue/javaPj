package esercizi2maggio.Calciatori;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Squadra squadra = new Squadra();
        Scanner input = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("1. Inserisci calciatore");
            System.out.println("2. Visualizza calciatori");
            System.out.println("3. Calcola goal segnati per ruolo");
            System.out.println("4. Segna goal");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    squadra.inserisciCalciatore();
                    break;
                case 2:
                    squadra.visualizzaCalciatori();
                    break;
                case 3:
                    squadra.calcolaGoalSegnatiPerRuolo();
                    break;
                case 4:
                    squadra.segnaGoal();
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        } while (scelta != 0);
    }
}
