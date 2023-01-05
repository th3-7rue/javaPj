import java.util.Scanner;

public class Autonoleggio {
    private Veicolo[] v;

    private int codice = 0;

    public Autonoleggio() {
        v = new Veicolo[1000];
    }

    public int aggiungiVeicolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci targa: ");
        String targa = scanner.nextLine();
        System.out.println("Inserisci marca: ");
        String marca = scanner.nextLine();
        System.out.println("Inserisci modello: ");
        String modello = scanner.nextLine();
        System.out.println("Inserisci numero di posti: ");
        int nPosti = Integer.parseInt(scanner.nextLine());
        if (codice >= 0 && codice <= 1000) {
            v[codice] = new Veicolo(targa, marca, modello, nPosti, codice);
            codice++;
            return 0;
        }
        return 0;
    }
}
