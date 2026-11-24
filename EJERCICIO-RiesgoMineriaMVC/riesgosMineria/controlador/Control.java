package controlador;

import modelo.*;
import vista.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Control implements ActionListener
{

    private GestorRiesgos modelGestor;
    private JFGestion viewGestion;

    public Control(GestorRiesgos modelGestor, JFGestion viewGestion) {
        this.modelGestor = modelGestor;
        this.viewGestion = viewGestion;

        viewGestion.btnAgregar.addActionListener(this);
        viewGestion.btnBuscar.addActionListener(this);
        viewGestion.btnEliminar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        
        if(source==viewGestion.btnAgregar){
            agregar();
        }else if(source==viewGestion.btnBuscar){
            buscar();
        }else if(source==viewGestion.btnEliminar){
            eliminar();
        }
    }
    
    private void agregar(){
        String codigo = viewGestion.txtCodigo.getText();
        String descripcion = viewGestion.txtDescripcion.getText();
        String tipo = viewGestion.txtTipo.getText();
        int nivel;
        try {
            nivel = Integer.parseInt(viewGestion.txtNivel.getText());
        } catch (NumberFormatException ex) {
            viewGestion.areaSalida.setText("Nivel debe ser un número entero.");
            return;
        }

        Riesgo r = new Riesgo(codigo, descripcion, tipo, nivel);
        if (modelGestor.agregarRiesgo(r)) {
            viewGestion.areaSalida.setText("Riesgo agregado\n\n" + modelGestor.listarRiesgos());
        } else {
            viewGestion.areaSalida.setText("Ya existe un riesgo con ese código.");
        }
    }

    private void buscar(){
        String codigo = viewGestion.txtCodigo.getText();
        Riesgo r = modelGestor.buscarPorCodigo(codigo);
        if (r != null) {
            viewGestion.areaSalida.setText("Riesgo encontrado:\n\n" + r.toString());
        } else {
            viewGestion.areaSalida.setText("No se encontró ese riesgo.");
        }
    }

    private void eliminar(){
        String codigo = viewGestion.txtCodigo.getText();
        if (modelGestor.eliminarRiesgo(codigo)) {
            viewGestion.areaSalida.setText("Riesgo eliminado\n\n" + modelGestor.listarRiesgos());
        } else {
            viewGestion.areaSalida.setText("No se encontró ese riesgo.");
        }
    }
}

