package arrayList1;

import java.util.ArrayList;
import java.util.Random;

public class ListaStudenti {
    private ArrayList<Studente> l;

    public ListaStudenti() {
        l = new ArrayList<Studente>();
    }

    public void agginugiStudente(Studente studente) {
        l.add(studente);
    }

    public void assegnaVoti() {
        Random genera = new Random();
        int votoMax = 10;
        int votoMin = 1;
        for (Studente studente : l) {
            studente.setVoto1(genera.nextInt(votoMax - votoMin) + votoMin);
            studente.setVoto2(genera.nextInt(votoMax - votoMin) + votoMin);
            studente.setVoto3(genera.nextInt(votoMax - votoMin) + votoMin);
        }
    }

    public void stampa() {
        for (Studente studente : l) {
            System.out.println(studente);
        }
    }
}
