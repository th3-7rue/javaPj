package Pazienti;

public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public String aggiungiPaziente(Paziente paziente) {
        Nodo pn = new Nodo(paziente);
        head = pn;
        return "Il paziente " + paziente.getNome() + " è stato aggiunto con urgenza di tipo " + paziente.getUrgenza();
    }

    public String toString() {
        String s = "Lista:\n";
        Nodo p = head;
        while (p != null) {
            s += p.getInfo().getNome() + ": " + p.getInfo().getUrgenza() + "\n";
            p = p.getLink();
        }
        return s;
    }
}
