package toDoList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi un'attività");
            System.out.println("2. Rimuovi un'attività");
            System.out.println("3. Modifica la priorità di un'attività");
            System.out.println("4. Stampa la lista in ordine decrescente di priorità");
            System.out.println("5. Esci");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Inserisci la descrizione dell'attività:");
                    String descrizione = scanner.next();
                    System.out.println("Inserisci la priorità dell'attività:");
                    int priority = scanner.nextInt();
                    toDoList.aggiungi(descrizione, priority);
                    System.out.println("Attività aggiunta alla lista.");
                    break;
                case 2:
                    System.out.println("Inserisci l'indice dell'attività da rimuovere:");
                    int index = scanner.nextInt();
                    toDoList.rimuovi(index);
                    System.out.println("Attività rimossa dalla lista.");
                    break;
                case 3:
                    System.out.println("Inserisci l'indice dell'attività da modificare:");
                    int i = scanner.nextInt();
                    System.out.println("Inserisci la nuova priorità:");
                    int newPriority = scanner.nextInt();
                    toDoList.modificaPr(i, newPriority);
                    System.out.println("Priorità dell'attività modificata.");
                    break;
                case 4:
                    System.out.println("Lista delle attività in ordine decrescente di priorità:");
                    toDoList.stampa();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }

        scanner.close();
        System.out.println("Programma terminato.");
    }
}
