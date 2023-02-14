package liste0;

public class Lista {
    private Nodo head;
    private Nodo p = head;
    private int elementi;

    public Lista() {
        head = null;
        elementi = 0;
    }

    public void inserisciInTesta(int n) {
        Nodo pn = new Nodo(n);
        pn.setLink(head);
        head = pn;
        elementi++;
    }

    public void lastFirst() {
        Nodo primo = head;
        Nodo scambio = primo;
        while (p != null) {
            primo = p;
            p = p.getLink();
        }
        Nodo ultimo = scambio;
    }
}
