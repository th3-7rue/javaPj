import java.util.Scanner;

public class Autonoleggio {
    private Veicolo[] v;

    private int codice = 1;

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
        System.out.println("Inserisci posizione: ");
        int posizione = Integer.parseInt(scanner.nextLine());

        if (posizione >= 0 && posizione < 1000) {
            v[codice] = new Veicolo(targa, marca, modello, nPosti, codice, posizione);
            codice++;
            return 0;
        }
        return -1;
    }

    public int ricercaVeicoloTarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci targa: ");
        String targa = scanner.nextLine();

        for (int i = 0; i < v.length; i++) {
            if (v[i].getTarga() == targa) {
                System.out.println(v[i]);
                return 0;
            }
        }
        return -1;

    }

    public int eliminaVeicoloTarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci targa: ");
        String targa = scanner.nextLine();

        for (int i = 0; i < v.length; i++) {
            if (v[i].getTarga() == targa) {
                v[i] = null;
                return 0;
            }
        }
        return -1;
    }

    public int ricercaVeicoloCodice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci codice: ");
        int codice = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < v.length; i++) {
            if (v[i].getCodice() == codice) {
                System.out.println(v[i]);
                return 0;
            }
        }
        return -1;

    }

    public int eliminaVeicoloCodice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci codice: ");
        int codice = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < v.length; i++) {
            if (v[i].getCodice() == codice) {
                v[i] = null;
                return 0;
            }
        }

        return -1;
    }

}
