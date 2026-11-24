/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import vista.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
        vista.getBtnRegistrar().addActionListener(this);
        vista.getBtnMostrarOperaciones().addActionListener(this);
        vista.getBtnBuscar().addActionListener(this);
        vista.getBtnCambiarEstado().addActionListener(this);
        vista.getBtnMostrarPorTipo().addActionListener(this);
        vista.getBtnMostrarComplejidades().addActionListener(this);
        vista.getBtnMayorComplejidad().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == vista.getCbTipo()) {
            habilitar();
        } else if (source == vista.getBtnRegistrar()) {
            registar();
        } else if (source == vista.getBtnMostrarOperaciones()) {
            mostrarOperaciones();
        } else if (source == vista.getBtnBuscar()) {
            buscar();
        } else if (source == vista.getBtnCambiarEstado()) {
            cambiarEstado();
        } else if (source == vista.getBtnMostrarPorTipo()) {
            mostrarPorTipo();
        } else if (source == vista.getBtnMostrarComplejidades()) {
            mostrarComplejidades();
        } else if (source == vista.getBtnMayorComplejidad()) {
            mayorComplejidad();
        }
    }

    private void habilitar() {
        int seleccionado = vista.getCbTipo().getSelectedIndex();
        switch (seleccionado) {
            case 0:
                vista.getTxtTipoTerreno().setEnabled(false);
                vista.getTxtVehiculos().setEnabled(false);
                vista.getTxtAeronaves().setEnabled(false);
                vista.getTxtHorasVuelo().setEnabled(false);
                vista.getTxtEmbarcaciones().setEnabled(false);
                vista.getTxtAreaMaritima().setEnabled(false);
                break;
            case 1:
                vista.getTxtTipoTerreno().setEnabled(true);
                vista.getTxtVehiculos().setEnabled(true);
                vista.getTxtAeronaves().setEnabled(false);
                vista.getTxtHorasVuelo().setEnabled(false);
                vista.getTxtEmbarcaciones().setEnabled(false);
                vista.getTxtAreaMaritima().setEnabled(false);
                break;
            case 2:
                vista.getTxtTipoTerreno().setEnabled(false);
                vista.getTxtVehiculos().setEnabled(false);
                vista.getTxtAeronaves().setEnabled(true);
                vista.getTxtHorasVuelo().setEnabled(true);
                vista.getTxtEmbarcaciones().setEnabled(false);
                vista.getTxtAreaMaritima().setEnabled(false);
                break;
            case 3:
                vista.getTxtTipoTerreno().setEnabled(false);
                vista.getTxtVehiculos().setEnabled(false);
                vista.getTxtAeronaves().setEnabled(false);
                vista.getTxtHorasVuelo().setEnabled(false);
                vista.getTxtEmbarcaciones().setEnabled(true);
                vista.getTxtAreaMaritima().setEnabled(true);
                break;
        }
    }

    private void registar() {
        String codigo = vista.getTxtCodigo().getText().trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe escribir el codigo de la operacion", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nombre = vista.getTxtNombre().getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe escribir el nombre de la operacion", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String fecha = vista.getTxtFecha().getText().trim();
        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe escribir la fecha de la operacion", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(vista, "El formato de la fecha debe ser DD/MM/AAAA", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int efectivos;
        try {
            String efectivosStr = vista.getTxtEfectivos().getText().trim();
            if (efectivosStr.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Debe escribir la cantidad de efectivos", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            efectivos = Integer.parseInt(efectivosStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "La cantidad de efectivos debe ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Estado estado = Estado.valueOf(vista.getCbEstado().getSelectedItem().toString());

        switch (vista.getCbTipo().getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(vista, "Debe seleccionar el tipo de operacion", "", JOptionPane.WARNING_MESSAGE);
                return;
            case 1:
                String tipoTerreno = vista.getTxtTipoTerreno().getText().trim();
                if (tipoTerreno.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Debe escribir el tipo de terreno", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int vehiculos;
                try {
                    String vehiculosStr = vista.getTxtVehiculos().getText().trim();
                    if (vehiculosStr.isEmpty()) {
                        JOptionPane.showMessageDialog(vista, "Debe escribir la cantidad de vehiculos", "", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    vehiculos = Integer.parseInt(vehiculosStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(vista, "La cantidad de vehiculos debe ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                OperacionTerrestre operacionTerrestre = new OperacionTerrestre(tipoTerreno, vehiculos, codigo, nombre, fecha, estado, efectivos);
                if (modelo.agregarOperacion(operacionTerrestre)) {
                    JOptionPane.showMessageDialog(vista, "Operacion registrada exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
                    vista.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "Ya existe operacion con ese codigo", "", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case 2:
                int aeronaves;
                try {
                    String aeronavesStr = vista.getTxtAeronaves().getText().trim();
                    if (aeronavesStr.isEmpty()) {
                        JOptionPane.showMessageDialog(vista, "Debe escribir la cantidad de aeronaves", "", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    aeronaves = Integer.parseInt(aeronavesStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(vista, "La cantidad de aeronaves debe ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int horasVuelo;
                try {
                    String horasVueloStr = vista.getTxtHorasVuelo().getText().trim();
                    if (horasVueloStr.isEmpty()) {
                        JOptionPane.showMessageDialog(vista, "Debe escribir las horas de vuelo", "", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    horasVuelo = Integer.parseInt(horasVueloStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(vista, "La horas de vuelo deben ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                OperacionAerea operacionAerea = new OperacionAerea(aeronaves, horasVuelo, codigo, nombre, fecha, estado, efectivos);
                if (modelo.agregarOperacion(operacionAerea)) {
                    JOptionPane.showMessageDialog(vista, "Operacion registrada exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
                    vista.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "Ya existe operacion con ese codigo", "", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case 3:
                int embarcaciones;
                try {
                    String embarcacionesStr = vista.getTxtEmbarcaciones().getText().trim();
                    if (embarcacionesStr.isEmpty()) {
                        JOptionPane.showMessageDialog(vista, "Debe escribir la cantidad de embarcaciones", "", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    embarcaciones = Integer.parseInt(embarcacionesStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(vista, "La cantidad de embarcaciones deben ser un numero entero", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                String areaMaritima = vista.getTxtAreaMaritima().getText().trim();
                if (areaMaritima.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Debe escribir el area maritima", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                OperacionMaritima operacionMaritima = new OperacionMaritima(embarcaciones, areaMaritima, codigo, nombre, fecha, estado, efectivos);
                if (modelo.agregarOperacion(operacionMaritima)) {
                    JOptionPane.showMessageDialog(vista, "Operacion registrada exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
                    vista.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "Ya existe operacion con ese codigo", "", JOptionPane.WARNING_MESSAGE);
                }
                break;
        }
    }

    private void mostrarOperaciones() {
        if (modelo.listarOperaciones().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "No hay operaciones registradas", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(vista, modelo.listarOperaciones(), "", JOptionPane.INFORMATION_MESSAGE);
    }

    private void buscar() {
        String codigo = vista.getTxtCodigo().getText().trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Debe Ingresar el codigo de la operacion que desea buscar", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OperacionMilitar operacion = modelo.buscarPorCodigo(codigo);
        if (operacion == null) {
            JOptionPane.showMessageDialog(vista, "No existe esa operacion", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(vista, operacion.toString(), "", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cambiarEstado() {
        String codigo = JOptionPane.showInputDialog(vista, "Ingrese el código de la operación a modificar:", "", JOptionPane.QUESTION_MESSAGE);
        if (codigo == null || codigo.trim().isEmpty()) {
            return;
        }

        String[] estados = {"PLANEADA", "EN_EJECUCION", "FINALIZADA"};
        int seleccion = JOptionPane.showOptionDialog(vista, "Seleccione el nuevo estado:", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);

        if (seleccion != -1) {
            Estado nuevoEstado = Estado.valueOf(estados[seleccion]);
            boolean exito = modelo.actualizarEstado(codigo.trim(), nuevoEstado);
            if (exito) {
                JOptionPane.showMessageDialog(vista, "Estado actualizado exitosamente.", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(vista, "No existe una operación con ese código.", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void mostrarPorTipo() {
        String[] tipos = {"Terrestre", "Aerea", "Maritima"};
        int seleccion = JOptionPane.showOptionDialog(vista, "¿Qué tipo de operaciones desea visualizar?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);

        if (seleccion != -1) {
            String tipo = tipos[seleccion];
            String resultado = modelo.listarPorTipo(tipo);
            if (resultado.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "No hay operaciones de tipo " + tipo, "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(vista, resultado, "Operaciones " + tipo, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void mostrarComplejidades() {
        String resultado = modelo.mostrarComplejidades();
        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "No hay operaciones registradas", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(vista, resultado, "Complejidades", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void mayorComplejidad() {
        OperacionMilitar op = modelo.mayorComplejidad();
        if (op == null) {
            JOptionPane.showMessageDialog(vista, "No hay operaciones registradas", "", JOptionPane.ERROR_MESSAGE);
        } else {
            String mensaje = "¡LA OPERACIÓN MÁS COMPLEJA ES!\n\n" + op.toString() + "\n\nNivel de Complejidad: " + op.calcularComplejidad();
            JOptionPane.showMessageDialog(vista, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
