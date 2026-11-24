/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author edwin
 */
public class Control implements ActionListener {

    private Gestor modelo;
    private JFPrincipal vista;

    public Control(Gestor modelo, JFPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.getCbTipo().addActionListener(this);
        vista.getBtnGuardar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
        vista.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == vista.getCbTipo()) {
            habilitarSegunTipo();
        } else if (source == vista.getBtnGuardar()) {
            guardar();
        } else if (source == vista.getBtnLimpiar()) {
            vista.limpiarCampos();
        } else if (source == vista.getBtnBuscar()) {
            buscar();
        }
    }

    private void habilitarSegunTipo() {
        String seleccionado = (String) vista.getCbTipo().getSelectedItem();
        if (seleccionado.equals("")) {
            vista.limpiarProfesionalSalud();
            vista.limpiarDocente();
            vista.limpiarIndependiente();
            vista.getTxtInstitucion().setEnabled(false);
            vista.getTxtEspecialidad().setEnabled(false);
            vista.getCbNivel().setEnabled(false);
            vista.getChkCabezaDeHogar().setEnabled(false);
            vista.getTxtBioseguridad().setEnabled(false);
            vista.getTxtMedicinaS().setEnabled(false);
            vista.getTxtTecnologia().setEnabled(false);
            vista.getTxtServicio().setEnabled(false);
            vista.getTxtMedicinaI().setEnabled(false);
            vista.getTxtCanasta().setEnabled(false);
        } else if (seleccionado.equals("PROFESIONAL DE LA SALUD")) {
            vista.limpiarDocente();
            vista.limpiarIndependiente();
            vista.getTxtInstitucion().setEnabled(true);
            vista.getTxtEspecialidad().setEnabled(true);
            vista.getCbNivel().setEnabled(false);
            vista.getChkCabezaDeHogar().setEnabled(false);
            vista.getTxtBioseguridad().setEnabled(true);
            vista.getTxtMedicinaS().setEnabled(true);
            vista.getTxtTecnologia().setEnabled(false);
            vista.getTxtServicio().setEnabled(false);
            vista.getTxtMedicinaI().setEnabled(false);
            vista.getTxtCanasta().setEnabled(false);
        } else if (seleccionado.equals("DOCENTE")) {
            vista.limpiarProfesionalSalud();
            vista.limpiarIndependiente();
            vista.getTxtInstitucion().setEnabled(true);
            vista.getTxtEspecialidad().setEnabled(false);
            vista.getCbNivel().setEnabled(true);
            vista.getChkCabezaDeHogar().setEnabled(false);
            vista.getTxtBioseguridad().setEnabled(false);
            vista.getTxtMedicinaS().setEnabled(false);
            vista.getTxtTecnologia().setEnabled(true);
            vista.getTxtServicio().setEnabled(true);
            vista.getTxtMedicinaI().setEnabled(false);
            vista.getTxtCanasta().setEnabled(false);
        } else if (seleccionado.equals("PERSONA INDEPENDIENTE")) {
            vista.limpiarProfesionalSalud();
            vista.limpiarDocente();
            vista.getTxtInstitucion().setEnabled(false);
            vista.getTxtEspecialidad().setEnabled(false);
            vista.getCbNivel().setEnabled(false);
            vista.getChkCabezaDeHogar().setEnabled(true);
            vista.getTxtBioseguridad().setEnabled(false);
            vista.getTxtMedicinaS().setEnabled(false);
            vista.getTxtTecnologia().setEnabled(false);
            vista.getTxtServicio().setEnabled(false);
            vista.getTxtMedicinaI().setEnabled(true);
            vista.getTxtCanasta().setEnabled(true);
        }
    }

    private void guardar() {
        int seleccionTipoDocumento = vista.getCbTipoDocumento().getSelectedIndex();
        TipoDocumento tipoDocumento;
        if (seleccionTipoDocumento == 0) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar el tipo de documento", "", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            tipoDocumento = TipoDocumento.valueOf(vista.getCbTipoDocumento().getSelectedItem().toString());
        }
        
        String documento = vista.getTxtDocumento().getText().trim();
        if(documento.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir el documento", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String nombre = vista.getTxtNombre().getText().trim();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir el nombre ", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String apellido = vista.getTxtApellido().getText().trim();
        if(apellido.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir el apellido ", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String direccion = vista.getTxtDireccion().getText().trim();
        if(direccion.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir la direccion", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String telefono = vista.getTxtTelefono().getText().trim();
        if(telefono.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir el telefono", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int edad;
        try{
            String edadStr = vista.getTxtEdad().getText().trim();
            if(edadStr.isEmpty()){
                JOptionPane.showMessageDialog(vista, "Debe escribir la edad", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            edad = Integer.parseInt(edadStr);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(vista, "La edad debe ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int estrato;
        try{
            String estratoStr = vista.getTxtEstrato().getText().trim();
            if(estratoStr.isEmpty()){
                JOptionPane.showMessageDialog(vista, "Debe escribir el estrato", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            estrato = Integer.parseInt(estratoStr);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(vista, "el estrato debe ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String estadoCivil = vista.getTxtEstadoCivil().getText().trim();
        if(estadoCivil.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir el estado civil", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String tipo = (String) vista.getCbTipo().getSelectedItem();
        if(tipo.equals("")){
            JOptionPane.showMessageDialog(vista, "Debe seleccionar el tipo", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Persona persona = null;
        
        if(tipo.equals("PROFESIONAL DE LA SALUD")){
            String institucion = vista.getTxtInstitucion().getText().trim();
            if(institucion.isEmpty()){
                JOptionPane.showMessageDialog(vista, "Debe escribir la institucion", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String especialidad = vista.getTxtEspecialidad().getText().trim();
            if(especialidad.isEmpty()){
                JOptionPane.showMessageDialog(vista, "Debe escribir la especialidad", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double bioseguridad;
            try{
                String bioseguridadStr = vista.getTxtBioseguridad().getText().trim();
                if(bioseguridadStr.isEmpty()){
                    JOptionPane.showMessageDialog(vista, "Debe escribir el monto de bioseguridad", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                bioseguridad = Double.parseDouble(bioseguridadStr);
                if(bioseguridad < 0){
                    JOptionPane.showMessageDialog(vista, "El monto de bioseguridad no puede ser negativo", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "El monto de bioseguridad debe ser un numero", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double medicinaS;
            try{
                String medicinaSStr = vista.getTxtMedicinaS().getText().trim();
                if(medicinaSStr.isEmpty()){
                    JOptionPane.showMessageDialog(vista, "Debe escribir el monto de medicina", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                medicinaS = Double.parseDouble(medicinaSStr);
                if(medicinaS < 0){
                    JOptionPane.showMessageDialog(vista, "El monto de medicina no puede ser negativo", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "El monto de medicina debe ser un numero", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double totalGastos = bioseguridad + medicinaS;
            if(totalGastos > 350000){
                JOptionPane.showMessageDialog(vista, "El monto total de gastos no puede superar el bono de $350.000", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            persona = new ProfesionalSalud(tipoDocumento, documento, nombre, apellido, direccion, telefono, estadoCivil, edad, estrato, new Bono(350000), institucion, especialidad, new ElementoBioseguridad(bioseguridad), new Medicina(medicinaS));
        }else if(tipo.equals("DOCENTE")){
            String institucion = vista.getTxtInstitucion().getText().trim();
            if(institucion.isEmpty()){
                JOptionPane.showMessageDialog(vista, "Debe escribir la institucion", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            int seleccionNivel = vista.getCbNivel().getSelectedIndex();
            NivelEducativo nivel;
            if(seleccionNivel == 0){
                JOptionPane.showMessageDialog(vista, "Debe seleccionar el nivel", "", JOptionPane.WARNING_MESSAGE);
                return;
            }else{
                nivel = NivelEducativo.valueOf(vista.getCbNivel().getSelectedItem().toString());
            }
            
            double tecnologia;
            try{
                String tecnologiaStr = vista.getTxtTecnologia().getText().trim();
                if(tecnologiaStr.isEmpty()){
                    JOptionPane.showMessageDialog(vista, "Debe escribir el monto de tecnologia", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                tecnologia = Double.parseDouble(tecnologiaStr);
                if(tecnologia < 0){
                    JOptionPane.showMessageDialog(vista, "El monto de tecnologia no puede ser negativo", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "El monto de tecnologia debe ser un numero", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double servicio;
            try{
                String servicioStr = vista.getTxtServicio().getText().trim();
                if(servicioStr.isEmpty()){
                    JOptionPane.showMessageDialog(vista, "Debe escribir el monto de servicio", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                servicio = Double.parseDouble(servicioStr);
                if(servicio < 0){
                    JOptionPane.showMessageDialog(vista, "El monto de servicio no puede ser negativo", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "El monto de servicio debe ser un numero", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double totalGastos = tecnologia + servicio;
            if(totalGastos > 100000){
                JOptionPane.showMessageDialog(vista, "El monto total de gastos no puede superar el bono de $100.000", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            persona = new Docente(tipoDocumento, documento, nombre, apellido, direccion, telefono, estadoCivil, edad, estrato, new Bono(100000), institucion, nivel, new ImplementoTecnologico(tecnologia), new Servicio(servicio));
        }else if(tipo.equals("PERSONA INDEPENDIENTE")){
            boolean cabezaHogar = vista.getChkCabezaDeHogar().isSelected();
            
            double medicinaI;
            try{
                String medicinaIStr = vista.getTxtMedicinaI().getText().trim();
                if(medicinaIStr.isEmpty()){
                    JOptionPane.showMessageDialog(vista, "Debe escribir el monto de medicina", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                medicinaI = Double.parseDouble(medicinaIStr);
                if(medicinaI < 0){
                    JOptionPane.showMessageDialog(vista, "El monto de medicina no puede ser negativo", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "El monto de medicina debe ser un numero", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double canasta;
            try{
                String canastaStr = vista.getTxtCanasta().getText().trim();
                if(canastaStr.isEmpty()){
                    JOptionPane.showMessageDialog(vista, "Debe escribir el monto de canasta", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                canasta = Double.parseDouble(canastaStr);
                if(canasta < 0){
                    JOptionPane.showMessageDialog(vista, "El monto de canasta no puede ser negativo", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(vista, "El monto de canasta debe ser un numero", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            double totalGastos = medicinaI + canasta;
            if(totalGastos > 160000){
                JOptionPane.showMessageDialog(vista, "El monto total de gastos no puede superar el bono de $160.000", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            persona = new Independiente(tipoDocumento, documento, nombre, apellido, direccion, telefono, estadoCivil, edad, estrato, new Bono(160000), cabezaHogar, new Medicina(medicinaI), new CanastaFamiliar(canasta));
        }
        
        if(persona != null){
            String mensaje = modelo.guardarPersona(persona);
            JOptionPane.showMessageDialog(vista, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
            if(mensaje.equals("Persona guardada exitosamente")){
                vista.limpiarCampos();
                habilitarSegunTipo();
            }
        }
    }

    private void buscar() {
        String documento = vista.getTxtDocumento().getText().trim();
        if(documento.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Debe escribir el documento a buscar", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Persona persona = modelo.buscar(documento);
        if(persona == null){
            JOptionPane.showMessageDialog(vista, "No se encontro una persona con ese documento", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        vista.getCbTipoDocumento().setSelectedItem(persona.getTipoDocumento().toString());
        vista.getTxtNombre().setText(persona.getNombre());
        vista.getTxtApellido().setText(persona.getApellido());
        vista.getTxtDireccion().setText(persona.getDireccion());
        vista.getTxtTelefono().setText(persona.getTelefono());
        vista.getTxtEdad().setText(String.valueOf(persona.getEdad()));
        vista.getTxtEstrato().setText(String.valueOf(persona.getEstrato()));
        vista.getTxtEstadoCivil().setText(persona.getEstadoCivil());
        
        if(persona instanceof ProfesionalSalud){
            ProfesionalSalud ps = (ProfesionalSalud) persona;
            vista.getCbTipo().setSelectedItem("PROFESIONAL DE LA SALUD");
            vista.getTxtInstitucion().setText(ps.getInstitucionSalud());
            vista.getTxtEspecialidad().setText(ps.getEspecialidad());
            vista.getTxtBioseguridad().setText(String.valueOf(ps.getMontoBioseguridad().getMonto()));
            vista.getTxtMedicinaS().setText(String.valueOf(ps.getMontoMedicina().getMonto()));
        }else if(persona instanceof Docente){
            Docente d = (Docente) persona;
            vista.getCbTipo().setSelectedItem("DOCENTE");
            vista.getTxtInstitucion().setText(d.getInstitucionEducativa());
            if(d.getNivel() != null){
                vista.getCbNivel().setSelectedItem(d.getNivel().toString());
            }
            vista.getTxtTecnologia().setText(String.valueOf(d.getMontoTecnologia().getMonto()));
            vista.getTxtServicio().setText(String.valueOf(d.getMontoServicio().getMonto()));
        }else if(persona instanceof Independiente){
            Independiente i = (Independiente) persona;
            vista.getCbTipo().setSelectedItem("PERSONA INDEPENDIENTE");
            vista.getChkCabezaDeHogar().setSelected(i.isEsCabezaHogar());
            vista.getTxtMedicinaI().setText(String.valueOf(i.getMontoMedicina().getMonto()));
            vista.getTxtCanasta().setText(String.valueOf(i.getMontoCanasta().getMonto()));
        }
        habilitarSegunTipo();
    }

}