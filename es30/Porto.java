package es30;

import java.util.Scanner;

public class Porto {
    private Barca[] b;
    private int DIM = 100;

    public Porto() {
        b = new Barca[DIM];
    }

    public void assegnaPosto() {
        int posto = -1;
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
            if (tipologia.equals("vela")) {
                int i = 50;
                int cont = 0;
                while (cont < DIM) {
                    if (b[i] == null) {
                        posto = i;
                        break;
                    } else {
                        cont++;
                        i++;
                        if (i >= DIM) {
                            if (lunghezza <= 10)
                                i = 0;
                            else
                                i = 20;
                        }
                    }

                }

            } else if (lunghezza > 10) {
                for (int j = 20; j < DIM; j++) {
                    if (b[j] == null) {
                        posto = j;
                        break;
                    }
                }

            } else {
                for (int j = 0; j < DIM; j++) {
                    if (b[j] == null) {
                        posto = j;
                        break;
                    }
                }
            }
            if (posto < 0) {
                throw new IllegalArgumentException("Nessun posto disponibile");
            }
            b[posto] = new Barca(nome, nazionalita, tipologia, lunghezza, stazza);
            System.out.println("Alla barca e' stato assegnato il posto " + posto);
        } catch (ArrayStoreException e) {
            System.out.println("Errore: uno o piu' dati non validi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: posizione non valida");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void liberaPosto() {
        Scanner t = new Scanner(System.in);
        try {
            System.out.print("Inserisci il posto da liberare: ");
            int posto = t.nextInt();
            System.out.print("Inserisci i giorni di sosta: ");
            int giorni = t.nextInt();
            float costoAffitto;
            if (b[posto].getTipologia().equals("vela")) {
                costoAffitto = 10 * b[posto].getLunghezza();
            } else {
                costoAffitto = 20 * b[posto].getStazza();
            }
            b[posto] = null;
            System.out.println("L'importo dell'affitto e' " + costoAffitto);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posto non valido");
        }

    }
}
