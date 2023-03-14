package cinema;

public class Nodo {
    private Persona info;
    private Nodo link;

    public Nodo(Persona persona) {
        info = new Persona(persona);
        link = null;
    }

    public Persona getInfo() {
        return new Persona(info);
    }

    public void setInfo(Persona persona) {
        info = new Persona(persona);
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
}
