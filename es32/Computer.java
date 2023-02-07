package es32;

public class Computer {
    private int codice;
    private int anno;
    private float clockCPU, dimRAM, dimDisk, dimMonitor;
    private String marca, modello;

    public Computer(int codice, int anno, float clockCPU, float dimRAM, float dimDisk, float dimMonitor, String marca,
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

}
