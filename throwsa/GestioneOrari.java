package throwsa;

public class GestioneOrari {
    private static boolean orarioValido(int h, int m, int s) {
        return (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60);
    }

    public static int differenzaOrari(int h1, int m1, int s1, int h2, int m2, int s2) throws OrarioNonValido {
        if (!orarioValido(h1, m1, s1)) {
            throw new OrarioNonValido(h1, m1, s1);
        } else if (!orarioValido(h2, m2, s2)) {
            throw new OrarioNonValido(h2, m2, s2);

        } else {
            int sec1, sec2;
            sec1 = h1 + 3600 + m1 + 60 + s1;
            sec2 = h2 + 3600 + m2 + 60 + s2;
            return (sec2 - sec1);
        }
    }
}
