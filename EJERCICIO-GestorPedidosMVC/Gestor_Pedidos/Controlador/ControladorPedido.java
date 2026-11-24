package Controlador;

import Modelo.Cliente;
import Modelo.Pedido;
import Modelo.Producto;
import Vista.FrmPedido;

public class ControladorPedido {

    private FrmPedido vista;
    private Cliente cliente;

    public ControladorPedido(FrmPedido vista) {
        this.vista = vista;
        this.cliente = new Cliente();
        this.cliente.setPedido(new Pedido());
    }

    public ControladorPedido(FrmPedido vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
        if (this.cliente.getPedido() == null) {
            this.cliente.setPedido(new Pedido());
        }
    }

    public void agregarProducto(String codigo, String nombre, double precio) {
        Producto producto = new Producto(codigo, nombre, precio);
        if (this.cliente.getPedido() == null) {
            this.cliente.setPedido(new Pedido());
        }
        this.cliente.getPedido().agregarProducto(producto);
    }

    public void eliminarProducto(String codigoProducto) {
        if (this.cliente.getPedido() != null && this.cliente.getPedido().getProductos() != null) {
            this.cliente.getPedido().getProductos().removeIf(
                p -> p.getCodigo().equalsIgnoreCase(codigoProducto)
            );
        }
    }

    public double calcularTotal() {
        double total = 0;
        if (this.cliente.getPedido() != null && this.cliente.getPedido().getProductos() != null) {
            for (Producto p : this.cliente.getPedido().getProductos()) {
                total += p.getPrecio();
            }
        }
        return total;
    }

    public void nuevoPedido(int numeroPedido, String cedula, String nombreCliente) {
        Pedido nuevoPedido = new Pedido(numeroPedido);
        this.cliente.setCedula(cedula);
        this.cliente.setNombre(nombreCliente);
        this.cliente.setPedido(nuevoPedido);
    }

    public void limpiarPedido() {
        if (this.cliente.getPedido() != null && this.cliente.getPedido().getProductos() != null) {
            this.cliente.getPedido().getProductos().clear();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FrmPedido getVista() {
        return vista;
    }

    public void setVista(FrmPedido vista) {
        this.vista = vista;
    }
}