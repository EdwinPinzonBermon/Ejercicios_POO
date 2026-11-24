
import modelo.*;
import vista.*;
import controlador.*;

public class Main {
    public static void main(String[] args) {
        GestorRiesgos modeloGestor = new GestorRiesgos();
        JFGestion vistaGestion = new JFGestion();
        Control control = new Control(modeloGestor, vistaGestion);
        vistaGestion.setVisible(true);
    }
}
