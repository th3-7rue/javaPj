package esercizi2maggio.Autosalone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Autosalone autosalone = new Autosalone();

        System.out.println("Benvenuto nell'autosalone! Cosa vuoi fare?");

        boolean continua = true;
        while (continua) {
            System.out.println("1. Aggiungi un'automobile");
            System.out.println("2. Calcola la percentuale di automobili con cilindrata compresa tra 1.5 e 2.0");
            System.out.println("3. Calcola la media del prezzo delle automobili con cilindrata compresa tra 1.5 e 2.0");
            System.out.println("4. Esci");

            System.out.print("Inserisci la tua scelta: ");

            String scelta = input.nextLine();

            switch (scelta) {
                case "1":
                    System.out.println("Inserisci la cilindrata e il prezzo dell'automobile, separati da uno spazio.");
                    String line = input.nextLine();
                    String[] parts = line.split(" ");
                    double cilindrata = Double.parseDouble(parts[0]);
                    double prezzo = Double.parseDouble(parts[1]);
                    autosalone.aggiungiAuto(cilindrata, prezzo);
                    System.out.println("Automobile aggiunta con successo!");
                    break;
                case "2":
                    double percentuale = autosalone.calcolaPercentuale();
                    System.out.printf("La percentuale di automobili con cilindrata compresa tra 1.5 e 2.0 è: %.2f%%\n",
                            percentuale);
                    break;
                case "3":
                    double mediaPrezzo = autosalone.calcolaMediaPrezzo();
                    System.out.printf(
                            "La media del prezzo delle automobili con cilindrata compresa tra 1.5 e 2.0 è: €%.2f\n",
                            mediaPrezzo);
                    break;
                case "4":
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}
