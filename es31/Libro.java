public class Libro {
    private String autore, titolo, editore;
    private int anno;
    public Libro(String autore, String titolo, String editore, int anno) {
        this.autore = autore;
        this.titolo = titolo;
        this.editore = editore;
        this.anno = anno;
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
