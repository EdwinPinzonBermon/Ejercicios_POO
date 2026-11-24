package Modelo;

public class Cliente
{
    private String cedula;
    private String nombre;
    private Pedido pedido;
    
    public Cliente(){}
    
    public Cliente(String cedula, String nombre, Pedido pedido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.pedido = pedido;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}