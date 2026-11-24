package modelo;

import java.util.ArrayList;

public class GestorRiesgos {
    private ArrayList<Riesgo> riesgos;

    public GestorRiesgos() {
        this.riesgos = new ArrayList<>();
    }

    public boolean agregarRiesgo(Riesgo r) {
        for (Riesgo riesgo : riesgos) {
            if (riesgo.getCodigo().equals(r.getCodigo())) {
                return false; 
            }
        }
        riesgos.add(r);
        return true;
    }

    public Riesgo buscarPorCodigo(String codigo) {
        for (Riesgo riesgo : riesgos) {
            if (riesgo.getCodigo().equals(codigo)) {
                return riesgo;
            }
        }
        return null;
    }

    public boolean eliminarRiesgo(String codigo) {
        Riesgo r = buscarPorCodigo(codigo);
        if (r != null) {
            riesgos.remove(r);
            return true;
        }
        return false;
    }

    public String listarRiesgos() {
        if (riesgos.isEmpty()) return "No hay riesgos registrados.";
        String resultado = "";
        for (Riesgo r : riesgos) {
            resultado += r.toString() + "\n\n";
        }
        return resultado;
    }
}