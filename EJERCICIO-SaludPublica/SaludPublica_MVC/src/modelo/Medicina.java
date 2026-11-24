package modelo;


/**
 * Write a description of class Medicina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medicina
{
    private double monto;
    
    public Medicina(){}
    
    public Medicina(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}