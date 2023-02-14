package liste0;

public class Lista {
    private Nodo head;
    private int elementi;

    public Lista() {
        head = null;
        elementi = 0;
    }

    public String aggiungiPaziente(Paziente paziente) {

        elementi++;
        return "Il paziente " + paziente.getNome() + " e' stato aggiunto con urgenza di tipo " + paziente.getUrgenza();
    }
}
