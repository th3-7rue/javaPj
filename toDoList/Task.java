package toDoList;

public class Task {
    private String descrizione;
    private int priority;

    public String getDescrizione() {
        return descrizione;
    }

    public int getPriority() {
        return priority;
    }

    public Task(String descrizione, int priority) {
        this.descrizione = descrizione;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task [descrizione=" + descrizione + ", priority=" + priority + "]";
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
