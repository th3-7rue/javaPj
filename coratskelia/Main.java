package coratskelia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c;
        Scanner t = new Scanner(System.in);
        int[] z = new int[5];
        try {
            c = t.nextInt();
            System.out.println(z[c].toString());
            if (c < 0) {
                throw new IllegalArgumentException("Stupido");
            } else if (c > 5) {
                throw new IllegalArgumentException("coglione");
            }
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("diocane");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
