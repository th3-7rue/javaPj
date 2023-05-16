package esercizi2maggio.Calciatori;

/*Scrivere un programma in Java che permetta di gestire i dati relativi ad una squadra di calcio. Ogni calciatore è identificato da nome, cognome, numero di maglia e ruolo. Gli attaccanti hanno maglie con numeri compresi tra 7 e 11, i centrocampisti hanno maglie con numeri compresi tra 4 e 6, i difensori hanno maglie con numeri compresi tra 1 e 3.

Il programma deve consentire di inserire i dati dei calciatori della squadra (in un ArrayList), di visualizzarli e di effettuare alcuni calcoli. In particolare, il programma deve calcolare:

· Il totale dei goal segnati dalla squadra, suddivisi per ruolo:

o attaccanti,

o centrocampisti,

o difensori.

· Il totale dei goal subiti dalla squadra.

Il programma deve prevedere un menu di scelta per l'utente, che permetta di selezionare l'operazione da eseguire. */
public class Calciatore {
    private String nome, cognome;
    private char ruolo;
    private int numeroMaglia, goalSegnati;

    public Calciatore(String nome, String cognome, char ruolo, int numeroMaglia) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroMaglia = numeroMaglia;
        this.ruolo = ruolo;
        this.goalSegnati = 0;
    }

    public char getRuolo() {
        return ruolo;
    }

    public void setRuolo(char ruolo) {
        this.ruolo = ruolo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }

    public int getGoalSegnati() {
        return goalSegnati;
    }

    public void setGoalSegnati(int goalSegnati) {
        this.goalSegnati = goalSegnati;
    }

    public void segnaGoal() {
        goalSegnati++;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " " +
                "Cognome: " + cognome + " " +
                "Numero maglia: " + numeroMaglia + " " +
                "Ruolo: " + ruolo + " " +
                "Goal segnati: " + goalSegnati;
    }

}
