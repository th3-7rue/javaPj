package es33;

public class Mailbox {
    private Nodo head;
    private int size;

    public Mailbox() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addEmail(Email email) {
        Nodo nuovoNodo = new Nodo(email);
        if (head == null) {
            head = nuovoNodo;
        } else {
            Nodo ultimoNodo = head;
            while (ultimoNodo.getLink() != null) {
                ultimoNodo = ultimoNodo.getLink();
            }
            ultimoNodo.setLink(nuovoNodo);
        }
        size++;
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

    public Email[] searchByKeyword(String keyword) {
        int size = countEmailsByKeyword(keyword);
        Email[] result = new Email[size];
        Nodo current = head;
        int i = 0;
        while (current != null) {
            if (current.getInfo().getOggetto().contains(keyword)) {
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


    private int countEmailsByKeyword(String keyword) {
        int count = 0;
        Nodo current = head;
        while (current != null) {
            if (current.getInfo().getOggetto().contains(keyword)) {
                count++;
            }
            current = current.getLink();
        }
        return count;
    }
    
    public boolean removeEmailAt(int position) {
        if (position < 0 || position >= size) {
            return false;
        }

        if (position == 0) {
            head = head.getLink();
            size--;
            return true;
        }

        Nodo prev = head;
        for (int i = 1; i < position; i++) {
            prev = prev.getLink();
        }

        Nodo curr = prev.getLink();
        prev.setLink(curr.getLink());
        size--;
        return true;
    }
}
