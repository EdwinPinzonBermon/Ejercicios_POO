package Modelo;
import java.util.List;
import java.util.ArrayList;

public class Pedido
{
    private int numeroPedido;
    private List<Producto> productos;
    
    public Pedido(){}
    
    public Pedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
        this.productos = new ArrayList<>();
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void eliminarProducto(String codigoProducto){
        for(Producto producto:productos){
            if(producto.getCodigo().equalsIgnoreCase(codigoProducto)){
                productos.remove(producto);
            }
        }
    }
}