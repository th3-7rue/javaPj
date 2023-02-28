package Pazienti;

public class Ospedale {
    private Nodo primo;

    public Ospedale() {
        primo = null;
    }

    public void aggiungiPaziente(Paziente paziente) {
        Nodo nuovoNodo = new Nodo(paziente);
        if (primo == null) {
            primo = nuovoNodo;
        } else {
            Nodo corrente = primo;
            Nodo precedente = null;
            while (corrente != null && corrente.getInfo().getUrgenza() >= nuovoNodo.getInfo().getUrgenza()) {
                precedente = corrente;
                corrente = corrente.getLink();
            }
            if (precedente == null) {
                nuovoNodo.setLink(primo);
                primo = nuovoNodo;
            } else {
                nuovoNodo.setLink(corrente);
                precedente.setLink(nuovoNodo);
            }
        }
    }

    public Paziente prossimoPaziente() {
        if (primo == null) {
            return null;
        } else {
            Paziente paziente = primo.getInfo();
            primo = primo.getLink();
            return paziente;
        }
    }

    public void stampaLista() {
        Nodo corrente = primo;
        while (corrente != null) {
            System.out.println(corrente.getInfo());
            corrente = corrente.getLink();
        }
    }
}
