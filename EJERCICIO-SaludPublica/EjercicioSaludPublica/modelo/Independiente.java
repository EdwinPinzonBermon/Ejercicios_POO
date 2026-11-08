package modelo;


/**
 * Write a description of class Independiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Independiente extends Persona
{
    private boolean esCabezaHogar;
    private Medicina montoMedicina;
    private CanastaFamiliar montoCanasta;
    
    public Independiente(){}
    
    public Independiente(TipoDocumento tipoDocumento, String documento, String nombre, String apellido,
                         String direccion, String telefono, String estadoCivil,
                         int edad, int estrato, Bono bono,
                         boolean esCabezaHogar, Medicina montoMedicina, CanastaFamiliar montoCanasta) {
        super(tipoDocumento, documento, nombre, apellido, direccion, telefono,
              estadoCivil, edad, estrato, bono);
        this.esCabezaHogar = esCabezaHogar;
        this.montoMedicina = montoMedicina;
        this.montoCanasta = montoCanasta;
    }

    public boolean isEsCabezaHogar() {
        return esCabezaHogar;
    }

    public void setEsCabezaHogar(boolean esCabezaHogar) {
        this.esCabezaHogar = esCabezaHogar;
    }

    public Medicina getMontoMedicina() {
        return montoMedicina;
    }

    public void setMontoMedicina(Medicina montoMedicina) {
        this.montoMedicina = montoMedicina;
    }

    public CanastaFamiliar getMontoCanasta() {
        return montoCanasta;
    }

    public void setMontoCanasta(CanastaFamiliar montoCanasta) {
        this.montoCanasta = montoCanasta;
    }

}