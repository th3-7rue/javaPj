package es30;

import java.io.Serializable;

public class Barca implements Serializable {
    private String nome, nazionalita, tipologia;
    private float lunghezza, stazza;

    public Barca(String nome, String nazionalita, String tipologia, float lunghezza, float stazza) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.tipologia = tipologia;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
    }

    @Override
    public String toString() {
        return "Barca [nome=" + nome + ", nazionalita=" + nazionalita + ", tipologia=" + tipologia + ", lunghezza="
                + lunghezza + ", stazza=" + stazza + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    public float getStazza() {
        return stazza;
    }

    public void setStazza(float stazza) {
        this.stazza = stazza;
    }

}
