package esercizi2maggio.Calciatori;

import java.util.ArrayList;
import java.util.Scanner;

/*Scrivere un programma in Java che permetta di gestire i dati relativi ad una squadra di calcio. Ogni calciatore è identificato da nome, cognome, numero di maglia e ruolo. Gli attaccanti hanno maglie con numeri compresi tra 7 e 11, i centrocampisti hanno maglie con numeri compresi tra 4 e 6, i difensori hanno maglie con numeri compresi tra 1 e 3.

Il programma deve consentire di inserire i dati dei calciatori della squadra (in un ArrayList), di visualizzarli e di effettuare alcuni calcoli. In particolare, il programma deve calcolare:

· Il totale dei goal segnati dalla squadra, suddivisi per ruolo:

o attaccanti,

o centrocampisti,

o difensori.

· Il totale dei goal subiti dalla squadra.

Il programma deve prevedere un menu di scelta per l'utente, che permetta di selezionare l'operazione da eseguire. */
public class Squadra {
    private ArrayList<Calciatore> squadra;

    public Squadra() {
        squadra = new ArrayList<Calciatore>();
    }

    public void inserisciCalciatore() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci nome: ");
        String nome = input.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = input.nextLine();
        System.out.print("Inserisci numero di maglia: ");
        int numeroMaglia = input.nextInt();
        System.out.print("Inserisci ruolo (A = Attaccante, C = Centrocampista, D = Difensore): ");
        char ruolo = input.next().charAt(0);

        Calciatore calciatore = new Calciatore(nome, cognome, ruolo, numeroMaglia);
        squadra.add(calciatore);
    }

    public void visualizzaCalciatori() {
        for (Calciatore calciatore : squadra) {
            System.out.println(calciatore);
        }
    }

    public void calcolaGoalSegnatiPerRuolo() {
        int goalAttaccanti = 0;
        int goalCentrocampisti = 0;
        int goalDifensori = 0;

        for (Calciatore calciatore : squadra) {
            if (calciatore.getRuolo() == 'A') {
                goalAttaccanti += calciatore.getGoalSegnati();
            } else if (calciatore.getRuolo() == 'C') {
                goalCentrocampisti += calciatore.getGoalSegnati();
            } else if (calciatore.getRuolo() == 'D') {
                goalDifensori += calciatore.getGoalSegnati();
            }
        }

        System.out.println("Goal segnati dagli attaccanti: " + goalAttaccanti);
        System.out.println("Goal segnati dai centrocampisti: " + goalCentrocampisti);
        System.out.println("Goal segnati dai difensori: " + goalDifensori);
    }

    public void segnaGoal() {
        System.out.println("Inserisci numero maglia:");
        Scanner input = new Scanner(System.in);
        int numeroMaglia = input.nextInt();
        //cerca calciatore con numero maglia
        for (Calciatore calciatore : squadra) {
            if (calciatore.getNumeroMaglia() == numeroMaglia) {
                calciatore.segnaGoal();
                System.out.println("Goal segnati: " + calciatore.getGoalSegnati());
                return;
            }
        }
    }
}
