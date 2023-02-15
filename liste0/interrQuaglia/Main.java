package interrQuaglia;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.inserisciInTesta(4);
        l.inserisciInTesta(4);
        l.inserisciInTesta(23);
        l.inserisciInTesta(4);
        l.inserisciInCoda(5);
        l.inserisciInPosizione(300, 2);
        l.duplica(4);

        System.out.println(l);
    }
}
