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
    
    public boolean addPersona(Persona persona){
        this.personas.add(persona);
        return true;
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