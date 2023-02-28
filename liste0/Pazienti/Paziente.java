package Pazienti;

public class Paziente {
    private String[] urgenze = { "bianco", "giallo", "rosso" };

    private String nome;
    private int urgenza;

    public Paziente(String nome, int urgenza) {
        this.nome = nome;
        this.urgenza = urgenza;
    }

    public String getNome() {
        return nome;
    }

    public int getUrgenza() {
        return urgenza;
    }

    public Paziente(Paziente paziente) {
        this.nome = paziente.nome;
        this.urgenza = paziente.urgenza;
    }

    @Override
    public String toString() {
        return "Paziente [nome=" + nome + ", urgenza=" + urgenze[urgenza - 1] + "]";
    }

}
