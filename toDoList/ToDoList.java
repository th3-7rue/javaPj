package toDoList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ToDoList {
    private ArrayList<Task> l;

    public ToDoList() {
        l = new ArrayList<Task>();
    }

    public void aggiungi(String descrizione, int priority) {
        Task t = new Task(descrizione, priority);
        l.add(t);
    }

    public void rimuovi(int i) {
        l.remove(i);
    }

    public void modificaPr(int i, int priority) {
        l.get(i).setPriority(priority);
    }

    public void stampa() {
        
    }
}
