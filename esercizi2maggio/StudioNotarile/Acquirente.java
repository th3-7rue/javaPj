package esercizi2maggio.StudioNotarile;

public class Acquirente {
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String chiVende;
    private double renditaCatastale;
    private double prezzo;
    private double caparra;
    private boolean acquistoConMutuo;

    public Acquirente(String nome, String cognome, String email, String telefono,
            String chiVende, double renditaCatastale, double prezzo,
            double caparra, boolean acquistoConMutuo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.chiVende = chiVende;
        this.renditaCatastale = renditaCatastale;
        this.prezzo = prezzo;
        this.caparra = caparra;
        this.acquistoConMutuo = acquistoConMutuo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getChiVende() {
        return chiVende;
    }

    public double getRenditaCatastale() {
        return renditaCatastale;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getCaparra() {
        return caparra;
    }

    public boolean isAcquistoConMutuo() {
        return acquistoConMutuo;
    }

    @Override
    public String toString() {
        return "Acquirente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", chiVende='" + chiVende + '\'' +
                ", renditaCatastale=" + renditaCatastale +
                ", prezzo=" + prezzo +
                ", caparra=" + caparra +
                ", acquistoConMutuo=" + acquistoConMutuo +
                '}';
    }
}
