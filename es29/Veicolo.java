public class Veicolo {
    private String targa, marca, modello;
    private int nPosti, codice = 0;

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", nPosti=" + nPosti
                + ", codice=" + codice + "]";
    }

    public Veicolo(String targa, String marca, String modello, int nPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.nPosti = nPosti;
        codice++;
    }

    public int eliminaVeicolo(int myCodice) {
        for (int i = 0; i < v.length; i++) {

        }
    }

    public int getCodice() {
        return codice;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

}