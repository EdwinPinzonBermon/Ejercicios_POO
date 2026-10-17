
/**
 * Write a description of class OperacionMaritima here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OperacionMaritima extends OperacionMilitar
{
    private String areaMaritima;
    private int embarcaciones;
    
    public OperacionMaritima(){}
    
    public OperacionMaritima(String codigo, String nombre, String zona, Fecha fecha, Estado estado, int efectivos, String areaMaritima, int embarcaciones){
        super(codigo, nombre, zona, fecha, estado, efectivos);
        this.areaMaritima = areaMaritima;
        this.embarcaciones = embarcaciones;
    }
    
    public String getAreaMaritima() {
        return areaMaritima;
    }

    public void setAreaMaritima(String areaMaritima) {
        this.areaMaritima = areaMaritima;
    }

    public int getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(int embarcaciones) {
        this.embarcaciones = embarcaciones;
    }
    
    @Override
    public int calcularComplejidad(){
        return this.efectivos+(this.embarcaciones*8);
    }
    
    @Override
    public String toString() {
        return super.toString() + 
           " | Area Maritima: " + areaMaritima + 
           " | Embarcaciones: " + embarcaciones;
    }   
}