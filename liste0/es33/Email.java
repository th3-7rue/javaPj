package es33;

public class Email {
    private String mittente, oggetto, testo;
    private String dataEora;

    public Email(String mittente, String oggetto, String testo, String dataEora) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.testo = testo;
        this.dataEora = dataEora;
    }

    public Email(Email email) {
        this.mittente = email.mittente;
        this.oggetto = email.oggetto;
        this.testo = email.testo;
        this.dataEora = email.dataEora;

    }
}
