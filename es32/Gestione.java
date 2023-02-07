package es32;

import java.io.*;
import java.util.Scanner;

public class Gestione {
    private final int MAXpc = 1000;
    private int codice = 1;
    Computer[] pc;

    public Gestione() {
        pc = new Computer[MAXpc];
    }


    // public Computer(int codice, int anno, String marca, String modello, double
    // disco, double monitor, double ram, double vcpu) {
    public void aggiungi() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("anno ");
            int anno = s.nextInt();
            System.out.println("marca ");
            String marca = s.nextLine();
            System.out.println("modello ");
            String modello = s.nextLine();
            System.out.println("disco ");
            double disco = Double.parseDouble(s.next());
            System.out.println("monitor ");
            double monitor = Double.parseDouble(s.next());
            System.out.println("ram ");
            double ram = Double.parseDouble(s.next());
            System.out.println("velocita cpu ");
            double vcpu = Double.parseDouble(s.next());
            System.out.println("posizione ");
            int i = s.nextInt();
            if (pc[i] != null) System.out.println("posizione occupata");
            else pc[i] = new Computer( int anno, String marca, String modello,double disco, double monitor, double ram,
            double vcpu);
        } catch (ArrayStoreException e) {
            System.out.println("Errore");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore");
        }
    }

    public void rimuovi() {
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci la posizione ");
        int i = s.nextInt();
        try {
            if (c[i] != null) {
                c[i] = null;
                System.out.println("il pc è stato cancellato ");
            } else
                System.out.println("non c'è nessun pc in questa posizione ");
        } catch (NullPointerException e) {
            System.out.println("posizione non valida ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("errore");
        }
    }

    public void ricercaPerCodice() {
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci il codice ");
        int codice = Integer.parseInt(s.nextLine());
        for (int i = 0; true; ++i) {
            if (c[i] != null) {
                if (codice == c[i].getCodice()) {
                    System.out.println(c[i]);
                }
            }
        }
    }

    public void salva() throws java.io.IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("pc.bin"));
        stream.writeObject(this.c);
        stream.close();
    }

    public void carica() throws IOException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("pc.bin"));
        try {
            this.c = (Computer[]) stream.readObject();
        } catch (ClassNotFoundException exception) {
            stream.close();
        }
    }
}

}
