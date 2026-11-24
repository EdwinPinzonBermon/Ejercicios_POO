package modelo;


/**
 * Write a description of class ImplementoTecnologico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImplementoTecnologico
{
    private double monto;
    
    public ImplementoTecnologico(){}
    
    public ImplementoTecnologico(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}