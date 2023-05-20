package lorenzopapi;

public class Prova {
    private String nome, cognome, materia, data;
    private double voto;
    
    public Prova(String nome, String cognome, String materia, String data, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.materia = materia;
        this.data = data;
        this.voto = voto;
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
