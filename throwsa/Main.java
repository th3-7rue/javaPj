package throwsa;

public class Main {
    public static void main(String[] args) {
        try {
            int ss = GestioneOrari.differenzaOrari(0, 0, 0, 23, 59, 59);
            System.out.println("secondi di differenza " + ss);
        } catch (OrarioNonValido exception) {
            System.out.println(
                    "errore nell'orario specificato " + exception.getH() + exception.getM() + exception.getS());
        }
        try {
            int ss = GestioneOrari.differenzaOrari(0, 0, 0, 24, 0, 0);
            System.out.println("secondi di differenza : " + ss);
        } catch (OrarioNonValido exception) {
            System.out.println(
                    "errore nell'orario specificato " + exception.getH() + exception.getM() + exception.getS());
        }
    }
}
