package coda;

public class Main {
    public static void main(String[] args) {
        Coda c = new Coda();
        Nodo a = new Nodo(0);
        Nodo b = new Nodo(1);
        c.enqueue(a);
        c.enqueue(b);
        System.out.println(c);
        System.out.println(c.dequeue());
    }
}
