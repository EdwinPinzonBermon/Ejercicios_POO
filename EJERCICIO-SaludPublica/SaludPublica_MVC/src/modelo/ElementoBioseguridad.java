package modelo;


/**
 * Write a description of class ElementoBioseguridad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElementoBioseguridad
{
    private double monto;
    
    public ElementoBioseguridad(){}
    
    public ElementoBioseguridad(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}