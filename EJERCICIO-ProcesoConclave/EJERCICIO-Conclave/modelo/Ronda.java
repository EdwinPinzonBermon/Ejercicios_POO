package modelo;

import java.util.ArrayList;

public class Ronda {
    private int numero;
    private String jornada;
    private int dia;
    private ArrayList<Voto> votos;

    public Ronda(int numero) {
        this.numero = numero;
        this.votos = new ArrayList<>();
        calcularJornadaYDia();
    }

    private void calcularJornadaYDia() {
        this.dia = (numero - 1) / 4 + 1;
        int posicionEnDia = (numero - 1) % 4;
        this.jornada = (posicionEnDia < 2) ? "Mañana" : "Tarde";
    }

    public void agregarVoto(Voto voto) {
        votos.add(voto);
    }

    public boolean estaCompleta(int totalElectores) {
        return votos.size() >= totalElectores;
    }

    public boolean yaVoto(Cardenal elector) {
        for (Voto v : votos) {
            if (v.getVotante().getCedula().equals(elector.getCedula())) {
                return true;
            }
        }
        return false;
    }

    public int getVotos(Cardenal cardenal) {
        int cont = 0;
        for (Voto v : votos) {
            if (v.getVotado().getCedula().equals(cardenal.getCedula())) {
                cont++;
            }
        }
        return cont;
    }

    public Cardenal getGanador() {
        if (votos.isEmpty()) return null;
        Cardenal ganador = votos.get(0).getVotado();
        int maxVotos = getVotos(ganador);
        for (Voto v : votos) {
            Cardenal candidato = v.getVotado();
            int votosCandidato = getVotos(candidato);
            if (votosCandidato > maxVotos) {
                maxVotos = votosCandidato;
                ganador = candidato;
            }
        }
        return ganador;
    }

    public ArrayList<String> getConteoVotos() {
        ArrayList<String> resumen = new ArrayList<>();
        ArrayList<Cardenal> yaContados = new ArrayList<>();
        for (Voto v : votos) {
            Cardenal c = v.getVotado();
            boolean contado = false;
            for (Cardenal yc : yaContados) {
                if (yc.getCedula().equals(c.getCedula())) {
                    contado = true;
                    break;
                }
            }
            if (!contado) {
                yaContados.add(c);
                int total = getVotos(c);
                resumen.add(c.getNombre() + ": " + total + " votos");
            }
        }
        return resumen;
    }

    public int getNumero() { return numero; }
    public String getJornada() { return jornada; }
    public int getDia() { return dia; }
    public ArrayList<Voto> getVotos() { return votos; }
}