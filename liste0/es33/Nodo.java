package es33;

public class Nodo {
    private Email info;
    private Nodo link;

    public Nodo(Email email) {
        info = new Email(email);
        link = null;
    }

    public Email getInfo() {
        return new Email(info);
    }

    public void setInfo(Email email) {
        info = new Email(email);
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

}
