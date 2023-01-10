package esCC;

public class Main {
    public static void main(String[] args) {
        ContoCorrente c0 = new ContoCorrente(100, 1519618);
        c0.stampaSaldo();
        c0.preleva();
        c0.stampaSaldo();

        c0.versa();
        c0.stampaSaldo();

    }
}
