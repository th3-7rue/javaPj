package es33;

public class Mailbox {
    private Nodo head;

    public Mailbox() {
        head = null;
    }

    public void addEmail(Email email) {
        Nodo newNode = new Nodo(email);
        if (head == null) {
            head = newNode;
        } else {
            Nodo current = head;
            while (current.getLink() != null) {
                current = current.getLink();
            }
            current.setLink(newNode);
        }
    }

    public Email[] getEmails() {
        int size = countEmails();
        Email[] emails = new Email[size];
        Nodo current = head;
        int i = 0;
        while (current != null) {
            emails[i] = current.getInfo();
            current = current.getLink();
            i++;
        }
        return emails;
    }

    public Email[] searchBySender(String sender) {
        int size = countEmailsBySender(sender);
        Email[] result = new Email[size];
        Nodo current = head;
        int i = 0;
        while (current != null) {
            if (current.getInfo().getMittente().equals(sender)) {
                result[i] = current.getInfo();
                i++;
            }
            current = current.getLink();
        }
        return result;
    }

    public Email[] searchByKeyword(String keyword) {
        int size = countEmailsByKeyword(keyword);
        Email[] result = new Email[size];
        Nodo current = head;
        int i = 0;
        while (current != null) {
            if (current.getInfo().getTesto().contains(keyword) || current.getInfo().getOggetto().contains(keyword)) {
                result[i] = current.getInfo();
                i++;
            }
            current = current.getLink();
        }
        return result;
    }

    private int countEmails() {
        int count = 0;
        Nodo current = head;
        while (current != null) {
            count++;
            current = current.getLink();
        }
        return count;
    }

    private int countEmailsBySender(String sender) {
        int count = 0;
        Nodo current = head;
        while (current != null) {
            if (current.getInfo().getMittente().equals(sender)) {
                count++;
            }
            current = current.getLink();
        }
        return count;
    }

    private int countEmailsByKeyword(String keyword) {
        int count = 0;
        Nodo current = head;
        while (current != null) {
            if (current.getInfo().getTesto().contains(keyword) || current.getInfo().getOggetto().contains(keyword)) {
                count++;
            }
            current = current.getLink();
        }
        return count;
    }
}
