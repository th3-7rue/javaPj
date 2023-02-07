package es32;
import java.io.Serializable;
public class Computer implements Serializable{
    private int codice;
    private int anno;
    private double clockCPU, dimRAM, dimDisk, dimMonitor;
    private String marca, modello;

    public Computer(int codice, int anno, double clockCPU, double dimRAM, double dimDisk, double dimMonitor, String marca,
            String modello) {
        this.codice = codice;
        this.anno = anno;
        this.clockCPU = clockCPU;
        this.dimRAM = dimRAM;
        this.dimDisk = dimDisk;
        this.dimMonitor = dimMonitor;
        this.marca = marca;
        this.modello = modello;
    }

    public int getCodice() {
        return codice;
    }

    public int getAnno() {
        return anno;
    }

    public double getClockCPU() {
        return clockCPU;
    }

    public double getDimRAM() {
        return dimRAM;
    }

    public double getDimDisk() {
        return dimDisk;
    }

    public double getDimMonitor() {
        return dimMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    @Override
    public String toString() {
        return "Computer [codice=" + codice + ", anno=" + anno + ", clockCPU=" + clockCPU + ", dimRAM=" + dimRAM
                + ", dimDisk=" + dimDisk + ", dimMonitor=" + dimMonitor + ", marca=" + marca + ", modello=" + modello
                + "]";
    }

}
