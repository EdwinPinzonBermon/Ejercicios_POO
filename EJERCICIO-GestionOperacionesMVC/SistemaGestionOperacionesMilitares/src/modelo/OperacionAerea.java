/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author edwin
 */
public class OperacionAerea extends OperacionMilitar {

    private int aeronaves;
    private int horasVuelo;

    public OperacionAerea() {
    }

    public OperacionAerea(int aeronaves, int horasVuelo, String codigo, String nombre, String fecha, Estado estado, int efectivos) {
        super(codigo, nombre, fecha, estado, efectivos);
        this.aeronaves = aeronaves;
        this.horasVuelo = horasVuelo;
    }

    public int getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(int aeronaves) {
        this.aeronaves = aeronaves;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    @Override
    public double calcularComplejidad() {
        return this.efectivos + (this.aeronaves * 10) + this.horasVuelo;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Aeronaves: " + aeronaves
                + " | Horas Vuelo: " + horasVuelo;
    }

}
