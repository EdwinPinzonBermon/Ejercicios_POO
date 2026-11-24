package modelo;

import java.util.ArrayList;

public class Conclave {
    private ArrayList<Cardenal> cardenales;
    private ArrayList<Cardenal> electores;
    private ArrayList<Ronda> rondas;
    private Ronda rondaActual;
    private Cardenal papaElegido;
    private int votosRequeridos;

    public Conclave() {
        cardenales = new ArrayList<>();
        electores = new ArrayList<>();
        rondas = new ArrayList<>();
        papaElegido = null;
        cargarCardenales();
        calcularVotosRequeridos();
        iniciarNuevaRonda();
    }

    private void cargarCardenales() {
        cardenales.add(new Cardenal("001", "Pietro Parolin", "Italia", 69, TipoCardenal.OBISPO));
        cardenales.add(new Cardenal("002", "Luis Antonio Tagle", "Filipinas", 67, TipoCardenal.OBISPO));
        cardenales.add(new Cardenal("003", "Gerhard Ludwig Müller", "Alemania", 77, TipoCardenal.OBISPO));
        cardenales.add(new Cardenal("004", "Fernando Filoni", "Italia", 78, TipoCardenal.DIACONO));
        cardenales.add(new Cardenal("005", "Robert Sarah", "Guinea", 79, TipoCardenal.DIACONO));
        cardenales.add(new Cardenal("006", "Christoph Schönborn", "Austria", 79, TipoCardenal.OBISPO));
        cardenales.add(new Cardenal("007", "Juan Luis Cipriani", "Perú", 79, TipoCardenal.OBISPO));
        cardenales.add(new Cardenal("008", "Óscar Rodríguez Maradiaga", "Honduras", 78, TipoCardenal.PRESBITERO));
        // No electores
        cardenales.add(new Cardenal("009", "Marc Ouellet", "Canadá", 80, TipoCardenal.OBISPO));
        cardenales.add(new Cardenal("010", "Angelo Scola", "Italia", 82, TipoCardenal.PRESBITERO));
        cardenales.add(new Cardenal("011", "Norberto Rivera Carrera", "México", 81, TipoCardenal.PRESBITERO));
        cardenales.add(new Cardenal("012", "Rubén Salazar Gómez", "Colombia", 81, TipoCardenal.PRESBITERO));

        for (Cardenal c : cardenales) {
            if (c.esElector()) {
                electores.add(c);
            }
        }
    }

    private void calcularVotosRequeridos() {
        votosRequeridos = (int) Math.ceil(electores.size() * 2.0 / 3.0);
    }

    public void iniciarNuevaRonda() {
        int numeroRonda = rondas.size() + 1;
        rondaActual = new Ronda(numeroRonda);
        rondas.add(rondaActual);
    }

    private boolean esElector(Cardenal c) {
        for (Cardenal e : electores) {
            if (e.getCedula().equals(c.getCedula())) {
                return true;
            }
        }
        return false;
    }

    public boolean registrarVoto(Cardenal votante, Cardenal votado) {
        if (papaElegido != null) return false;
        if (!esElector(votante)) return false;
        if (rondaActual.yaVoto(votante)) return false;
        if (rondaActual.estaCompleta(electores.size())) return false;
        if (votado == null) return false;

        Voto voto = new Voto(votante, votado);
        rondaActual.agregarVoto(voto);
        return true;
    }

    public boolean rondaCompleta() {
        return rondaActual.estaCompleta(electores.size());
    }

    public boolean verificarMayoria() {
        if (!rondaCompleta()) return false;
        Cardenal ganador = rondaActual.getGanador();
        if (ganador == null) return false;
        if (rondaActual.getVotos(ganador) >= votosRequeridos) {
            papaElegido = ganador;
            return true;
        }
        return false;
    }

    public void siguienteRonda() {
        if (papaElegido == null) {
            iniciarNuevaRonda();
        }
    }

    public String getResultadosRonda() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ronda ").append(rondaActual.getNumero())
          .append(" - Día ").append(rondaActual.getDia())
          .append(" (").append(rondaActual.getJornada()).append(")\n");
        sb.append("Votos requeridos: ").append(votosRequeridos).append("\n");
        sb.append("----------------------------------------\n");
        ArrayList<String> conteo = rondaActual.getConteoVotos();
        if (conteo.isEmpty()) {
            sb.append("Aún no hay votos registrados.\n");
        } else {
            for (String linea : conteo) {
                sb.append(linea).append("\n");
            }
        }
        sb.append("----------------------------------------\n");
        if (papaElegido != null) {
            sb.append("¡HAY NUEVO PAPA!\n");
            sb.append("Nombre: ").append(papaElegido.getNombre()).append("\n");
            sb.append("País: ").append(papaElegido.getPais()).append("\n");
            sb.append("Edad: ").append(papaElegido.getEdad()).append(" años\n");
        } else if (rondaCompleta()) {
            sb.append("No hay papa aún. Se requiere otra ronda.\n");
        }
        return sb.toString();
    }

    // Getters
    public ArrayList<Cardenal> getCardenales() { return cardenales; }
    public ArrayList<Cardenal> getElectores() { return electores; }
    public ArrayList<Ronda> getRondas() { return rondas; }
    public Ronda getRondaActual() { return rondaActual; }
    public Cardenal getPapaElegido() { return papaElegido; }
    public int getVotosRequeridos() { return votosRequeridos; }
    public int getTotalElectores() { return electores.size(); }
    public boolean isPapaElegido() { return papaElegido != null; }
    public ArrayList<Cardenal> getCardenalesDisponiblesParaVotar() { return cardenales; }
}