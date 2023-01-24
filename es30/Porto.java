package es30;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Porto {
    private Barca[] b;
    private int DIM = 100;

    public Porto() {
        b = new Barca[DIM];
    }

    public void assegnaPosto() {
        int posto = -1;
        try {
            Scanner tastiera = new Scanner(System.in);
            System.out.print("Inserisci nome: ");
            String nome = tastiera.nextLine();
            System.out.print("Inserisci nazionalita': ");
            String nazionalita = tastiera.nextLine();
            System.out.print("Inserisci lunghezza: ");
            float lunghezza = tastiera.nextFloat();
            System.out.print("Inserisci stazza: ");
            float stazza = tastiera.nextFloat();
            System.out.print("Inserisci tipologia: ");
            String tipologia = tastiera.next();

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
        } catch (ArrayStoreException | InputMismatchException e) {
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
                costoAffitto = giorni * 10 * b[posto].getLunghezza();
            } else {
                costoAffitto = giorni * 20 * b[posto].getStazza();
            }
            b[posto] = null;
            System.out.println("L'importo dell'affitto e' " + costoAffitto);
            System.out.println("Il posto " + posto + " e' stato liberato");
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Posto non valido");
        } catch (NullPointerException e) {
            System.out.println("Il posto non e' occupato");
        }

    }

    public void ricerca() {
        Scanner t = new Scanner(System.in);
        try {
            System.out.print("Inserisci posto: ");
            int posto = t.nextInt();
            System.out.println(b[posto]);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Posto non valido");
        } catch (NullPointerException e) {
            System.out.println("Il posto non e' occupato");
        }
    }

    public void salva() {
        Scanner scanner = new Scanner(System.in);
        String nomeFile;
        System.out.println("Come vuoi chiamare il file? ");
        nomeFile = scanner.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile + ".txt"))) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] != null) {
                    bw.write(b[i].toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // salvataggio su file dat
        try (FileOutputStream fos = new FileOutputStream(nomeFile + ".dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(b);
            System.out.println("Inventario salvato con successo");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Errore");
        }

    }

    public void arrayNaz() {
        
    }

    public void ripristina() {
        String nomeFile;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Da quale file vuoi effettuare il ripristino? ");
        nomeFile = scanner.nextLine() + ".dat";
        try (FileInputStream fis = new FileInputStream(nomeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
            b = (Barca[]) ois.readObject();
            System.out.println("Ripristino effettuato con successo");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Il file indicato non esiste");
        }

    }
}
