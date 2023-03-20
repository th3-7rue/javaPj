package cinema;

import java.util.Scanner;

public class Coda {
    private Nodo head;
    private Nodo tail;

    public Coda() {
        head = null;
        tail = null;
    }

    public String addPersona() {
        System.out.print("Inserisci nome: ");
        Scanner t = new Scanner(System.in);
        String nome = t.nextLine();
        Persona p = new Persona(nome);
        Nodo nuovo = new Nodo(p);
        nuovo.setLink(null);
        if (head == null) {
            tail = nuovo;
            head = tail;
        } else {
            tail.setLink(nuovo);
            tail = nuovo;
        }
        return "Persona aggiunta alla coda";
    }

    public String rimuoviInTesta() {
        try {
            Nodo p = head;
            head = head.getLink();
            return p.getInfo().getNome() + " è stato rimosso";
        } catch (NullPointerException e) {
            return "Coda vuota";
        }
    }

    public String estraiProssimo() {
        try {
            Nodo p = head;
            head = head.getLink();
            return p.getInfo().getNome() + " è entrato";
        } catch (NullPointerException e) {
            return "Coda vuota";
        }
    }

    public String visualizzaLista() {
        String s = "Coda: \n";
        try {
            Nodo p = head;
            while (p != null) {
                s += p.getInfo() + "\n";
                p = p.getLink();
            }
            s += "Prossimo: " + head.getInfo();
        } catch (NullPointerException e) {
            s = "Coda vuota";
        }
        return s;
    }
}
