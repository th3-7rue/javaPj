package arrayList0;

import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Product> iterator = l.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getNome().equals(nome)) {
                iterator.remove();
            }
        }
    }

    public void stampa() {
        for (Product product : l) {
            System.out.println(product);
        }
    }
}
