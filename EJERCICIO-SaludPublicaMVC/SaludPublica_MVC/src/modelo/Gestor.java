package modelo;
import java.util.ArrayList;


/**
 * Write a description of class Gestor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gestor
{
    private ArrayList<Persona> personas;
    
    public Gestor(){
        this.personas = new ArrayList<>();
    }
    
    
    private boolean validarRepetida(Persona persona){
        for(Persona p:personas){
            if(p.getDocumento().equals(persona.getDocumento())){
                return false;
            }
        }
        return true;
    }
    
    public String guardarPersona(Persona persona){
        if(validarRepetida(persona)){
            this.personas.add(persona);
            return "Persona guardada exitosamente";
        }else{
            return "Ya existe una persona con ese documento";
        }
    }
    
    public Persona buscar(String documento){
        for(Persona persona: this.personas){
            if(persona.getDocumento().equals(documento)){
                return persona;
            }
        }
        return null;
    }
    
}