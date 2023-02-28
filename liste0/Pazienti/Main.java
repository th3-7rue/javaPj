package Pazienti;

public class Main {
    public static void main(String[] args) {
        Ospedale l = new Ospedale();
        Paziente mattia = new Paziente("Mattia Baritono", 1);
        Paziente j = new Paziente("Omar", 3);
        l.aggiungiPaziente(mattia);
        l.aggiungiPaziente(j);
        l.stampaLista();
        System.out.println(l.prossimoPaziente());
    }
}
