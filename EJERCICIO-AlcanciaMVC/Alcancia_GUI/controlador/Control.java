package controlador;
import modelo.*;
import vista.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Control implements ActionListener
{
    private Alcancia modelo;
    private JFAlcancia vista;

    public Control(Alcancia modelo, JFAlcancia vista){
        this.modelo = modelo;
        this.vista = vista;
        vista.getBtn50().addActionListener(this);
        vista.getBtn100().addActionListener(this);
        vista.getBtn200().addActionListener(this);
        vista.getBtn500().addActionListener(this);
        vista.getBtn1000().addActionListener(this);
        vista.getBtnVaciar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        if(source==vista.getBtn50()){
            modelo.agregarMonedas(50);
            actualizarAlcancia();
        }else if(source==vista.getBtn100()){
            modelo.agregarMonedas(100);
            actualizarAlcancia();
        }else if(source==vista.getBtn200()){  
            modelo.agregarMonedas(200);
            actualizarAlcancia();
        }else if(source==vista.getBtn500()){
            modelo.agregarMonedas(500);
            actualizarAlcancia();
        }else if(source==vista.getBtn1000()){
            modelo.agregarMonedas(1000);
            actualizarAlcancia();
        }else if(source==vista.getBtnVaciar()){
            modelo.vaciar();
            actualizarAlcancia();
            actualizarCerdo();
        }    
    }    

    public void actualizarCerdo(){
        ImageIcon icono = new ImageIcon("imagenes/rota.png");
        Image imagenEscalada = icono.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon iconoEscaladoRota = new ImageIcon(imagenEscalada); 
        vista.getLblImagenCerdo().setIcon(iconoEscaladoRota);
    }

    public void actualizarAlcancia() {
        vista.getLblImagenCerdo().setIcon(vista.getIconoEscaladoCerdo());
        vista.getLblSaldo().setText("$" + modelo.getSaldo());
        vista.getLblCantMonedas50().setText(String.valueOf(modelo.getMonedas50()));
        vista.getLblCantMonedas100().setText(String.valueOf(modelo.getMonedas100()));
        vista.getLblCantMonedas200().setText(String.valueOf(modelo.getMonedas200()));
        vista.getLblCantMonedas500().setText(String.valueOf(modelo.getMonedas500()));
        vista.getLblCantMonedas1000().setText(String.valueOf(modelo.getMonedas1000()));
        vista.getLblCantTotalMonedas().setText(String.valueOf(modelo.getTotalMonedas()));
    }
}