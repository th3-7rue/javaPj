import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autonoleggio v0 = new Autonoleggio();
        int scelta;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("0. Esci");
            System.out.println("1. Aggiungi un nuovo veicolo");
            System.out.println("2. Elimina un veicolo dal codice");
            System.out.println("3. Elimina un veicolo dalla targa");
            System.out.println("4. Ricerca di un veicolo dal codice");
            System.out.println("5. Ricerca di un veicolo dalla targa");
            System.out.println("6. Ricerca di tutti i veicoli con n posti");
            System.out.println("7. Salva inventario su file");
            System.out.println("8. Ripristina inventario da file");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta < 0 || scelta > 8) {
                System.out.println("Scelta non valida");
            }
            switch (scelta) {
                case 1:
                    System.out.println(v0.aggiungiVeicolo());
                    break;
                case 2:
                    System.out.println(v0.eliminaVeicoloCodice());
                    break;
                case 3:
                    System.out.println(v0.eliminaVeicoloTarga());
                    break;
                case 4:
                    System.out.println(v0.ricercaVeicoloCodice());
                    break;
                case 5:
                    System.out.println(v0.ricercaVeicoloTarga());
                    break;
                case 6:
                    System.out.println(v0.ricercaVeicoli_nPosti());
                    break;
                case 7:
                    System.out.println(v0.salvaSuFile());
                    break;
                case 8:
                    System.out.println(v0.ripristinaDaFile());
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
        scanner.close();

    }
}