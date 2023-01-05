import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // come fare l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();
        int inputInt = scanner.nextInt();
        double inputDouble = scanner.nextDouble();
        boolean inputBoolean = scanner.nextBoolean();
        System.out.println("Hai inserito: " + inputString);
    }
}