package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.ControladorPedido;

public class FrmPedido extends JFrame implements ActionListener {

    public JTextField txtNumeroPedido;
    public JTextField txtCedula;
    public JTextField txtNombreCliente;
    public JTextField txtCodigoProducto;
    public JTextField txtNombreProducto;
    public JTextField txtPrecio;
    public JButton btnAgregarProducto;
    public JButton btnEliminarProducto;
    public JButton btnNuevoPedido;
    public JButton btnLimpiar;
    public JButton btnSalir;
    public JTable tablaProductos;
    public DefaultTableModel modeloTabla;
    public JLabel lblTotal;
    private ControladorPedido controlador;

    public FrmPedido() {
        setTitle("Gestión de Pedidos");
        setSize(950, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 242, 245));
        setLayout(new BorderLayout(10, 10));

        crearTitulo();
        crearPanelCentral();
        crearPanelInferior();

        setVisible(true);
    }

    private void crearTitulo() {
        JLabel lblTitulo = new JLabel("GESTIÓN DE PEDIDOS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblTitulo.setForeground(new Color(10, 30, 65));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        add(lblTitulo, BorderLayout.NORTH);
    }

    private void crearPanelCentral() {
        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(new Color(240, 242, 245));
        panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));

        panelCentral.add(crearPanelPedidoCliente());
        panelCentral.add(Box.createVerticalStrut(12));
        panelCentral.add(crearPanelProducto());
        panelCentral.add(Box.createVerticalStrut(12));
        panelCentral.add(crearPanelTabla());

        add(panelCentral, BorderLayout.CENTER);
    }

    private JPanel crearPanelPedidoCliente() {
        JPanel panel = new JPanel(new GridLayout(1, 2, 15, 0));
        panel.setBackground(new Color(240, 242, 245));

        JPanel panelPedido = new JPanel(new GridBagLayout());
        panelPedido.setBackground(new Color(248, 249, 250));
        panelPedido.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                "Datos del Pedido",
                javax.swing.border.TitledBorder.LEFT,
                javax.swing.border.TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(10, 30, 65)
            ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lblNum = new JLabel("Número de pedido:");
        lblNum.setFont(new Font("Arial", Font.PLAIN, 14));
        panelPedido.add(lblNum, gbc);

        txtNumeroPedido = new JTextField(12);
        txtNumeroPedido.setFont(new Font("Arial", Font.PLAIN, 14));
        txtNumeroPedido.setPreferredSize(new Dimension(120, 30));
        txtNumeroPedido.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                BorderFactory.createEmptyBorder(2, 6, 2, 6)
            ));
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        panelPedido.add(txtNumeroPedido, gbc);

        JPanel panelCliente = new JPanel(new GridBagLayout());
        panelCliente.setBackground(new Color(248, 249, 250));
        panelCliente.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                "Datos del Cliente",
                javax.swing.border.TitledBorder.LEFT,
                javax.swing.border.TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(10, 30, 65)
            ));

        GridBagConstraints gbcCliente = new GridBagConstraints();
        gbcCliente.insets = new Insets(6, 10, 6, 10);
        gbcCliente.anchor = GridBagConstraints.WEST;

        gbcCliente.gridx = 0;
        gbcCliente.gridy = 0;
        JLabel lblCed = new JLabel("Cédula:");
        lblCed.setFont(new Font("Arial", Font.PLAIN, 14));
        panelCliente.add(lblCed, gbcCliente);

        txtCedula = new JTextField(15);
        txtCedula.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCedula.setPreferredSize(new Dimension(150, 30));
        txtCedula.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                BorderFactory.createEmptyBorder(2, 6, 2, 6)
            ));
        gbcCliente.gridx = 1;
        gbcCliente.fill = GridBagConstraints.HORIZONTAL;
        gbcCliente.weightx = 1.0;
        panelCliente.add(txtCedula, gbcCliente);

        gbcCliente.gridx = 0;
        gbcCliente.gridy = 1;
        gbcCliente.weightx = 0;
        JLabel lblNom = new JLabel("Nombre:");
        lblNom.setFont(new Font("Arial", Font.PLAIN, 14));
        panelCliente.add(lblNom, gbcCliente);

        txtNombreCliente = new JTextField(15);
        txtNombreCliente.setFont(new Font("Arial", Font.PLAIN, 14));
        txtNombreCliente.setPreferredSize(new Dimension(150, 30));
        txtNombreCliente.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                BorderFactory.createEmptyBorder(2, 6, 2, 6)
            ));
        gbcCliente.gridx = 1;
        gbcCliente.fill = GridBagConstraints.HORIZONTAL;
        gbcCliente.weightx = 1.0;
        panelCliente.add(txtNombreCliente, gbcCliente);

        panel.add(panelPedido);
        panel.add(panelCliente);
        return panel;
    }

    private JPanel crearPanelProducto() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 12));
        panel.setBackground(new Color(248, 249, 250));
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                "Datos del Producto",
                javax.swing.border.TitledBorder.LEFT,
                javax.swing.border.TitledBorder.TOP,
                new Font("Segoe UI", Font.BOLD, 14),
                new Color(10, 30, 65)
            ));

        JLabel lblCod = new JLabel("Código:");
        lblCod.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(lblCod);

        txtCodigoProducto = new JTextField(8);
        txtCodigoProducto.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCodigoProducto.setPreferredSize(new Dimension(80, 30));
        txtCodigoProducto.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                BorderFactory.createEmptyBorder(2, 6, 2, 6)
            ));
        panel.add(txtCodigoProducto);

        JLabel lblNom = new JLabel("Nombre:");
        lblNom.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(lblNom);

        txtNombreProducto = new JTextField(15);
        txtNombreProducto.setFont(new Font("Arial", Font.PLAIN, 14));
        txtNombreProducto.setPreferredSize(new Dimension(150, 30));
        txtNombreProducto.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                BorderFactory.createEmptyBorder(2, 6, 2, 6)
            ));
        panel.add(txtNombreProducto);

        JLabel lblPre = new JLabel("Precio:");
        lblPre.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(lblPre);

        txtPrecio = new JTextField(10);
        txtPrecio.setFont(new Font("Arial", Font.PLAIN, 14));
        txtPrecio.setPreferredSize(new Dimension(100, 30));
        txtPrecio.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                BorderFactory.createEmptyBorder(2, 6, 2, 6)
            ));
        panel.add(txtPrecio);

        btnAgregarProducto = new JButton("Agregar Producto");
        btnAgregarProducto.setFont(new Font("Arial", Font.BOLD, 13));
        btnAgregarProducto.setForeground(new Color(10, 30, 65));
        btnAgregarProducto.setBackground(new Color(235, 240, 248));
        btnAgregarProducto.setPreferredSize(new Dimension(160, 35));
        btnAgregarProducto.setFocusPainted(false);
        btnAgregarProducto.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 222), 1));
        btnAgregarProducto.addActionListener(this);
        panel.add(btnAgregarProducto);

        return panel;
    }

    private JPanel crearPanelTabla() {
        JPanel panel = new JPanel(new BorderLayout(15, 0));
        panel.setBackground(new Color(248, 249, 250));
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1),
                "Productos del Pedido",
                javax.swing.border.TitledBorder.LEFT,
                javax.swing.border.TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(10, 30, 65)
            ));

        String[] columnas = {"Código", "Nombre", "Precio"};

        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        tablaProductos = new JTable(modeloTabla);
        tablaProductos.setFont(new Font("Arial", Font.PLAIN, 14));
        tablaProductos.setRowHeight(30);
        tablaProductos.setGridColor(new Color(230, 235, 240));
        tablaProductos.setSelectionBackground(new Color(210, 225, 245));

        tablaProductos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tablaProductos.getTableHeader().setBackground(new Color(225, 232, 240));
        tablaProductos.getTableHeader().setForeground(new Color(30, 50, 80));
        tablaProductos.getTableHeader().setPreferredSize(new Dimension(0, 35));

        JScrollPane scroll = new JScrollPane(tablaProductos);
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 222)));

        panel.add(scroll, BorderLayout.CENTER);

        btnEliminarProducto = new JButton("Eliminar Producto");
        btnEliminarProducto.setFont(new Font("Arial", Font.BOLD, 13));
        btnEliminarProducto.setForeground(new Color(10, 30, 65));
        btnEliminarProducto.setBackground(new Color(235, 240, 248));
        btnEliminarProducto.setPreferredSize(new Dimension(160, 40));
        btnEliminarProducto.setFocusPainted(false);
        btnEliminarProducto.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 222), 1));
        btnEliminarProducto.addActionListener(this);

        JPanel panelEliminar = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        panelEliminar.setBackground(new Color(248, 249, 250));
        panelEliminar.add(btnEliminarProducto);

        panel.add(panelEliminar, BorderLayout.EAST);

        return panel;
    }

    private void crearPanelInferior() {
        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(new Color(248, 249, 250));
        panelInferior.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(0, 20, 15, 20),
                BorderFactory.createLineBorder(new Color(210, 215, 222), 1)
            ));
        panelInferior.setLayout(new BoxLayout(panelInferior, BoxLayout.Y_AXIS));

        JPanel panelTotal = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 10));
        panelTotal.setBackground(new Color(248, 249, 250));

        JLabel lblTextoTotal = new JLabel("TOTAL DEL PEDIDO:");
        lblTextoTotal.setFont(new Font("Arial", Font.BOLD, 16));
        lblTextoTotal.setForeground(new Color(10, 30, 65));

        lblTotal = new JLabel("$ 0", SwingConstants.CENTER);
        lblTotal.setFont(new Font("Arial", Font.BOLD, 22));
        lblTotal.setForeground(new Color(10, 30, 65));
        lblTotal.setOpaque(true);
        lblTotal.setBackground(new Color(225, 235, 248));
        lblTotal.setPreferredSize(new Dimension(180, 42));
        lblTotal.setBorder(BorderFactory.createLineBorder(new Color(180, 200, 235), 1));

        panelTotal.add(lblTextoTotal);
        panelTotal.add(lblTotal);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 10));
        panelBotones.setBackground(new Color(248, 249, 250));

        btnNuevoPedido = new JButton("Nuevo Pedido");
        btnLimpiar = new JButton("Limpiar Campos");
        btnSalir = new JButton("Salir");

        Dimension btnSize = new Dimension(170, 40);
        Font btnFont = new Font("Arial", Font.BOLD, 13);
        Color btnColorText = new Color(10, 30, 65);
        Color btnBg = new Color(235, 240, 248);

        btnNuevoPedido.setPreferredSize(btnSize);
        btnNuevoPedido.setFont(btnFont);
        btnNuevoPedido.setForeground(btnColorText);
        btnNuevoPedido.setBackground(btnBg);
        btnNuevoPedido.setFocusPainted(false);
        btnNuevoPedido.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 222), 1));
        btnNuevoPedido.addActionListener(this);

        btnLimpiar.setPreferredSize(btnSize);
        btnLimpiar.setFont(btnFont);
        btnLimpiar.setForeground(btnColorText);
        btnLimpiar.setBackground(btnBg);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 222), 1));
        btnLimpiar.addActionListener(this);

        btnSalir.setPreferredSize(btnSize);
        btnSalir.setFont(btnFont);
        btnSalir.setForeground(btnColorText);
        btnSalir.setBackground(btnBg);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorder(BorderFactory.createLineBorder(new Color(210, 215, 222), 1));
        btnSalir.addActionListener(this);

        panelBotones.add(btnNuevoPedido);
        panelBotones.add(btnLimpiar);
        panelBotones.add(btnSalir);

        panelInferior.add(panelTotal);
        panelInferior.add(panelBotones);

        add(panelInferior, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarProducto) {
            String codigo = txtCodigoProducto.getText().trim();
            String nombre = txtNombreProducto.getText().trim();
            String precioTexto = txtPrecio.getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty() || precioTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor complete todos los campos del producto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                double precio = Double.parseDouble(precioTexto);

                // Agregar al modelo de la tabla en la GUI
                modeloTabla.addRow(new Object[]{codigo, nombre, String.format("%.2f", precio)});

                // Notificar al Controlador
                if (controlador != null) {
                    controlador.agregarProducto(codigo, nombre, precio);
                    lblTotal.setText("$ " + String.format("%.2f", controlador.calcularTotal()));
                }

                // Limpiar campos del producto
                txtCodigoProducto.setText("");
                txtNombreProducto.setText("");
                txtPrecio.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == btnEliminarProducto) {
            int filaSeleccionada = tablaProductos.getSelectedRow();

            if (filaSeleccionada >= 0) {
                String codigo = modeloTabla.getValueAt(filaSeleccionada, 0).toString();

                // Eliminar de la tabla en la GUI
                modeloTabla.removeRow(filaSeleccionada);

                // Notificar al Controlador
                if (controlador != null) {
                    controlador.eliminarProducto(codigo);
                    lblTotal.setText("$ " + String.format("%.2f", controlador.calcularTotal()));
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        } else if (e.getSource() == btnNuevoPedido) {
            String numPedidoTexto = txtNumeroPedido.getText().trim();
            String cedula = txtCedula.getText().trim();
            String nombreCliente = txtNombreCliente.getText().trim();

            if (numPedidoTexto.isEmpty() || cedula.isEmpty() || nombreCliente.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el número de pedido y datos del cliente.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                int numPedido = Integer.parseInt(numPedidoTexto);

                // Reiniciar tabla y GUI
                modeloTabla.setRowCount(0);
                lblTotal.setText("$ 0");

                // Notificar al Controlador
                if (controlador != null) {
                    controlador.nuevoPedido(numPedido, cedula, nombreCliente);
                }

                JOptionPane.showMessageDialog(this, "Nuevo pedido creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El número de pedido debe ser un entero.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == btnLimpiar) {
            txtNumeroPedido.setText("");
            txtCedula.setText("");
            txtNombreCliente.setText("");
            txtCodigoProducto.setText("");
            txtNombreProducto.setText("");
            txtPrecio.setText("");
            modeloTabla.setRowCount(0);
            lblTotal.setText("$ 0");

            if (controlador != null) {
                controlador.limpiarPedido();
            }

        } else if (e.getSource() == btnSalir) {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicación?", "Confirmar Salida", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
