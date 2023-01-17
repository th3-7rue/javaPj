package throwsa;

public class OrarioNonValido extends Exception {
    private int h, m, s;

    public OrarioNonValido(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String toString() {
        return "OrarioNonValido{" +
                "h=" + h +
                ", m=" + m +
                ", s=" + s +
                '}';
    }
}
