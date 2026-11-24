/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author edwin
 */

public class JFPrincipal extends JFrame {
    private JPanel pIzquierda, pDerecha, p2, p3, p4, p5;
    private JLabel lblTipoDocumento, lblDocumento, lblNombre, lblApellido, lblDireccion, lblTelefono, lblEdad, lblEstrato,
    lblEstadoCivil, lblTipo, lblInstitucion, lblEspecialidad, lblNivel, lblBioseguridad, lblMedicinaS, 
    lblTecnologia, lblServicio, lblMedicinaI, lblCanasta;
    private JComboBox<String> cbTipoDocumento, cbTipo, cbNivel;
    private JButton btnGuardar, btnLimpiar, btnBuscar;
    private JTextField txtDocumento, txtNombre, txtApellido, txtDireccion, txtTelefono, txtEdad, txtEstrato, txtEstadoCivil,
    txtInstitucion, txtEspecialidad, txtBioseguridad, txtMedicinaS, txtTecnologia, txtServicio,
    txtMedicinaI, txtCanasta;
    private JCheckBox chkCabezaDeHogar;

    public JFPrincipal(){
        setTitle("Gestor de Personas");
        setSize(800,400);
        setLayout(new GridLayout(1,2,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        initComponentes();
    }

    private void initComponentes(){
        pIzquierda = new JPanel(new GridLayout(14, 2, 3,3));
        pIzquierda.setBorder(BorderFactory.createTitledBorder("Registro de datos basicos"));
        lblTipoDocumento = new JLabel("Tipo Documento");
        lblDocumento = new JLabel("Documento");
        lblNombre = new JLabel("Nombre");
        lblApellido = new JLabel("Apellido");
        lblDireccion = new JLabel("Direccion");
        lblTelefono = new JLabel("Telefono");
        lblEdad = new JLabel("Edad");
        lblEstrato = new JLabel("Estrato");
        lblEstadoCivil = new JLabel("Estado Civil");
        lblTipo = new JLabel("Tipo");
        lblInstitucion = new JLabel("Institucion");
        lblEspecialidad = new JLabel("Especialidad");
        lblNivel = new JLabel("Nivel");
        
        txtDocumento = new JTextField("");
        txtNombre = new JTextField("");
        txtApellido = new JTextField("");
        txtDireccion = new JTextField("");
        txtTelefono = new JTextField("");
        txtEdad = new JTextField("");
        txtEstrato = new JTextField("");
        txtEstadoCivil = new JTextField("");
        txtInstitucion = new JTextField("");
        txtEspecialidad = new JTextField("");
        
        String [] tiposDocumentos = {"","CC_CEDULA_CIUDADANIA","CE_CEDULA_EXTRANJERIA"};
        cbTipoDocumento = new JComboBox<>(tiposDocumentos);
        String [] tipos = {"","PROFESIONAL DE LA SALUD","DOCENTE","PERSONA INDEPENDIENTE"};
        cbTipo = new JComboBox<>(tipos);
        String [] niveles = {"","TECNICO","TECNOLOGO","PREGRADO","MAESTRIA","DOCTORADO"};
        cbNivel = new JComboBox<>(niveles);
        chkCabezaDeHogar = new JCheckBox("Cabeza de Hogar");
        
        pIzquierda.add(lblTipoDocumento); 
        pIzquierda.add(cbTipoDocumento);
        pIzquierda.add(lblDocumento); 
        pIzquierda.add(txtDocumento);
        pIzquierda.add(lblNombre); 
        pIzquierda.add(txtNombre);
        pIzquierda.add(lblApellido); 
        pIzquierda.add(txtApellido);
        pIzquierda.add(lblDireccion); 
        pIzquierda.add(txtDireccion);
        pIzquierda.add(lblTelefono); 
        pIzquierda.add(txtTelefono);
        pIzquierda.add(lblEdad); 
        pIzquierda.add(txtEdad);
        pIzquierda.add(lblEstrato); 
        pIzquierda.add(txtEstrato);
        pIzquierda.add(lblEstadoCivil);
        pIzquierda.add(txtEstadoCivil);
        pIzquierda.add(lblTipo); 
        pIzquierda.add(cbTipo);
        pIzquierda.add(lblInstitucion); 
        pIzquierda.add(txtInstitucion);
        pIzquierda.add(lblEspecialidad); 
        pIzquierda.add(txtEspecialidad);
        pIzquierda.add(lblNivel); 
        pIzquierda.add(cbNivel);
        pIzquierda.add(chkCabezaDeHogar);

        pDerecha = new JPanel();
        pDerecha.setLayout(new BoxLayout(pDerecha, BoxLayout.Y_AXIS));

        p2 = new JPanel(new GridLayout(1,3));
        p2.setBorder(BorderFactory.createTitledBorder("Panel Botones"));
        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");
        btnBuscar = new JButton("Buscar");
        p2.add(btnGuardar); 
        p2.add(btnLimpiar); 
        p2.add(btnBuscar);
        pDerecha.add(p2);

        p3 = new JPanel(new GridLayout(2,2,1,1));
        p3.setBorder(BorderFactory.createTitledBorder("Distribucion Bono Prof Salud"));
        lblBioseguridad = new JLabel("Elemento Bioseguridad");
        lblMedicinaS = new JLabel("Medicina");
        txtBioseguridad = new JTextField("");
        txtMedicinaS= new JTextField("");
        p3.add(lblBioseguridad); 
        p3.add(txtBioseguridad);
        p3.add(lblMedicinaS); 
        p3.add(txtMedicinaS);
        pDerecha.add(p3);

        p4 = new JPanel(new GridLayout(2,2,1,1));
        p4.setBorder(BorderFactory.createTitledBorder("Distribucion Bono Docente"));
        lblTecnologia = new JLabel("Implementos Tecnologicos");
        lblServicio = new JLabel("Servicio Internet/Energia");
        txtTecnologia = new JTextField("");
        txtServicio = new JTextField("");
        p4.add(lblTecnologia); 
        p4.add(txtTecnologia);
        p4.add(lblServicio); 
        p4.add(txtServicio);
        pDerecha.add(p4);

        p5 = new JPanel(new GridLayout(2,2,1,1));
        p5.setBorder(BorderFactory.createTitledBorder("Distribucion Bono Persona Independiente"));
        lblMedicinaI = new JLabel("Medicina");
        lblCanasta = new JLabel("Canasta Familiar");
        txtMedicinaI = new JTextField("");
        txtCanasta = new JTextField("");
        p5.add(lblMedicinaI); 
        p5.add(txtMedicinaI);
        p5.add(lblCanasta); 
        p5.add(txtCanasta);
        pDerecha.add(p5);

        txtInstitucion.setEnabled(false);
        txtEspecialidad.setEnabled(false);
        cbNivel.setEnabled(false);
        chkCabezaDeHogar.setEnabled(false);
        txtBioseguridad.setEnabled(false);
        txtMedicinaS.setEnabled(false);
        txtTecnologia.setEnabled(false);
        txtServicio.setEnabled(false);
        txtMedicinaI.setEnabled(false);
        txtCanasta.setEnabled(false);

        this.add(pIzquierda);
        this.add(pDerecha);
    }


    public void limpiarCampos() {
        txtDocumento.setText("");
        txtNombre.setText(""); 
        txtApellido.setText("");
        txtDireccion.setText(""); 
        txtTelefono.setText(""); 
        txtEdad.setText("");
        txtEstrato.setText(""); 
        txtEstadoCivil.setText(""); 
        txtInstitucion.setText("");
        txtEspecialidad.setText(""); 
        txtBioseguridad.setText(""); 
        txtMedicinaS.setText("");
        txtTecnologia.setText(""); 
        txtServicio.setText(""); 
        txtMedicinaI.setText("");
        txtCanasta.setText(""); 
        cbTipoDocumento.setSelectedIndex(0); 
        cbTipo.setSelectedIndex(0);
        cbNivel.setSelectedIndex(0); 
        chkCabezaDeHogar.setSelected(false);
    }
    
    public void limpiarProfesionalSalud(){
        txtInstitucion.setText("");
        txtEspecialidad.setText(""); 
        txtBioseguridad.setText(""); 
        txtMedicinaS.setText("");
    }
    
    public void limpiarDocente(){
        txtInstitucion.setText("");
        txtTecnologia.setText(""); 
        txtServicio.setText(""); 
    }
    
    public void limpiarIndependiente(){
        chkCabezaDeHogar.setSelected(false);
        txtMedicinaI.setText("");
        txtCanasta.setText(""); 
    }

    public JPanel getpIzquierda() {
        return pIzquierda;
    }

    public JPanel getpDerecha() {
        return pDerecha;
    }

    public JPanel getP2() {
        return p2;
    }

    public JPanel getP3() {
        return p3;
    }

    public JPanel getP4() {
        return p4;
    }

    public JPanel getP5() {
        return p5;
    }

    public JLabel getLblTipoDocumento() {
        return lblTipoDocumento;
    }

    public JLabel getLblDocumento() {
        return lblDocumento;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public JLabel getLblApellido() {
        return lblApellido;
    }

    public JLabel getLblDireccion() {
        return lblDireccion;
    }

    public JLabel getLblTelefono() {
        return lblTelefono;
    }

    public JLabel getLblEdad() {
        return lblEdad;
    }

    public JLabel getLblEstrato() {
        return lblEstrato;
    }

    public JLabel getLblEstadoCivil() {
        return lblEstadoCivil;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public JLabel getLblInstitucion() {
        return lblInstitucion;
    }

    public JLabel getLblEspecialidad() {
        return lblEspecialidad;
    }

    public JLabel getLblNivel() {
        return lblNivel;
    }

    public JLabel getLblBioseguridad() {
        return lblBioseguridad;
    }

    public JLabel getLblMedicinaS() {
        return lblMedicinaS;
    }

    public JLabel getLblTecnologia() {
        return lblTecnologia;
    }

    public JLabel getLblServicio() {
        return lblServicio;
    }

    public JLabel getLblMedicinaI() {
        return lblMedicinaI;
    }

    public JLabel getLblCanasta() {
        return lblCanasta;
    }

    public JComboBox<String> getCbTipoDocumento() {
        return cbTipoDocumento;
    }

    public JComboBox<String> getCbTipo() {
        return cbTipo;
    }

    public JComboBox<String> getCbNivel() {
        return cbNivel;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JTextField getTxtDocumento() {
        return txtDocumento;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JTextField getTxtEdad() {
        return txtEdad;
    }

    public JTextField getTxtEstrato() {
        return txtEstrato;
    }

    public JTextField getTxtEstadoCivil() {
        return txtEstadoCivil;
    }

    public JTextField getTxtInstitucion() {
        return txtInstitucion;
    }

    public JTextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public JTextField getTxtBioseguridad() {
        return txtBioseguridad;
    }

    public JTextField getTxtMedicinaS() {
        return txtMedicinaS;
    }

    public JTextField getTxtTecnologia() {
        return txtTecnologia;
    }

    public JTextField getTxtServicio() {
        return txtServicio;
    }

    public JTextField getTxtMedicinaI() {
        return txtMedicinaI;
    }

    public JTextField getTxtCanasta() {
        return txtCanasta;
    }

    public JCheckBox getChkCabezaDeHogar() {
        return chkCabezaDeHogar;
    }
    
    
}
