public class Veicolo {
    private String targa, marca, modello;
    private int nPosti, codice, posizione;

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", nPosti=" + nPosti
                + ", codice=" + codice + "]";
    }

    public Veicolo(String targa, String marca, String modello, int nPosti, int codice, int posizione) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.nPosti = nPosti;
        this.codice = codice;
        this.posizione = posizione;
    }

    public int getCodice() {
        return codice;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getnPosti() {
        return nPosti;
    }

}