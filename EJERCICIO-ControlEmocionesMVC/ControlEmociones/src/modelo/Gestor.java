/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Gestor {

    private ArrayList<Emocion> emociones;
    private ArrayList<Recuerdo> recuerdos;
    private ArrayList<Evento> eventos;

    public Gestor() {
        emociones = new ArrayList<>();
        recuerdos = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public boolean agregarEmocion(Emocion emocion) {
        for (Emocion e : emociones) {
            if (e.getNombre().equals(emocion.getNombre())) {
                return false;
            }
        }
        emociones.add(emocion);
        return true;
    }

    public boolean agregarRecuerdo(Recuerdo recuerdo) {
        for (Recuerdo r : recuerdos) {
            if (recuerdo.getDescripcion().equals(r.getDescripcion())) {
                return false;
            }
        }
        recuerdos.add(recuerdo);
        return true;
    }

    public boolean agregarEvento(Evento evento) {
        for (Evento e : eventos) {
            if (e.getNombre().equals(evento.getNombre())) {
                return false;
            }
        }
        eventos.add(evento);
        return true;
    }

    public String listarRecuerdos(Emocion emocion) {
        StringBuilder sb = new StringBuilder();
        for (Recuerdo recuerdo : recuerdos) {
            if (recuerdo.getEmocion().getNombre().equals(emocion.getNombre())) {
                sb.append(recuerdo.toString());
            }
        }
        return sb.toString();
    }

    public Emocion hallarEmocionMasIntensa() {
        int mayor = 0;
        Emocion emocionMayor = null;
        for (Emocion emocion : emociones) {
            if (emocion.getIntensidad() > mayor) {
                mayor = emocion.getIntensidad();
                emocionMayor = emocion;
            }
        }
        return emocionMayor;
    }

    public double calcularPromedio() {
        double suma = 0.0;
        double cantidad = 0.0;
        for (Emocion emocion : emociones) {
            if (emocion.getTipo().equals("Positiva")) {
                suma += emocion.getIntensidad();
            } else {
                suma -= emocion.getIntensidad();
            }
            cantidad++;
        }
        return suma / cantidad;
    }
    
    public String enlistarUltimos5Recuerdos(){
        StringBuilder sb = new StringBuilder();
        if(recuerdos.size()>5){
            for(int i = recuerdos.size() - 1 ; i >= recuerdos.size() -5 ;i--){
                sb.append(recuerdos.get(i).toString());
            }
        }else{
            for(Recuerdo recuerdo: recuerdos){
                sb.append(recuerdo.toString());
            }
        }
        return sb.toString();
    }

}
