package verificamaggio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Iterator;

public class Clinica {
    ArrayList<CartellaClinica> cartelleCliniche = new ArrayList<CartellaClinica>();

    public Clinica() {
        cartelleCliniche = new ArrayList<CartellaClinica>();
        
    }

    public String aggiungi() {
        // aggiungi una nuova cartella clinica all'ArrayList.
        Scanner input = new Scanner(System.in);
        System.out.println("--- Aggiungi una nuova cartella clinica ---");
        System.out.println("Inserisci il nome del paziente:");
        String nomePaziente = input.next();
        System.out.println("Inserisci il cognome del paziente:");
        String cognomePaziente = input.next();
        System.out.println("Inserisci il codice fiscale del paziente:");
        String codiceFiscale = input.next();
        // non saltare la linea
        input.nextLine();
        System.out.println("Inserisci la diagnosi del paziente:");
        String diagnosi = input.nextLine();
        System.out.println("Inserisci il numero di telefono del paziente:");
        String numeroTelefono = input.next();
        Date dataNascita=null;
        Date dataVisita = null;
        boolean errore = true;
        while (errore) {
            try {
                input.nextLine();
                System.out.println("Inserisci la data di nascita del paziente (gg mm aaaa):");
                int giorno = input.nextInt();
                int mese = input.nextInt()-1;
                int anno = input.nextInt();
                dataNascita = new Date(anno, mese, giorno);
                errore = false;
            } catch (Exception e) {
                errore = true;
                System.out.println("Errore nell'inserimento della data di nascita!");
            }
        }
        errore = true;
        while (errore) {
            try {
                input.nextLine();
                System.out.println("Inserisci la data della visita del paziente (gg mm aaaa):");
                int giorno = input.nextInt();
                int mese = input.nextInt()-1;
                int anno = input.nextInt();
                dataVisita = new Date(anno, mese, giorno);
                errore = false;
            } catch (Exception e) {
                errore = true;
                System.out.println("Errore nell'inserimento della data della visita!");
            }
        }
        cartelleCliniche.add(new CartellaClinica(nomePaziente, cognomePaziente, codiceFiscale, diagnosi, numeroTelefono,
                dataNascita, dataVisita));
        return "Cartella clinica aggiunta con successo!";
    }

    public String cancella() {
        // dato il cognome del paziente, cancella la corrispondente cartella clinica.
        System.out.println("--- Cancella una cartella clinica ---");
        System.out.println("Inserisci il cognome del paziente:");
        Scanner input = new Scanner(System.in);
        String cognomePaziente = input.next();
        Iterator<CartellaClinica> i = cartelleCliniche.iterator();
        while (i.hasNext()) {
            CartellaClinica c = i.next();
            if (c.getCognomePaziente().equals(cognomePaziente)) {
                i.remove();
                return "Cartella clinica cancellata con successo!";
            }
        }
        return "Cartella clinica non trovata!";
    }

    public String visualizza() {
        // visualizza tutte le cartelle cliniche presenti nell'ArrayList.
        System.out.println("--- Visualizza tutte le cartelle cliniche ---");
        for (CartellaClinica c : cartelleCliniche) {
            System.out.println(c);
        }
        return "Cartelle cliniche visualizzate con successo!";
    }
    public String cerca() {
        // dato il cognome del paziente, cerca la corrispondente cartella clinica nell'ArrayList e stampa a video. 
        System.out.println("--- Cerca una cartella clinica ---");
        System.out.println("Inserisci il cognome del paziente:");
        Scanner input = new Scanner(System.in);
        String cognomePaziente = input.next();
        for (CartellaClinica c : cartelleCliniche) {
            if (c.getCognomePaziente().equals(cognomePaziente)) {
                return c.toString();
            }
        }
        return "Cartella clinica non trovata!";
    }
    public String ordina() {
        // ordina le cartelle cliniche in base al cognome del paziente, utilizzando il metodo sort e passando come parametro un oggetto Comparator per confron-tare i cognomi. Stampa a video. 
        System.out.println("--- Ordina le cartelle cliniche ---");
        Collections.sort(cartelleCliniche);
        for(CartellaClinica c : cartelleCliniche) {
            System.out.println(c);
        }
        return "Cartelle cliniche ordinate con successo!";
    }
}
