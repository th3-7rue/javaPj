package coda;

public class Nodo {
    private int info;
    private Nodo link;

    public Nodo(int info) {
        this.info = info;
        this.link = null;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public Nodo getLink() {
        return link;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }
}
