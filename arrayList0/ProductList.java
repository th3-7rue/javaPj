package arrayList0;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> l;

    public ProductList() {
        l = new ArrayList<Product>();
    }

    public void aggiungi(String nome, float prezzo) {
        Product p = new Product(nome, prezzo);
        l.add(p);
    }

    public void rimuovi(String nome) {
        for (Product product : l) {
            if (product.getNome().equals(nome)) {
                l.remove(product);
            }
        }
    }

    public void stampa() {
        for (Product product : l) {
            System.out.println(product);
        }
    }
}
