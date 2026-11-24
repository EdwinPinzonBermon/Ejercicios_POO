/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author edwin
 */
public class JFPrincipal extends javax.swing.JFrame {

    public JFPrincipal() {
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        getTxtTipoTerreno().setEnabled(false);
        getTxtVehiculos().setEnabled(false);
        getTxtAeronaves().setEnabled(false);
        getTxtHorasVuelo().setEnabled(false);
        getTxtEmbarcaciones().setEnabled(false);
        getTxtAreaMaritima().setEnabled(false);
    }

    public void limpiarCampos() {
        txtAeronaves.setText("");
        txtAreaMaritima.setText("");
        txtCodigo.setText("");
        txtEfectivos.setText("");
        txtEmbarcaciones.setText("");
        txtFecha.setText("");
        txtHorasVuelo.setText("");
        txtNombre.setText("");
        txtTipoTerreno.setText("");
        txtVehiculos.setText("");
        cbTipo.setSelectedIndex(0);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelOperaciones = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblEfectivos = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        txtEfectivos = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        panelTerrestre = new javax.swing.JPanel();
        lblTipoTerreno = new javax.swing.JLabel();
        lblVehiculos = new javax.swing.JLabel();
        txtTipoTerreno = new javax.swing.JTextField();
        txtVehiculos = new javax.swing.JTextField();
        panelAerea = new javax.swing.JPanel();
        lblAeronaves = new javax.swing.JLabel();
        lblHorasVuelo = new javax.swing.JLabel();
        txtAeronaves = new javax.swing.JTextField();
        txtHorasVuelo = new javax.swing.JTextField();
        panelMaritima = new javax.swing.JPanel();
        lblEmbarcaciones = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAreaMaritima = new javax.swing.JLabel();
        txtEmbarcaciones = new javax.swing.JTextField();
        txtAreaMaritima = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnMostrarOperaciones = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCambiarEstado = new javax.swing.JButton();
        btnMostrarPorTipo = new javax.swing.JButton();
        btnMostrarComplejidades = new javax.swing.JButton();
        btnMayorComplejidad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GESTOR DE OPERACIONES MILITARES");

        panelOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOperaciones.setForeground(new java.awt.Color(255, 255, 255));

        lblCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("Codigo:");

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha(DD/MM/AAAA):");

        lblEstado.setBackground(new java.awt.Color(255, 255, 255));
        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("Estado:");

        lblEfectivos.setBackground(new java.awt.Color(255, 255, 255));
        lblEfectivos.setForeground(new java.awt.Color(0, 0, 0));
        lblEfectivos.setText("Cantidad de Efectivos:");

        lblTipo.setBackground(new java.awt.Color(255, 255, 255));
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLANEADA", "EN_EJECUCION", "FINALIZADA" }));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Terrestre", "Aerea", "Maritima" }));

        panelTerrestre.setBackground(new java.awt.Color(255, 255, 255));
        panelTerrestre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operacion Terrestre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelTerrestre.setForeground(new java.awt.Color(0, 0, 0));

        lblTipoTerreno.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoTerreno.setText("Tipo de Terreno:");

        lblVehiculos.setBackground(new java.awt.Color(204, 204, 204));
        lblVehiculos.setForeground(new java.awt.Color(0, 0, 0));
        lblVehiculos.setText("Cantidad de Vehiculos:");

        javax.swing.GroupLayout panelTerrestreLayout = new javax.swing.GroupLayout(panelTerrestre);
        panelTerrestre.setLayout(panelTerrestreLayout);
        panelTerrestreLayout.setHorizontalGroup(
            panelTerrestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerrestreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTerrestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTerrestreLayout.createSequentialGroup()
                        .addComponent(lblTipoTerreno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTerrestreLayout.createSequentialGroup()
                        .addComponent(lblVehiculos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTerrestreLayout.setVerticalGroup(
            panelTerrestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerrestreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTerrestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoTerreno)
                    .addComponent(txtTipoTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTerrestreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehiculos)
                    .addComponent(txtVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelAerea.setBackground(new java.awt.Color(255, 255, 255));
        panelAerea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operacion Aerea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelAerea.setForeground(new java.awt.Color(0, 0, 0));

        lblAeronaves.setBackground(new java.awt.Color(204, 204, 204));
        lblAeronaves.setForeground(new java.awt.Color(0, 0, 0));
        lblAeronaves.setText("Cantidad de Aeronaves:");

        lblHorasVuelo.setBackground(new java.awt.Color(204, 204, 204));
        lblHorasVuelo.setForeground(new java.awt.Color(0, 0, 0));
        lblHorasVuelo.setText("Horas de vuelo:");

        javax.swing.GroupLayout panelAereaLayout = new javax.swing.GroupLayout(panelAerea);
        panelAerea.setLayout(panelAereaLayout);
        panelAereaLayout.setHorizontalGroup(
            panelAereaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAereaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAereaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAereaLayout.createSequentialGroup()
                        .addComponent(lblAeronaves)
                        .addGap(18, 18, 18)
                        .addComponent(txtAeronaves, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAereaLayout.createSequentialGroup()
                        .addComponent(lblHorasVuelo)
                        .addGap(18, 18, 18)
                        .addComponent(txtHorasVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAereaLayout.setVerticalGroup(
            panelAereaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAereaLayout.createSequentialGroup()
                .addGroup(panelAereaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAeronaves)
                    .addComponent(txtAeronaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAereaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasVuelo)
                    .addComponent(txtHorasVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        panelMaritima.setBackground(new java.awt.Color(255, 255, 255));
        panelMaritima.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operacion Maritima", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelMaritima.setForeground(new java.awt.Color(0, 0, 0));

        lblEmbarcaciones.setBackground(new java.awt.Color(204, 204, 204));
        lblEmbarcaciones.setForeground(new java.awt.Color(0, 0, 0));
        lblEmbarcaciones.setText("Cantidad de Embarcaciones:");

        lblAreaMaritima.setBackground(new java.awt.Color(204, 204, 204));
        lblAreaMaritima.setForeground(new java.awt.Color(0, 0, 0));
        lblAreaMaritima.setText("Area maritima:");

        javax.swing.GroupLayout panelMaritimaLayout = new javax.swing.GroupLayout(panelMaritima);
        panelMaritima.setLayout(panelMaritimaLayout);
        panelMaritimaLayout.setHorizontalGroup(
            panelMaritimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaritimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaritimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMaritimaLayout.createSequentialGroup()
                        .addComponent(lblEmbarcaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmbarcaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(panelMaritimaLayout.createSequentialGroup()
                        .addComponent(lblAreaMaritima)
                        .addGap(18, 18, 18)
                        .addComponent(txtAreaMaritima, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMaritimaLayout.setVerticalGroup(
            panelMaritimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaritimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaritimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmbarcaciones)
                    .addComponent(txtEmbarcaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMaritimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaMaritima)
                    .addComponent(txtAreaMaritima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnRegistrar.setText("Registrar  Operacion");

        btnMostrarOperaciones.setText("mostrar Operaciones");

        btnBuscar.setText("Buscar Operacion");

        btnCambiarEstado.setText("Cambiar Estado");

        btnMostrarPorTipo.setText("Mostrar por Tipo");

        btnMostrarComplejidades.setText("Mostrar Complejidades");

        btnMayorComplejidad.setText("Hallar Mayor Complejidad");

        jButton1.setText("Limpiar");

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMaritima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperacionesLayout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperacionesLayout.createSequentialGroup()
                                .addComponent(lblEstado)
                                .addGap(18, 18, 18)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperacionesLayout.createSequentialGroup()
                                .addComponent(lblEfectivos)
                                .addGap(18, 18, 18)
                                .addComponent(txtEfectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperacionesLayout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(18, 18, 18)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperacionesLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelOperacionesLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelAerea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTerrestre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(btnCambiarEstado)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarPorTipo)
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelOperacionesLayout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMostrarComplejidades)
                                .addGap(131, 131, 131))))
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarOperaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMayorComplejidad)))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfectivos)
                    .addComponent(txtEfectivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(panelTerrestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAerea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMaritima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnMostrarOperaciones)
                            .addComponent(btnBuscar)
                            .addComponent(btnMayorComplejidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCambiarEstado)
                            .addComponent(btnMostrarPorTipo)
                            .addComponent(btnMostrarComplejidades)))
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnMayorComplejidad;
    private javax.swing.JButton btnMostrarComplejidades;
    private javax.swing.JButton btnMostrarOperaciones;
    private javax.swing.JButton btnMostrarPorTipo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAeronaves;
    private javax.swing.JLabel lblAreaMaritima;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEfectivos;
    private javax.swing.JLabel lblEmbarcaciones;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorasVuelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoTerreno;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVehiculos;
    private javax.swing.JPanel panelAerea;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelMaritima;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelTerrestre;
    private javax.swing.JTextField txtAeronaves;
    private javax.swing.JTextField txtAreaMaritima;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEfectivos;
    private javax.swing.JTextField txtEmbarcaciones;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHorasVuelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipoTerreno;
    private javax.swing.JTextField txtVehiculos;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnCambiarEstado() {
        return btnCambiarEstado;
    }

    public JButton getBtnMayorComplejidad() {
        return btnMayorComplejidad;
    }

    public JButton getBtnMostrarComplejidades() {
        return btnMostrarComplejidades;
    }

    public JButton getBtnMostrarOperaciones() {
        return btnMostrarOperaciones;
    }

    public JButton getBtnMostrarPorTipo() {
        return btnMostrarPorTipo;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JComboBox<String> getCbEstado() {
        return cbEstado;
    }

    public JComboBox<String> getCbTipo() {
        return cbTipo;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getLblAeronaves() {
        return lblAeronaves;
    }

    public JLabel getLblAreaMaritima() {
        return lblAreaMaritima;
    }

    public JLabel getLblCodigo() {
        return lblCodigo;
    }

    public JLabel getLblEfectivos() {
        return lblEfectivos;
    }

    public JLabel getLblEmbarcaciones() {
        return lblEmbarcaciones;
    }

    public JLabel getLblEstado() {
        return lblEstado;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public JLabel getLblHorasVuelo() {
        return lblHorasVuelo;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public JLabel getLblTipoTerreno() {
        return lblTipoTerreno;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public JLabel getLblVehiculos() {
        return lblVehiculos;
    }

    public JPanel getPanelAerea() {
        return panelAerea;
    }

    public JPanel getPanelBase() {
        return panelBase;
    }

    public JPanel getPanelMaritima() {
        return panelMaritima;
    }

    public JPanel getPanelOperaciones() {
        return panelOperaciones;
    }

    public JPanel getPanelTerrestre() {
        return panelTerrestre;
    }

    public JTextField getTxtAeronaves() {
        return txtAeronaves;
    }

    public JTextField getTxtAreaMaritima() {
        return txtAreaMaritima;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public JTextField getTxtEfectivos() {
        return txtEfectivos;
    }

    public JTextField getTxtEmbarcaciones() {
        return txtEmbarcaciones;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public JTextField getTxtHorasVuelo() {
        return txtHorasVuelo;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtTipoTerreno() {
        return txtTipoTerreno;
    }

    public JTextField getTxtVehiculos() {
        return txtVehiculos;
    }
}
