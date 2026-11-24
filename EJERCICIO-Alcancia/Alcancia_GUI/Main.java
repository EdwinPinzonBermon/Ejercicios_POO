import modelo.*;
import vista.*;
import controlador.*;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args){
        Alcancia modelo = new Alcancia();
        JFAlcancia vista = new JFAlcancia();
        Control controlador = new Control(modelo, vista);
        vista.setVisible(true);
    }
}