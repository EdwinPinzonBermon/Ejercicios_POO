
import Controlador.ControladorPedido;
import Vista.FrmPedido;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmPedido vista = new FrmPedido();
                new ControladorPedido(vista);
            }
        });
    }
}