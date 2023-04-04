package arrayList1;

public class Main {
    public static void main(String[] args) {
        ListaStudenti l = new ListaStudenti();
        Studente s1 = new Studente("Mario", "Rossi");
        Studente s2 = new Studente("Luca", "Bianchi");
        Studente s3 = new Studente("Giovanni", "Verdi");
        Studente s4 = new Studente("Maria", "Neri");
        Studente s5 = new Studente("Lucia", "Gialli");
        l.agginugiStudente(s1);
        l.agginugiStudente(s2);
        l.agginugiStudente(s3);
        l.agginugiStudente(s4);
        l.agginugiStudente(s5);

        l.assegnaVoti();
        l.rimuoviInsufficienti();
        l.stampa();
    }
}
