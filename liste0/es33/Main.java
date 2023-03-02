package es33;

public class Main {
    public static void main(String[] args) {
        // crea una nuova casella di posta
        Mailbox mailbox = new Mailbox();

        // crea e aggiungi alcune email
        Email email1 = new Email("mario@example.com", "Saluti", "Ciao Mario,\n\nCome stai?\n\nSaluti,\nLuigi",
                "2022-01-01 12:00:00");
        mailbox.addEmail(email1);

        Email email2 = new Email("luigi@example.com", "Re: Saluti",
                "Ciao Luigi,\n\nSto bene, grazie! E tu?\n\nSaluti,\nMario", "2022-01-02 10:00:00");
        mailbox.addEmail(email2);

        Email email3 = new Email("peppe@example.com", "Domanda",
                "Ciao Peppe,\n\nVolevo chiederti se hai visto il film che ti ho consigliato la scorsa settimana.\n\nA presto,\nGiuseppe",
                "2022-01-03 15:00:00");
        mailbox.addEmail(email3);

        Email email4 = new Email("maria@example.com", "Progetto",
                "Ciao Maria,\n\nVolevo sapere come sta procedendo il nostro progetto.\n\nA presto,\nGiovanni",
                "2022-01-04 16:00:00");
        mailbox.addEmail(email4);

        // stampa tutte le email presenti nella casella di posta
        System.out.println("Tutte le email:");
        Email[] allEmails = mailbox.getEmails();
        for (Email email : allEmails) {
            System.out.println(email);
        }

        // cerca le email inviate da "mario@example.com"
        System.out.println("\nEmail inviate da mario@example.com:");
        Email[] marioEmails = mailbox.searchBySender("mario@example.com");
        for (Email email : marioEmails) {
            System.out.println(email);
        }

        // cerca le email che contengono la parola "progetto"
        System.out.println("\nEmail che contengono la parola \"progetto\":");
        Email[] progettoEmails = mailbox.searchByKeyword("progetto");
        for (Email email : progettoEmails) {
            System.out.println(email);
        }
    }

}
