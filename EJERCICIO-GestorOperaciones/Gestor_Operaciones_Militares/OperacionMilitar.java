
/**
 * Write a description of class OperacionMilitar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class OperacionMilitar
{
    protected String codigo, nombre, zona;
    protected Fecha fecha;
    protected Estado estado;
    protected int efectivos;
    
    public OperacionMilitar(){}
    
    public OperacionMilitar(String codigo, String nombre, String zona, Fecha fecha, Estado estado, int efectivos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.zona = zona;
        this.fecha = fecha;
        this.estado = estado;
        this.efectivos = efectivos;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getEfectivos() {
        return efectivos;
    }

    public void setEfectivos(int efectivos) {
        this.efectivos = efectivos;
    }
    
    public abstract int calcularComplejidad();
    
    @Override
    public String toString() {
        return "Codigo: " + codigo + 
           " | Nombre: " + nombre + 
           " | Zona: " + zona + 
           " | Fecha: " + fecha + 
           " | Estado: " + estado + 
           " | Efectivos: " + efectivos;
    }
}