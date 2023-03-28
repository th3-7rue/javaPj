package toDoList;

import java.util.ArrayList;

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
}
