package inserisciInTesta;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        int a = 5, b = 3, c = 8, d = 2;
        l.inserisciInTesta(d);
        l.inserisciInTesta(c);
        l.inserisciInTesta(b);
        l.inserisciInTesta(a);
        l.lastFirst();
        System.out.println(l.stampa());
    }
}
