package interrLuca;

public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public void inserisciInTesta(int info) {
        Nodo pn = new Nodo(info);
        pn.setLink(head);
        head = pn;
        Nodo p = head;
        while (p.getLink() != null) {
            if (p.getLink().equals(head.getLink())) {
                break;
            }
            p = p.getLink();
        }
        p.setLink(head);

    }

    public String toString() {
        String s = "Lista: ";
        Nodo p = head;
        while (p != null) {
            s += p.getInfo() + " ";
            p = p.getLink();
        }
        return s;
    }
}
