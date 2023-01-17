package throwsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        try (Scanner tastiera = new Scanner(System.in)) {
            System.out.print("Inserisci l'ora: ");
            int h = Integer.parseInt(tastiera.nextLine());
            if (h >= 24 || h < 0) {
                throw new ArithmeticException("Orario sbagliato");
            } else {
                System.out.println("Orario corretto");
                System.out.print("Inserisci i minuti: ");
                int m = Integer.parseInt(tastiera.nextLine());
                if (m>=60||m<0) {
                    throw new ArithmeticException("Orario sbagliato");
                } else {
                    System.out.println("Orario corretto");
                    System.out.print("Inserisci i secondi: ");
                    int s = Integer.parseInt(tastiera.nextLine());
                    if (s >= 60 || s < 0) {
                        throw new ArithmeticException("Orario sbagliato");
                    } else {
                        System.out.println("Orario corretto");

                    }
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
