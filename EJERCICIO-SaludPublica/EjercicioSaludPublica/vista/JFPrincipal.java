package vista;
import modelo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class JFPrincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFPrincipal extends JFrame implements ActionListener
{
    private JPanel pIzquierda, pDerecha, p2, p3, p4, p5;
    private JLabel lblTipoDocumento, lblDocumento, lblNombre, lblApellido, lblDireccion, lblTelefono, lblEdad, lblEstrato,
    lblEstadoCivil, lblTipo, lblInstitucion, lblEspecialidad, lblNivel, lblBioseguridad, lblMedicinaS, 
    lblTecnologia, lblServicio, lblMedicinaI, lblCanasta;
    private JComboBox cbTipoDocumento, cbTipo, cbNivel;
    private JButton btnGuardar, btnLimpiar, btnBuscar;
    private JTextField txtDocumento, txtNombre, txtApellido, txtDireccion, txtTelefono, txtEdad, txtEstrato, txtEstadoCivil,
    txtInstitucion, txtEspecialidad, txtBioseguridad, txtMedicinaS, txtTecnologia, txtServicio,
    txtMedicinaI, txtCanasta;
    private JCheckBox chkCabezaDeHogar;
    private Gestor modelo;

    public JFPrincipal(){
        modelo = new Gestor();
        setTitle("");
        setSize(800,400);
        setLayout(new GridLayout(1,2,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        crearComponentes();
        agregarListener();
        setVisible(true);
    }

    private void crearComponentes(){
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
        String [] tiposDocumentos = {"","CEDULA CIUDADANIA","CEDULA EXTRANJERIA"};
        cbTipoDocumento = new JComboBox(tiposDocumentos);
        String [] tipos = {"","PROFESIONAL DE LA SALUD","DOCENTE","PERSONA INDEPENDIENTE"};
        cbTipo = new JComboBox(tipos);
        String [] niveles = {"","TECNICO","TECNOLOGO","PREGRADO","MAESTRIA","DOCTORADO"};
        cbNivel = new JComboBox(niveles);
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

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==cbTipo){
            habilitarSegunTipo();
        }
        if(e.getSource()==btnGuardar){
            guardar();
        }
        if(e.getSource()==btnLimpiar){
            limpiar();
        }
        if(e.getSource()==btnBuscar){
            buscar();
        }
    }

    private void agregarListener(){
        cbTipoDocumento.addActionListener(this);
        cbTipo.addActionListener(this);
        cbNivel.addActionListener(this);
        chkCabezaDeHogar.addActionListener(this);
        btnGuardar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnBuscar.addActionListener(this);
    }

    private void habilitarSegunTipo(){
        int tipo = cbTipo.getSelectedIndex();

        boolean isIndependiente = tipo==3;
        boolean isProfesionalSalud = tipo==1;
        boolean isDocente = tipo==2;

        if(isProfesionalSalud){
            txtInstitucion.setEnabled(true);
            txtEspecialidad.setEnabled(true);
            cbNivel.setEnabled(false);
            chkCabezaDeHogar.setEnabled(false);
            txtBioseguridad.setEnabled(true);
            txtMedicinaS.setEnabled(true);
            txtTecnologia.setEnabled(false);
            txtServicio.setEnabled(false);
            txtMedicinaI.setEnabled(false);
            txtCanasta.setEnabled(false);
            txtInstitucion.setText("");
            txtEspecialidad.setText("");
            txtBioseguridad.setText("");
            txtMedicinaS.setText("");
            txtTecnologia.setText("");
            txtServicio.setText("");
            txtMedicinaI.setText("");
            txtCanasta.setText("");
            cbNivel.setSelectedIndex(0);
            chkCabezaDeHogar.setSelected(false);
        }
        else if(isDocente){
            txtInstitucion.setEnabled(true);
            txtEspecialidad.setEnabled(false);
            cbNivel.setEnabled(true);
            chkCabezaDeHogar.setEnabled(false);
            txtBioseguridad.setEnabled(false);
            txtMedicinaS.setEnabled(false);
            txtTecnologia.setEnabled(true);
            txtServicio.setEnabled(true);
            txtMedicinaI.setEnabled(false);
            txtCanasta.setEnabled(false);
            txtInstitucion.setText("");
            txtEspecialidad.setText("");
            txtBioseguridad.setText("");
            txtMedicinaS.setText("");
            txtTecnologia.setText("");
            txtServicio.setText("");
            txtMedicinaI.setText("");
            txtCanasta.setText("");
            cbNivel.setSelectedIndex(0);
            chkCabezaDeHogar.setSelected(false);
        }
        else if(isIndependiente){
            txtInstitucion.setEnabled(false);
            txtEspecialidad.setEnabled(false);
            cbNivel.setEnabled(false);
            chkCabezaDeHogar.setEnabled(true);
            txtBioseguridad.setEnabled(false);
            txtMedicinaS.setEnabled(false);
            txtTecnologia.setEnabled(false);
            txtServicio.setEnabled(false);
            txtMedicinaI.setEnabled(true);
            txtCanasta.setEnabled(true);
            txtInstitucion.setText("");
            txtEspecialidad.setText("");
            txtBioseguridad.setText("");
            txtMedicinaS.setText("");
            txtTecnologia.setText("");
            txtServicio.setText("");
            txtMedicinaI.setText("");
            txtCanasta.setText("");
            cbNivel.setSelectedIndex(0);
            chkCabezaDeHogar.setSelected(false);
        }
        else if(!isProfesionalSalud && !isDocente && !isIndependiente){
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
            txtInstitucion.setText("");
            txtEspecialidad.setText("");
            txtBioseguridad.setText("");
            txtMedicinaS.setText("");
            txtTecnologia.setText("");
            txtServicio.setText("");
            txtMedicinaI.setText("");
            txtCanasta.setText("");
            cbNivel.setSelectedIndex(0);
            chkCabezaDeHogar.setSelected(false);
        }
    }

    private void guardar() {
        try {
            int tipo = cbTipo.getSelectedIndex();

            if (tipo == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione el tipo de persona.");
                return;
            }

            if (cbTipoDocumento.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione el tipo de documento.");
                return;
            }

            String documento = txtDocumento.getText().trim();

            if (documento.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el número de documento.");
                return;
            }

            if (modelo.buscar(documento) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe una persona con ese documento.");
                return;
            }

            TipoDocumento tipoDoc = (cbTipoDocumento.getSelectedIndex() == 1)
                ? TipoDocumento.CC_CEDULA_CIUDADANIA
                : TipoDocumento.CE_CEDULA_EXTRANJERIA;

            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String direccion = txtDireccion.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String estadoCivil = txtEstadoCivil.getText().trim();

            int edad = leerEntero(txtEdad.getText().trim(), "Edad");
            int estrato = leerEntero(txtEstrato.getText().trim(), "Estrato");

            Persona persona = null;

            if (tipo == 1) {
                // Profesional de la Salud
                String institucion = txtInstitucion.getText().trim();
                String especialidad = txtEspecialidad.getText().trim();

                double montoBioseguridad = leerDouble(txtBioseguridad.getText().trim(), "Elemento de bioseguridad");
                double montoMedicina = leerDouble(txtMedicinaS.getText().trim(), "Medicina");

                double valorBono = 350000;

                if (!validarBono(valorBono, montoBioseguridad, montoMedicina)) {
                    return;
                }

                persona = new ProfesionalSalud(
                    tipoDoc, documento, nombre, apellido, direccion,
                    telefono, estadoCivil, edad, estrato,
                    new Bono(valorBono),
                    institucion, especialidad,
                    new ElementoBioseguridad(montoBioseguridad),
                    new Medicina(montoMedicina)
                );

            } else if (tipo == 2) {
                // Docente
                String institucion = txtInstitucion.getText().trim();
                NivelEducativo nivel = leerNivel();

                double montoTecnologia = leerDouble(txtTecnologia.getText().trim(), "Implementos tecnológicos");
                double montoServicio = leerDouble(txtServicio.getText().trim(), "Servicio internet/energía");

                double valorBono = 100000;

                if (!validarBono(valorBono, montoTecnologia, montoServicio)) {
                    return;
                }

                persona = new Docente(
                    tipoDoc, documento, nombre, apellido, direccion,
                    telefono, estadoCivil, edad, estrato,
                    new Bono(valorBono),
                    institucion, nivel,
                    new ImplementoTecnologico(montoTecnologia),
                    new Servicio(montoServicio)
                );

            } else if (tipo == 3) {
                // Persona Independiente
                boolean cabezaHogar = chkCabezaDeHogar.isSelected();

                double montoMedicina = leerDouble(txtMedicinaI.getText().trim(), "Medicina");
                double montoCanasta = leerDouble(txtCanasta.getText().trim(), "Canasta familiar");

                double valorBono = 160000;

                if (!validarBono(valorBono, montoMedicina, montoCanasta)) {
                    return;
                }

                persona = new Independiente(
                    tipoDoc, documento, nombre, apellido, direccion,
                    telefono, estadoCivil, edad, estrato,
                    new Bono(valorBono),
                    cabezaHogar,
                    new Medicina(montoMedicina),
                    new CanastaFamiliar(montoCanasta)
                );
            }

            if (persona != null) {
                modelo.addPersona(persona);
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
                limpiar();
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void buscar() {
        String documento = txtDocumento.getText().trim();

        if (documento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el documento a buscar.");
            return;
        }

        Persona persona = modelo.buscar(documento);

        if (persona == null) {
            JOptionPane.showMessageDialog(this, "No se encontró una persona con ese documento.");
            return;
        }

        StringBuilder mensaje = new StringBuilder();

        mensaje.append("Clasificación: ").append(clasificar(persona)).append("\n");
        mensaje.append("Tipo documento: ").append(persona.getTipoDocumento()).append("\n");
        mensaje.append("Documento: ").append(persona.getDocumento()).append("\n");
        mensaje.append("Nombre: ").append(persona.getNombre()).append(" ").append(persona.getApellido()).append("\n");
        mensaje.append("Dirección: ").append(persona.getDireccion()).append("\n");
        mensaje.append("Teléfono: ").append(persona.getTelefono()).append("\n");
        mensaje.append("Edad: ").append(persona.getEdad()).append("\n");
        mensaje.append("Estrato: ").append(persona.getEstrato()).append("\n");
        mensaje.append("Estado civil: ").append(persona.getEstadoCivil()).append("\n");
        mensaje.append("Bono asignado: $").append(persona.getBono().getMonto()).append("\n");

        if (persona instanceof ProfesionalSalud) {
            ProfesionalSalud ps = (ProfesionalSalud) persona;

            mensaje.append("\nDatos Profesional de la Salud:\n");
            mensaje.append("Institución de salud: ").append(ps.getInstitucionSalud()).append("\n");
            mensaje.append("Especialidad: ").append(ps.getEspecialidad()).append("\n");
            mensaje.append("Elemento de bioseguridad: $").append(ps.getMontoBioseguridad().getMonto()).append("\n");
            mensaje.append("Medicina: $").append(ps.getMontoMedicina().getMonto()).append("\n");

        } else if (persona instanceof Docente) {
            Docente d = (Docente) persona;

            mensaje.append("\nDatos Docente:\n");
            mensaje.append("Institución educativa: ").append(d.getInstitucionEducativa()).append("\n");
            mensaje.append("Nivel educativo: ").append(d.getNivel()).append("\n");
            mensaje.append("Implementos tecnológicos: $").append(d.getMontoTecnologia().getMonto()).append("\n");
            mensaje.append("Servicio internet/energía: $").append(d.getMontoServicio().getMonto()).append("\n");

        } else if (persona instanceof Independiente) {
            Independiente i = (Independiente) persona;

            mensaje.append("\nDatos Persona Independiente:\n");
            mensaje.append("Cabeza de hogar: ").append(i.isEsCabezaHogar() ? "Sí" : "No").append("\n");
            mensaje.append("Medicina: $").append(i.getMontoMedicina().getMonto()).append("\n");
            mensaje.append("Canasta familiar: $").append(i.getMontoCanasta().getMonto()).append("\n");
        }

        JOptionPane.showMessageDialog(
            this,
            mensaje.toString(),
            "Resultado de búsqueda",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    private String clasificar(Persona persona) {
        if (persona instanceof ProfesionalSalud) {
            return "Profesional de la Salud";
        } else if (persona instanceof Docente) {
            return "Docente";
        } else if (persona instanceof Independiente) {
            return "Persona Independiente";
        }
        return "Persona";
    }

    private boolean validarBono(double valorBono, double monto1, double monto2) {
        if (monto1 + monto2 > valorBono) {
            JOptionPane.showMessageDialog(
                this,
                "La distribución no puede superar el valor del bono.\n" +
                "Valor del bono: $" + valorBono + "\n" +
                "Total distribuido: $" + (monto1 + monto2)
            );
            return false;
        }
        return true;
    }

    private int leerEntero(String texto, String campo) {
        if (texto == null || texto.isEmpty()) {
            throw new NumberFormatException("El campo " + campo + " es obligatorio.");
        }

        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El campo " + campo + " debe ser un número entero.");
        }
    }

    private double leerDouble(String texto, String campo) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0.0;
        }

        double valor;

        try {
            valor = Double.parseDouble(texto.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El campo " + campo + " debe ser un número válido.");
        }

        if (valor < 0) {
            throw new NumberFormatException("El campo " + campo + " no puede ser negativo.");
        }

        return valor;
    }

    private NivelEducativo leerNivel() {
        switch (cbNivel.getSelectedIndex()) {
            case 1:
                return NivelEducativo.TECNICO;
            case 2:
                return NivelEducativo.TECNOLOGO;
            case 3:
                return NivelEducativo.PREGRADO;
            case 4:
                return NivelEducativo.MAESTRIA;
            case 5:
                return NivelEducativo.DOCTORADO;
            default:
                throw new IllegalArgumentException("Debe seleccionar un nivel educativo.");
        }
    }

    private void limpiar(){
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
        habilitarSegunTipo(); 
    }

}