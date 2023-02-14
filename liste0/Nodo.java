package liste0;

public class Nodo {
    private Paziente info;
    private Nodo link;

    public Nodo(Paziente paziente) {
        info = new Paziente(paziente);
        link = null;
    }

    public Paziente getInfo() {
        return new Paziente(info);
    }

    public void setInfo(Paziente paziente) {
        info = new Paziente(paziente);
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

}
