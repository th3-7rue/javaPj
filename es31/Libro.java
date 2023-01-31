import java.io.Serializable;

public class Libro implements Serializable{
    private String autore, titolo, editore;
    private int anno;

    public Libro(String autore, String titolo, String editore, int anno) {
        this.autore = autore;
        this.titolo = titolo;
        this.editore = editore;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Libro [autore=" + autore + ", titolo=" + titolo + ", editore=" + editore + ", anno=" + anno + "]";
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getEditore() {
        return editore;
    }

    public int getAnno() {
        return anno;
    }
}
