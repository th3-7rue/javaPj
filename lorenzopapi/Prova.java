package lorenzopapi;

public class Prova {
    private String nome, cognome, materia, data;
    private double voto;
    
    public Prova(String cognome, String nome, String materia, String voto, String data) {
        this.nome = nome;
        this.cognome = cognome;
        this.materia = materia;
        this.data = data;
        this.voto = Double.parseDouble(voto);
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getMateria() {
        return materia;
    }
    public String getData() {
        return data;
    }
    public double getVoto() {
        return voto;
    }
    
}
