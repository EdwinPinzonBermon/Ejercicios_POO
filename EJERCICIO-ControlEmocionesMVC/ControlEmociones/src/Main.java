
import vista.*;
import modelo.*;
import controlador.*;

public class Main {

    public static void main(String[] args) {
        JFGestion vista = new JFGestion();
        Gestor modelo = new Gestor();
        Control controlador = new Control(vista, modelo);
        vista.setVisible(true);
    }
}