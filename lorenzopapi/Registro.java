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
              String[] campi = line.split(" ");
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
                fw.write(p.getCognome() + " " + p.getNome() + " " + p.getMateria() + " " + p.getVoto() + " " + p.getData() + "\n");
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // aggiungi prova

    // rimuovi prova

    // ordina

}
