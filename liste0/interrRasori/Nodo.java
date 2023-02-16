public class Nodo {
    private Nodo link;
    private char info;

    public Nodo(char info) {
        this.link = null;
        this.info = info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public Nodo getLink() {
        return link;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public char getInfo() {
        return info;
    }
}