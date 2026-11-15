/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Evento {

    private String nombre;
    private String tipo;
    private Emocion emocion;
    private int nivelCambio;
    private String tipoCambio;

    public Evento() {
    }

    public Evento(String nombre, String tipo, Emocion emocion, int nivelCambio, String tipoCambio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.emocion = emocion;
        this.nivelCambio = nivelCambio;
        this.tipoCambio = tipoCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Emocion getEmocion() {
        return emocion;
    }

    public void setEmocion(Emocion emocion) {
        this.emocion = emocion;
    }

    public int getNivelCambio() {
        return nivelCambio;
    }

    public void setNivelCambio(int nivelCambio) {
        this.nivelCambio = nivelCambio;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @Override
    public String toString() {
        return nombre + "\n";
    }

}
