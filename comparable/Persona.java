package comparable;

public class Persona implements Comparable<Persona> {
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

    @Override
    public int compareTo(Persona o) {
        return this.eta - o.eta;
    }

}
