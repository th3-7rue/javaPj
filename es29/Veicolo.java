public class Veicolo {
    private String codice, targa, marca, modello;
    private int nPosti;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
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

    public Veicolo(String codice, String targa, String marca, String modello, int nPosti) {
        this.codice = codice;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.nPosti = nPosti;
    }

    @Override
    public String toString() {
        return "Veicolo [codice=" + codice + ", targa=" + targa + ", marca=" + marca + ", modello=" + modello
                + ", nPosti=" + nPosti + "]";
    }
}