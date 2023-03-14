package cinema;

public class Persona {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Persona(String nome) {
        this.nome = nome;
    }

    public Persona(Persona persona) {
        this.nome = persona.nome;
    }

    @Override
    public String toString() {
        return "Persona [nome=" + nome + "]";
    }
    
}
