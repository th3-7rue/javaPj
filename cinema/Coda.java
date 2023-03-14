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
        head = head.getLink();
        return "Persona in testa rimossa";
    }

    public String estraiProssimo() {
        Nodo p = tail;
        head = head.getLink();
        return p.getInfo().getNome() + " è entrato";
    }

    public String visualizzaLista() {
        Nodo p = head;
        String s = "Coda: ";
        while (p != null) {
            s += p.getInfo() + "\n";
            p = p.getLink();
        }
        s += "Prossimo: " + head.getInfo();
        return s;
    }
}
