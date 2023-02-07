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
    public String ricercaCaratteristiche() {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci la dimensione della RAM: ");
        double velRam = s.nextDouble();
        System.out.println("Inserisci la dimensione della memoria");
        double dimDisco = s.nextDouble();
        Computer[] c1 = new Computer[MAXpc];
        int index = 0;
        for (int i = 0; i < MAXpc; i++) {
            if (pc[i] != null) {
                if (pc[i].getDimRAM() > velRam && pc[i].getDimDisk() > dimDisco) {
                    c1[index] = pc[i];
                    index++;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            if (c1[i] != null) {
                System.out.println(c1[i].toString());
            }
        }
        return "Sono stati trovati " + index + " elementi";
    }

    public String aggiungi() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("anno ");
            int anno = s.nextInt();
            System.out.println("marca ");
            String marca = s.next();
            System.out.println("modello ");
            String modello = s.next();
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
            if (pc[i] != null)
                return "posizione occupata";
            else {
                pc[i] = new Computer(codice, anno, vcpu, ram, disco, ram,
                        marca, modello);
                codice++;

                return pc[i].toString();
            }

        } catch (ArrayStoreException e) {
            return "Errore";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Errore";
        }
    }

    public String rimuovi() {
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci la posizione ");
        int i = s.nextInt();
        try {
            if (pc[i] != null) {
                pc[i] = null;
                return "il pc è stato cancellato ";
            } else
                return "non c'è nessun pc in questa posizione ";
        } catch (NullPointerException e) {
            System.out.println("posizione non valida ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("errore");
        }
        return "errore";

    }

    public String ricercaPerCodice() {
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci il codice ");
        int codice = Integer.parseInt(s.nextLine());
        for (int i = 0; true; ++i) {
            if (pc[i] != null) {
                if (codice == pc[i].getCodice()) {
                    return pc[i].toString();
                }
            }
        }
    }

    public String salva() throws java.io.IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("pc.bin"));
        stream.writeObject(this.pc);
        stream.close();
        return "File salvato";
    }

    public String carica() throws IOException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("pc.bin"));
        try {
            this.pc = (Computer[]) stream.readObject();
            return "file caricato con successo";
        } catch (ClassNotFoundException exception) {
            stream.close();
        }
        return "Errore";
    }
}
