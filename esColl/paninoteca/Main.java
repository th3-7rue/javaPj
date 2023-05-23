package esColl.paninoteca;

public class Main {
    // main
    public static void main(String args[]) {
        // crea paninoteca
        Paninoteca paninoteca = new Paninoteca();
        // menu di scelta
        String scelta = null;
        do {
            System.out.println("1) Aggiungi panino");
            System.out.println("2) Stampa panini");
            System.out.println("3) Ordina per tipo pane");
            System.out.println("0) Esci");
            scelta = System.console().readLine();
            switch (scelta) {
                case "1":
                    paninoteca.aggiungiPanino();
                    break;
                case "2":
                    paninoteca.stampaPanini();
                    break;
                case "3":
                    paninoteca.ordinaPerTipoPane();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (!scelta.equals("0"));
    }
}
