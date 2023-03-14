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
        nuovo.setLink(head);
        if (head == null) {
            tail = nuovo;
        }
        head = nuovo;
        return "Persona aggiunta alla coda";
    }
}
