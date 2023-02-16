public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public void inserisciInTesta(char info) {
        Nodo pn = new Nodo(info);
        pn.setLink(head);
        head = pn;
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

    public int spostaInizio() {
        Nodo p = head;
        Nodo pPrec = head;
        if (head == null || head.getLink() == null) {
            return -1;
        } else {
            while (p.getLink() != null) {
                pPrec = p;
                p = p.getLink();
            }
            pPrec.setLink(null);
            p.setLink(head);
            head = p;
            return 0;
        }
    }

    public void scambiaCoppie() {
        Nodo prec = null;
        Nodo p = head;
        while (p != null && p.getLink() != null) {
            Nodo succ = p.getLink();
            p.setLink(succ.getLink());
            succ.setLink(p);
            if (prec != null) {
                prec.setLink(succ);
            } else {
                head = succ;
            }
            prec = p;
            p = p.getLink();
        }
    }
}