/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public class Gestor {

    private ArrayList<OperacionMilitar> operaciones;

    public Gestor() {
        this.operaciones = new ArrayList<>();
    }

    private boolean validarOperacion(OperacionMilitar operacion) {
        for (OperacionMilitar op : operaciones) {
            if (op.getCodigo().equals(operacion.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    public boolean agregarOperacion(OperacionMilitar operacion) {
        if (validarOperacion(operacion)) {
            operaciones.add(operacion);
            return true;
        }
        return false;
    }

    public String listarOperaciones() {
        StringBuilder sb = new StringBuilder();
        for (OperacionMilitar op : operaciones) {
            sb.append(op.toString()).append("\n");
        }
        return sb.toString();
    }

    public OperacionMilitar buscarPorCodigo(String codigo) {
        for (OperacionMilitar op : operaciones) {
            if (op.getCodigo().equals(codigo)) {
                return op;
            }
        }
        return null;
    }

    public boolean actualizarEstado(String codigo, Estado estado) {
        OperacionMilitar operacion = buscarPorCodigo(codigo);
        if (operacion == null) {
            return false;
        }
        operacion.setEstado(estado);
        return true;
    }

    public String listarPorTipo(String tipo) {
        StringBuilder sb = new StringBuilder();
        for (OperacionMilitar op : operaciones) {
            if (tipo.equals("Terrestre") && op instanceof OperacionTerrestre) {
                sb.append(op.toString()).append("\n");
            } else if (tipo.equals("Maritima") && op instanceof OperacionMaritima) {
                sb.append(op.toString()).append("\n");
            } else if (tipo.equals("Aerea") && op instanceof OperacionAerea) {
                sb.append(op.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public String mostrarComplejidades() {
        StringBuilder sb = new StringBuilder();
        for (OperacionMilitar op : operaciones) {
            sb.append("Codigo: ").append(op.getCodigo()).append(" - Nombre: ").append(op.getNombre()).append(" - Complejidad: ").append(op.calcularComplejidad()).append("\n");
        }
        return sb.toString();
    }

    public OperacionMilitar mayorComplejidad() {
        if (operaciones.isEmpty()) {
            return null;
        }
        OperacionMilitar max = operaciones.get(0);
        for (OperacionMilitar op : operaciones) {
            if (op.calcularComplejidad() > max.calcularComplejidad()) {
                max = op;
            }
        }
        return max;
    }
}
