package esColl.paninoteca;

import java.util.ArrayList;

public class Panino {
    private String tipoPane;
    private ArrayList<String> ingredienti;
    public String getTipoPane() {
        return tipoPane;
    }

    public Panino(String tipoPane) {
        this.tipoPane = tipoPane;
        ingredienti = new ArrayList<String>();
    }

    
    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }
    // aggiungi ingrediente
    public void aggiungiIngrediente(String ingrediente) {
        ingredienti.add(ingrediente);
    }
    // rimuovi ingrediente
    public void rimuoviIngrediente(String ingrediente) {
        ingredienti.remove(ingrediente);
    }
    @Override
    public String toString() {
        return "Panino [tipoPane=" + tipoPane + ", ingredienti=" + ingredienti + "]";
    }
    
}
