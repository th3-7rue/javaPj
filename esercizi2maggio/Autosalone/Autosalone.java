package esercizi2maggio.Autosalone;

import java.util.ArrayList;
import java.util.Iterator;

public class Autosalone {
    private ArrayList<Auto> listaAuto = new ArrayList<>();

    public void aggiungiAuto(double cilindrata, double prezzo) {
        listaAuto.add(new Auto(cilindrata, prezzo));
    }

    public double calcolaPercentuale() {
        double totale = listaAuto.size();
        double count = 0;
        Iterator<Auto> iterator = listaAuto.iterator();

        while (iterator.hasNext()) {
            Auto auto = iterator.next();
            if (auto.getCilindrata() >= 1.5 && auto.getCilindrata() <= 2.0) {
                count++;
            }
        }

        return (count / totale) * 100;
    }

    public double calcolaMediaPrezzo() {
        double sum = 0;
        double count = 0;
        Iterator<Auto> iterator = listaAuto.iterator();

        while (iterator.hasNext()) {
            Auto auto = iterator.next();
            if (auto.getCilindrata() >= 1.5 && auto.getCilindrata() <= 2.0) {
                sum += auto.getPrezzo();
                count++;
            }
        }

        return sum / count;
    }
}
