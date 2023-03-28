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
        // Ordina la lista in base alla priority decrescente
        Collections.sort(l, new Comparator<Task>() {
            public int compare(Task t1, Task t2) {
                return Integer.compare(t2.getPriority(), t1.getPriority());
            }
        });

        // Stampa gli elementi della lista ordinata
        for (Task t : l) {
            System.out.println(t.toString());
        }
    }
}
