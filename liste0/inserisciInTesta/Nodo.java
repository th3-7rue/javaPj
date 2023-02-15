package inserisciInTesta;

public class Nodo {
    private Nodo link;
    private int info;

    public Nodo(int info) {
        this.link = null;
        this.info = info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

}
