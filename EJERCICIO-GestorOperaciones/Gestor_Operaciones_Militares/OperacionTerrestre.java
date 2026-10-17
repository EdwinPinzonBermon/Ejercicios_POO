
/**
 * Write a description of class OperacionTerrestre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OperacionTerrestre extends OperacionMilitar
{
    private String tipoTerreno;
    private int vehiculos;
    
    public OperacionTerrestre(){}
    
    public OperacionTerrestre(String codigo, String nombre, String zona, Fecha fecha, Estado estado, int efectivos, String tipoTerreno, int vehiculos){
        super(codigo, nombre, zona, fecha, estado, efectivos);
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
    public int calcularComplejidad(){
        return this.efectivos+(this.vehiculos*5);
    }
    
    @Override
    public String toString() {
        return super.toString() + 
           " | Tipo Terreno: " + tipoTerreno + 
           " | Vehiculos: " + vehiculos;
    }
}