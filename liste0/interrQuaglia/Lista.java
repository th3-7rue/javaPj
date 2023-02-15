package interrQuaglia;

public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public String toString() {
        Nodo p = head;
        String s = "Lista: ";
        while (p != null) {
            s += p.getInfo() + " ";
            p = p.getLink();
        }
        return s;
    }

    public void inserisciInTesta(int info) {
        Nodo pn = new Nodo(info);
        pn.setLink(head);
        head = pn;
    }

    public void inserisciInCoda(int info) {
        Nodo pn = new Nodo(info);
        Nodo p = head;
        while (p.getLink() != null) {
            p = p.getLink();
        }
        pn.setLink(null);
        p.setLink(pn);
    }

    public void inserisciInPosizione(int info, int posizione) {
        Nodo pn = new Nodo(info);
        Nodo p = head;
        int i = 0;
        try {
            if (posizione == 0) {
                inserisciInTesta(info);
            } else {
                while (i < posizione - 1) {
                    p = p.getLink();
                    i++;
                }
                pn.setLink(p.getLink());
                p.setLink(pn);
            }
        } catch (NullPointerException e) {
            System.out.println("Posizione non valida");
        }
    }

    public void duplica(int valore) {
        Nodo p = head;
        while (p != null) {
            if (p.getInfo() == valore) {
                Nodo pn = new Nodo(p.getInfo());
                pn.setLink(p.getLink());
                p.setLink(pn);
                p = pn;
            }
            p = p.getLink();
        }
    }
}
