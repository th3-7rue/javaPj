package esercizi2maggio.StudioNotarile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Acquirente> acquirenti = new ArrayList<>();
        while (true) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Inserisci un nuovo acquirente");
            System.out.println("2. Visualizza l'elenco degli acquirenti");
            System.out.println("3. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // consuma il carattere newline

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci i dati dell'acquirente:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Chi vende l'immobile (privato o impresa): ");
                    String chiVende = scanner.nextLine();
                    System.out.print("Rendita catastale: ");
                    double renditaCatastale = scanner.nextDouble();
                    System.out.print("Prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Caparra (0 se non prevista): ");
                    double caparra = scanner.nextDouble();
                    scanner.nextLine(); // consuma
                                        // il
                                        // carattere
                                        // newline
                    System.out.print("Acquisto tramite mutuo (si o no): ");
                    String acquistoConMutuoString = scanner.nextLine();
                    boolean acquistoConMutuo = acquistoConMutuoString.equalsIgnoreCase("si");

                    Acquirente acquirente = new Acquirente(nome, cognome, email, telefono, chiVende, renditaCatastale,
                            prezzo, caparra, acquistoConMutuo);
                    acquirenti.add(acquirente);
                    break;
                case 2:
                    Collections.sort(acquirenti, new Comparator<Acquirente>() {
                        @Override
                        public int compare(Acquirente o1, Acquirente o2) {
                            return o1.getCognome().compareTo(o2.getCognome());
                        }
                    });

                    Iterator<Acquirente> iterator = acquirenti.iterator();
                    while (iterator.hasNext()) {
                        Acquirente acquirente = iterator.next();
                        System.out.println(acquirente);
                    }
                    break;
                case 3:
                    System.out.println("Arrivederci!");
                    return;
                default:
                    System.out.println("Scelta non valida!");
            }
        }
    }
}