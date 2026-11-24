/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwin
 */
public abstract class OperacionMilitar {

    protected String codigo;
    protected String nombre;
    protected String fecha;
    protected Estado estado;
    protected int efectivos;
    protected int nivelComplejidad;

    public OperacionMilitar() {
    }

    public OperacionMilitar(String codigo, String nombre, String fecha, Estado estado, int efectivos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
        this.efectivos = efectivos;
        this.nivelComplejidad = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getEfectivos() {
        return efectivos;
    }

    public void setEfectivos(int efectivos) {
        this.efectivos = efectivos;
    }

    public int getNivelComplejidad() {
        return nivelComplejidad;
    }

    public void setNivelComplejidad(int nivelComplejidad) {
        this.nivelComplejidad = nivelComplejidad;
    }

    public abstract double calcularComplejidad();

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + " | Nombre: " + nombre
                + " | Fecha: " + fecha
                + " | Estado: " + estado
                + " | Efectivos: " + efectivos;
    }

}
