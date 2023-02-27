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
// Metodo che ricerca i computer che soddisfano le caratteristiche inserite dall'utente
public String ricercaCaratteristiche() {
    Scanner s = new Scanner(System.in);
    // Chiede all'utente di inserire la dimensione della RAM e della memoria
    System.out.println("Inserisci la dimensione della RAM: ");
    double velRam = s.nextDouble();
    System.out.println("Inserisci la dimensione della memoria");
    double dimDisco = s.nextDouble();
    // Crea un nuovo array di Computer
    Computer[] c1 = new Computer[MAXpc];
    // Inizializza l'indice a 0
    int index = 0;
    // Itera sull'array di Computer e aggiunge i computer che soddisfano le caratteristiche a c1
    for (int i = 0; i < MAXpc; i++) {
        if (pc[i] != null) {
            if (pc[i].getDimRAM() > velRam && pc[i].getDimDisk() > dimDisco) {
                c1[index] = pc[i];
                index++;
            }
        }
    }
    // Itera sull'array c1 e stampa i computer trovati
    for (int i = 0; i < index; i++) {
        if (c1[i] != null) {
            System.out.println(c1[i].toString());
        }
    }
    // Restituisce il numero di computer trovati
    return "Sono stati trovati " + index + " elementi";
}

// Metodo che aggiunge un nuovo computer all'array
public String aggiungi() {
    Scanner s = new Scanner(System.in);
    try {
        // Chiede all'utente di inserire le informazioni del computer
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
        // Verifica se la posizione è già occupata e aggiunge il computer all'array
        if (pc[i] != null)
            return "posizione occupata";
        else {
            pc[i] = new Computer(codice, anno, vcpu, ram, disco, ram, marca, modello);
            codice++;
            return pc[i].toString();
        }

    } catch (ArrayStoreException e) {
        return "Errore";
    } catch (ArrayIndexOutOfBoundsException e) {
        return "Errore";
    }
}
