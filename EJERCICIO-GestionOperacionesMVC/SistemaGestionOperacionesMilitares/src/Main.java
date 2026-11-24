import modelo.*;
import controlador.*;
import vista.*;


/**
 *
 * @author edwin
 */
public class Main {
    public static void main(String[] args) {
        JFPrincipal vista = new JFPrincipal();
        Gestor modelo = new Gestor();
        Control controlador = new Control(modelo, vista);
        vista.setVisible(true);
    }
}
