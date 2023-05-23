package esColl.prenotRisto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Ristorante {
    // arraylist di prenotazioni
    private ArrayList<Prenotazione> prenotazioni;
    Scanner sc = new Scanner(System.in);
    // costruttore
    public Ristorante() {
        prenotazioni = new ArrayList<Prenotazione>();
    }
    // aggiungiPrenotazione
    public void aggiungiPrenotazione() {
        // chiedi dati
        System.out.println("Inserisci nome:");
        String nome = System.console().readLine();
        System.out.println("Inserisci telefono:");
        String telefono = System.console().readLine();
        System.out.println("Inserisci numero persone:");
        int numPersone = Integer.parseInt(System.console().readLine());
        System.out.println("Inserisci numero tavolo:");
        int numTavolo = Integer.parseInt(System.console().readLine());
        System.out.println("Inserisci data e ora (gg mm aaaa hh mm):");
        int g=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int h=sc.nextInt();
        int min = sc.nextInt();
        Date data = new Date(a, m, g, h, min);
        // crea prenotazione
        Prenotazione p = new Prenotazione(nome, telefono, numPersone, numTavolo, data);
        // aggiungi prenotazione
        prenotazioni.add(p);
        System.out.println("Prenotazione aggiunta");
    }
    // cancellaPrenotazione dato il nome
    public void cancellaPrenotazione() {
        // chiedi nome
        System.out.println("Inserisci nome:");
        String nome = System.console().readLine();
        // cerca prenotazione con iterator
        Iterator<Prenotazione> it = prenotazioni.iterator();
        boolean trovato = false;
        while (it.hasNext() && !trovato) {
            Prenotazione p = it.next();
            if (p.getNome().equals(nome)) {
                // rimuovi prenotazione
                it.remove();
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Prenotazione non trovata");
        }
        else {
            System.out.println("Prenotazione rimossa");
        }
    }
    // visualizzaPrenotazioni dato il nome
    public void visualizzaPrenotazioni() {
        // chiedi nome
        System.out.println("Inserisci nome:");
        String nome = System.console().readLine();
        // cerca prenotazione con foreach
        boolean trovato = false;
        for (Prenotazione p : prenotazioni) {
            if (p.getNome().equals(nome)) {
                // visualizza prenotazione
                System.out.println(p);
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Prenotazione non trovata");
        }
    }
    // cercaTavolo
    public void cercaTavolo() {
        // chiedi numero tavolo
        System.out.println("Inserisci numero tavolo:");
        int numTavolo = Integer.parseInt(System.console().readLine());
        // cerca prenotazione con foreach
        boolean trovato = false;
        for (Prenotazione p : prenotazioni) {
            if (p.getNumTavolo() == numTavolo) {
                // visualizza prenotazione
                System.out.println(p);
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Prenotazione non trovata");
        }
    }

    // ordinaPrenotazioni
    public void ordinaPrenotazioni() {
        // ordina prenotazioni per nome
        prenotazioni.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        // visualizza prenotazioni
        for (Prenotazione p : prenotazioni) {
            System.out.println(p);
        }
    }
}
