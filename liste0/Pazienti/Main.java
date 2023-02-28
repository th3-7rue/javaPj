package Pazienti;

public class Main {
    public static void main(String[] args) {
        Ospedale l = new Ospedale();
        Paziente mattia = new Paziente("Mattia Baritono", 3);
        Paziente j = new Paziente("Omar", 1);
        Paziente k = new Paziente("semo", 3);
        l.aggiungiPaziente(mattia);
        l.aggiungiPaziente(j);
        l.aggiungiPaziente(k);
        l.stampaLista();
        System.out.println(l.prossimoPaziente());
    }
}
