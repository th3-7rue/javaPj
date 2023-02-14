package liste0;

public class Lista {
    private Nodo head;
    private Nodo p = head;
    private int elementi;

    public Lista() {
        head = null;
        elementi = 0;
    }

    public String stampa() {
        Nodo p = head;
        String s = "Lista: ";
        while (p != null) {
            s += p.getInfo() + " ";
            p = p.getLink();
        }
        return s;
    }

    public void inserisciInTesta(int n) {
        Nodo pn = new Nodo(n);
        pn.setLink(head);
        head = pn;
        elementi++;
    }

    public void lastFirst() {
        Nodo p = head;
        Nodo primo = p;
        Nodo scambio = primo;

        while (p != null) {
            primo = p;
            p = p.getLink();
        }
        primo.setLink(head);
        Nodo ultimo = scambio;
        ultimo.setLink(ultimo);
    }
}
