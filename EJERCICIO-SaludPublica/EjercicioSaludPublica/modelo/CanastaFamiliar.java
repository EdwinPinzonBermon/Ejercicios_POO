package modelo;


/**
 * Write a description of class CanastaFamiliar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CanastaFamiliar
{
    private double monto;
    
    public CanastaFamiliar(){}
    
    public CanastaFamiliar(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}