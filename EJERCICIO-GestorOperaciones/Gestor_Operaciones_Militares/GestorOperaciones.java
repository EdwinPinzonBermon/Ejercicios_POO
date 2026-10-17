import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class GestorOperaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestorOperaciones
{
    private List <OperacionMilitar> operaciones;
    
    public GestorOperaciones(){
        this.operaciones = new ArrayList();
    }
    
    public boolean registrarOperacion(OperacionMilitar operacion){
        this.operaciones.add(operacion);
        return true;
    }
    
    public String consultarOperaciones(){
        
        if(this.operaciones.isEmpty()){
            return "No hay operaciones militares Registradas";
        }
        
        String listadoOperaciones = "";
        
        for(OperacionMilitar operacion: this.operaciones){
            listadoOperaciones += operacion.toString()+ "\n";
        }
        
        return listadoOperaciones;
    }
    
    public OperacionMilitar buscarOperacion(String codigo){   
        for(OperacionMilitar operacion: this.operaciones){
                if(operacion.getCodigo().equals(codigo)){
                    return operacion;
                }
            }
        return null;
    }
    
    public boolean cambiarEstado(String codigo, Estado nuevoEstado) {
        OperacionMilitar operacion = buscarOperacion(codigo);
        if (operacion != null) {
            operacion.setEstado(nuevoEstado);
            return true;
        }
        return false;
    }   
    
    public String mostrarOperacionesXTipo(String tipo){
    String operacionesXTipo = "";
       
    for (OperacionMilitar operacion : this.operaciones) {
        if (tipo.equalsIgnoreCase("terrestre") && operacion instanceof OperacionTerrestre) {
            operacionesXTipo += operacion.toString()+ "\n";
        } else if (tipo.equalsIgnoreCase("aerea") && operacion instanceof OperacionAerea) {
            operacionesXTipo += operacion.toString()+ "\n";
        } else if (tipo.equalsIgnoreCase("maritima") && operacion instanceof OperacionMaritima) {
            operacionesXTipo += operacion.toString()+ "\n";
        }   
    }
    if(operacionesXTipo.isEmpty()){
        return "No hay operaciones registradas de ese tipo";
    }
        return operacionesXTipo;
    }
    
    public String mostrarComplejidades(){
        String complejidades = "";
        for(OperacionMilitar operacion: this.operaciones){
            complejidades += "Codigo: "+operacion.getCodigo()+" | Nombre: "+operacion.getNombre()+" | Complejidad: "+operacion.calcularComplejidad()+"\n";
        }
        
        if(complejidades.isEmpty()){
            return "No hay operaciones registradas";
        }
        
        return complejidades;
    }
    
    public OperacionMilitar buscarOperacionMasCompleja(){
        if(this.operaciones.isEmpty()){
            return null;
        }
        
        OperacionMilitar masComplejo = this.operaciones.get(0);
        for(int i= 1; i< this.operaciones.size(); i++){
            if(masComplejo.calcularComplejidad()<operaciones.get(i).calcularComplejidad()){
                masComplejo = operaciones.get(i);
            }
        }
        
        return masComplejo;
    }
}