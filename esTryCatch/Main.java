package esTryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        int divisore = 0;

        do {
            System.out.println("Inserisci il divisore ");
            divisore = Integer.parseInt(s.nextLine());

            try {
                a = 15 / divisore;
                System.out.println("Il risultato e' " + a);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Impossibile");
            }
        } while (true);
        s.close();
    }
}
