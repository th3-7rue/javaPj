package arrayList1;

public class Main {
    public static void main(String[] args) {
        ListaStudenti l = new ListaStudenti();
        Studente s1 = new Studente("Mario", "Rossi");
        Studente s2 = new Studente("Luca", "Bianchi");
        Studente s3 = new Studente("Giovanni", "Verdi");
        Studente s4 = new Studente("Maria", "Neri");
        Studente s5 = new Studente("Lucia", "Gialli");

        l.assegnaVoti();
        l.stampa();
    }
}
