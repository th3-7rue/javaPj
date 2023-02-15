package interrLuca;

public class Nodo {
    private Nodo link;
    private int info;

    public Nodo(int info) {
        this.link = null;
        this.info = info;
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
