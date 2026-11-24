package modelo;


/**
 * Write a description of class Servicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicio
{
    private double monto;
    
    public Servicio(){}
    
    public Servicio(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}