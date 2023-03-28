package arrayList0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductList l = new ProductList();
        l.aggiungi("riccardo", 40);
        l.stampa();
        l.rimuovi("riccardo");
        l.stampa();
    }
}
