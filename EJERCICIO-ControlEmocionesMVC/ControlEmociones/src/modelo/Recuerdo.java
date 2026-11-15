/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Recuerdo {

    private Emocion emocion;
    private String descripcion;
    private String fecha;
    private Evento evento;

    public Recuerdo() {
    }

    public Recuerdo(Emocion emocion, String descripcion, String fecha, Evento evento) {
        this.emocion = emocion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.evento = evento;
    }

    public Emocion getEmocion() {
        return emocion;
    }

    public void setEmocion(Emocion emocion) {
        this.emocion = emocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "descripcion: " + descripcion + "\n fecha: " + fecha + "\n evento: " + evento + "\n";
    }

}
