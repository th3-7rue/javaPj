package Pazienti;

public class Lista {
    private Nodo head;

    public Lista() {
        head = null;
    }

    public String aggiungiPaziente(Paziente paziente) {

        elementi++;
        return "Il paziente " + paziente.getNome() + " e' stato aggiunto con urgenza di tipo " + paziente.getUrgenza();
    }
}
