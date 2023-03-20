package coda;

public class Coda {
    private Nodo head;
    private Nodo tail;

    public Coda() {
        head = null;
        tail = null;
    }

    public String toString() {
        String s = "Coda: ";
        Nodo p = head;
        while (p != null) {
            s += "\n" + p.getInfo();
            p = p.getLink();
        }
        return s;
    }

    public void enqueue(Nodo p) {
        if (head == null) {
            head = p;
            tail = p;
        } else {
            tail.setLink(p);
            tail = p;
        }
    }

    public String dequeue() {
        Nodo p = head;
        if (head == null) {
            return null;
        }
        head = head.getLink();
        return "Estratto " + p.getInfo();
    }
}
