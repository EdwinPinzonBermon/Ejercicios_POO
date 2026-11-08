package modelo;


/**
 * Write a description of class Bono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bono
{
    private double monto;
    
    public Bono(){}

    public Bono(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}