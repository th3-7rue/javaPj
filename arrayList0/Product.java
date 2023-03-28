package arrayList0;

public class Product {
    private String nome;
    private float prezzo;

    public String getNome() {
        return nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public Product(String nome, float prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Product [nome=" + nome + ", prezzo=" + prezzo + "]";
    }

}
