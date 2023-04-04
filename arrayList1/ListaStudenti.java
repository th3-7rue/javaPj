package arrayList1;

import java.util.ArrayList;
import java.util.Iterator;
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
            studente.setVoto1(genera.nextInt(votoMax - votoMin + 1) + votoMin);
            studente.setVoto2(genera.nextInt(votoMax - votoMin + 1) + votoMin);
            studente.setVoto3(genera.nextInt(votoMax - votoMin + 1) + votoMin);
        }
    }

    public float calcolaMedia(Studente studente) {
        return (studente.getVoto1() + studente.getVoto2() + studente.getVoto3()) / 3;
    }

    public void rimuoviInsufficienti() {
        Iterator<Studente> iterator = l.iterator();
        while (iterator.hasNext()) {
            Studente studente = iterator.next();
            if (calcolaMedia(studente) < 6) {
                iterator.remove();
            }
        }
    }

    public void stampa() {
        for (Studente studente : l) {
            System.out.println(studente);
        }
    }
}
