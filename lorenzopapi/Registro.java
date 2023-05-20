package lorenzopapi;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

public class Registro {
    private ArrayList<Prova> prove;

    // costruttore arrylist di prova vuoto
    public Registro() {
        this.prove = new ArrayList<Prova>();
    }
            String inputPath = "lorenzopapi/Registro.txt";
            String outputPath = "lorenzopapi/Output.txt";

    // leggi da file Registro.txt e carica in prove
    public void carica() {
        // apri file Registro.txt con file reader
      try {
          BufferedReader br = new BufferedReader(new FileReader(inputPath));
          String line;
          while ((line = br.readLine()) != null) {
              String[] campi = line.split(";");
            // crea oggetto Prova
            Prova p = new Prova(campi[0], campi[1], campi[2], campi[3], campi[4]);
            // aggiungi oggetto Prova in prove
            prove.add(p);
          }
        br.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    

    // salva in file Registro.txt
    public void salva() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(outputPath);
            for (Prova p : prove) {
                fw.write(p.getCognome()
                        + ";" + p.getNome() + ";" + p.getMateria() + ";" + p.getVoto() + ";" + p.getData() + "\n");
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // aggiungi prova
    public void aggiungiProva() {
        // chiedi dati all'utente
        // crea oggetto Prova
        // aggiungi oggetto Prova in prove
        System.out.println("aggiungi prova");
        String cognome, nome, materia, voto, data;
        System.out.println("inserisci cognome");
        cognome = System.console().readLine();
        System.out.println("inserisci nome");
        nome = System.console().readLine();
        System.out.println("inserisci materia");
        materia = System.console().readLine();
        System.out.println("inserisci voto");
        voto = System.console().readLine();
        System.out.println("inserisci data");
        data = System.console().readLine();
        Prova p = new Prova(cognome, nome, materia, voto, data);
        prove.add(p);

    }
    // rimuovi prova
    public void rimuoviProva() {
        // chiedi dati all'utente
        // rimuovi oggetto Prova da prove
        System.out.println("rimuovi prova");
        System.out.println("inserisci cognome");
        String cognome = System.console().readLine();
        // stampa prove con quel cognome
        int i = 1;
        for (Prova p : prove) {
            if (p.getCognome().equals(cognome)) {
                System.out.println(
                        i + ". " + p.getCognome() + " " + p.getNome() + " " + p.getMateria() + " " + p.getVoto() + " "
                                + p.getData());
                i++;
            }
        }
        if(i==1) {
            System.out.println("nessuna prova con questo cognome");
            return;
        }
        // chiedi quale vuole rimuovere
        System.out.println("quale vuoi rimuovere?");
        int scelta;
        do {
            try {
                scelta = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                scelta = 0;
            }
            if (scelta < 1 || scelta > i) {
                System.out.println("scelta non valida");
            }
        } while (scelta < 1 || scelta > i);
        // rimuovi
        for (Prova prova : prove) {
            if (prova.getCognome().equals(cognome)) {
                scelta--;
                if (scelta == 0) {
                    prove.remove(prova);
                    break;
                }
            }
        }
    }
    // ordina
    public void ordina() {
        // ordina prove
    }
}
