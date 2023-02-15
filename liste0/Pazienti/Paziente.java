package Pazienti;

public class Paziente {
    private String nome, urgenza;

    public Paziente(String nome, String urgenza) {
        this.nome = nome;
        this.urgenza = urgenza;
    }

    public String getNome() {
        return nome;
    }

    public String getUrgenza() {
        return urgenza;
    }

    public Paziente(Paziente paziente) {
        this.nome = paziente.nome;
        this.urgenza = paziente.urgenza;
    }
}
