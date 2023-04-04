package arrayList1;

public class Studente {
    private String nome, cognome;
    private int voto1, voto2, voto3;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getVoto1() {
        return voto1;
    }

    public int getVoto2() {
        return voto2;
    }

    public int getVoto3() {
        return voto3;
    }

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void setVoto1(int voto1) {
        this.voto1 = voto1;
    }

    public void setVoto2(int voto2) {
        this.voto2 = voto2;
    }

    public void setVoto3(int voto3) {
        this.voto3 = voto3;
    }

    @Override
    public String toString() {
        return "Studente [nome=" + nome + ", cognome=" + cognome + ", voto1=" + voto1 + ", voto2=" + voto2 + ", voto3="
                + voto3 + "]";
    }

}
