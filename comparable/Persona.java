package comparable;

import java.lang.Comparable;
impo
public class Persona implements Comparable{
    private String nome;

    private int eta;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", eta=" + eta + "]";
    }
    
}
