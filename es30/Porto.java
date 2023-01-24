package es30;

import java.util.Scanner;

public class Porto {
    private Barca[] b;

    public Porto() {
        b = new Barca[100];
    }

    public void assegnaPosto() {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci nome: ");
        String nome = tastiera.nextLine();
        System.out.print("Inserisci nazionalita': ");
        String nazionalita = tastiera.nextLine();
        System.out.print("Inserisci lunghezza: ");
        float lunghezza = Float.parseFloat(tastiera.nextLine());
        System.out.print("Inserisci stazza: ");
        float stazza = Float.parseFloat(tastiera.nextLine());
        System.out.print("Inserisci tipologia: ");
        String tipologia = tastiera.nextLine();
        try {
            b[posto] = new Barca(nome, nazionalita, tipologia, lunghezza, stazza);
        } catch (ArrayStoreException e) {
            System.out.println("Errore: uno o piu' dati non validi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: posizione non valida");
        }
    }
}
