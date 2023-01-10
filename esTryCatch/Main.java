package esTryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        int divisore = 0;
        System.out.println("Inserisci il divisore ");
        divisore = Integer.parseInt(s.nextLine());

        do {
            try {
                a = 15 / divisore;
                System.out.println("Il risultato e' " + a);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Impossibile");
                System.out.println("Inserisci il divisore ");
                divisore = Integer.parseInt(s.nextLine());
            }
        } while (true);
    }
}
