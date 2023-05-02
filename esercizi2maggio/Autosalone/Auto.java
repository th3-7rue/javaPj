package esercizi2maggio.Autosalone;
    
public class Auto {
    private double cilindrata;
    private double prezzo;

    public Auto(double cilindrata, double prezzo) {
        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
