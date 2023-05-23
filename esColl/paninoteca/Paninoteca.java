package esColl.paninoteca;

import java.util.ArrayList;

public class Paninoteca {
    ArrayList<Panino> panini;

    public Paninoteca() {
        panini = new ArrayList<Panino>();
    }

    public void aggiungiPanino() {
        System.out.println("Aggiungi panino");
        System.out.println("Tipo pane: ");
        String tipoPane = System.console().readLine();
        // menu aggiungi/rimuovi ingrediente
                ArrayList<String> ingredienti = new ArrayList<String>();

        do{
        System.out.println("Ingredienti: ");}
        // inserimento ingredienti usando i metodi di Panino
        
        
        Panino panino = new Panino(tipoPane, ingredienti);
        panini.add(panino);
        System.out.println("Panino aggiunto");
    }
    
}
