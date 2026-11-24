package modelo;

public class Cardenal {
    private String cedula;
    private String nombre;
    private String pais;
    private int edad;
    private TipoCardenal tipo;

    public Cardenal(String cedula, String nombre, String pais, int edad, TipoCardenal tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.tipo = tipo;
    }

    public boolean esElector() {
        return edad < 80;
    }

    // Getters y Setters
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public TipoCardenal getTipo() { return tipo; }
    public void setTipo(TipoCardenal tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return nombre + " (" + pais + ", " + edad + " años)";
    }
}