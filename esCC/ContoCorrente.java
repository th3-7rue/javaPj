package esCC;

import java.util.Scanner;

public class ContoCorrente {
    private float saldo;
    private int numCC;

    public float getSaldo() {
        return saldo;
    }

    public void stampaSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public ContoCorrente(float saldo, int numCC) {
        this.saldo = saldo;
        this.numCC = numCC;
    }

    public void preleva() {
        Scanner s = new Scanner(System.in);
        float denaro;
        do {
            System.out.print("Quanto denaro vuoi prelevare? ");
            denaro = Float.parseFloat(s.nextLine());
            try {
                if (denaro <= 0) {
                    throw new IllegalArgumentException("Quota non valida");
                } else if (denaro > saldo) {
                    throw new IllegalArgumentException("Il saldo disponibile non e' sufficiente");
                }

                saldo -= denaro;
                System.out.println("Prelievo effettuato con successo");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

    }

    public void versa() {
        Scanner s = new Scanner(System.in);
        float denaro;
        do {
            System.out.print("Quanto denaro vuoi versare? ");
            denaro = Float.parseFloat(s.nextLine());
            try {
                if (denaro <= 0) {
                    throw new IllegalArgumentException("Quota non valida");
                }
                saldo += denaro;
                System.out.println("Versamento effettuato con successo");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}