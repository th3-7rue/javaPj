class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.inserisciInTesta('f');
        l.inserisciInTesta('o');
        l.inserisciInTesta('a');
        l.inserisciInTesta('i');
        l.inserisciInTesta('c');
        System.out.println(l);
        l.scambiaCoppie();
        System.out.println(l);
    }
}