package Pazienti;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Paziente mattia = new Paziente("Mattia Baritono", "rosso");
        System.out.println(l.aggiungiPaziente(mattia));
        System.out.println(l);
    }
}
