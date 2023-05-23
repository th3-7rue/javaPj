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
        System.out.println("Ingredienti: ");
        // inserisci ingredienti nell'arraylist separati da virgola
        String ingredientiString = System.console().readLine();
        String[] ingredienti = ingredientiString.split(",");
        ArrayList<String> ingredientiList = new ArrayList<String>();
        for (String ingrediente : ingredienti) {
            ingredientiList.add(ingrediente);
        }
        Panino panino = new Panino(tipoPane, ingredientiList);
        panini.add(panino);
        System.out.println("Panino aggiunto");
    }
}
