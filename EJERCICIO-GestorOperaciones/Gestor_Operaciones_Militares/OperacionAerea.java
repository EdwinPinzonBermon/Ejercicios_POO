
/**
 * Write a description of class OperacionAerea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OperacionAerea extends OperacionMilitar
{
    private int aeronaves, horasVuelo;
    
    public OperacionAerea(){}
    
    public OperacionAerea(String codigo, String nombre, String zona, Fecha fecha, Estado estado, int efectivos, int aeronaves, int horasVuelo){
        super(codigo, nombre, zona, fecha, estado, efectivos);
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
    public int calcularComplejidad(){
        return this.efectivos+(this.aeronaves*10)+this.horasVuelo;
    }
    
    @Override   
    public String toString() {
        return super.toString() + 
           " | Aeronaves: " + aeronaves + 
           " | Horas Vuelo: " + horasVuelo;
    }
}