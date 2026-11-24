/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwin
 */
public class OperacionTerrestre extends OperacionMilitar {

    private String tipoTerreno;
    private int vehiculos;

    public OperacionTerrestre() {
    }

    public OperacionTerrestre(String tipoTerreno, int vehiculos, String codigo, String nombre, String fecha, Estado estado, int efectivos) {
        super(codigo, nombre, fecha, estado, efectivos);
        this.tipoTerreno = tipoTerreno;
        this.vehiculos = vehiculos;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public int getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(int vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public double calcularComplejidad() {
        return this.efectivos + (this.vehiculos * 5);
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Terreno: " + tipoTerreno
                + " | Vehiculos: " + vehiculos;
    }

}
