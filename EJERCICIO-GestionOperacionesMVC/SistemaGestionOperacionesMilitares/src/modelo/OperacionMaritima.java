/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwin
 */
public class OperacionMaritima extends OperacionMilitar {

    private int embarcaciones;
    private String area;

    public OperacionMaritima() {
    }

    public OperacionMaritima(int embarcaciones, String area, String codigo, String nombre, String fecha, Estado estado, int efectivos) {
        super(codigo, nombre, fecha, estado, efectivos);
        this.embarcaciones = embarcaciones;
        this.area = area;
    }

    public int getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(int embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public double calcularComplejidad() {
        return this.efectivos + (this.embarcaciones * 8);
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Embarcaciones: " + embarcaciones
                + " | Area: " + area;
    }

}
