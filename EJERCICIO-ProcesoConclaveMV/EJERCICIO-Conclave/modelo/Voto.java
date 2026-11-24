package modelo;

public class Voto {
    private Cardenal votante;
    private Cardenal votado;

    public Voto(Cardenal votante, Cardenal votado) {
        this.votante = votante;
        this.votado = votado;
    }

    public Cardenal getVotante() { return votante; }
    public Cardenal getVotado() { return votado; }
}