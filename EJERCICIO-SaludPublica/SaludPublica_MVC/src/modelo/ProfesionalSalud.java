package modelo;


/**
 * Write a description of class ProfesionalSalud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProfesionalSalud extends Persona
{
    private String institucionSalud;
    private String especialidad;
    private ElementoBioseguridad montoBioseguridad;
    private Medicina montoMedicina;
    
    public ProfesionalSalud(){}
    
    public ProfesionalSalud(TipoDocumento tipoDocumento, String documento, String nombre, String apellido,
                            String direccion, String telefono, String estadoCivil,
                            int edad, int estrato, Bono bono,
                            String institucionSalud, String especialidad,
                            ElementoBioseguridad montoBioseguridad, Medicina montoMedicina) {
        super(tipoDocumento, documento, nombre, apellido, direccion, telefono,
              estadoCivil, edad, estrato, bono);
        this.institucionSalud = institucionSalud;
        this.especialidad = especialidad;
        this.montoBioseguridad = montoBioseguridad;
        this.montoMedicina = montoMedicina;
    }

    public String getInstitucionSalud() {
        return institucionSalud;
    }

    public void setInstitucionSalud(String institucionSalud) {
        this.institucionSalud = institucionSalud;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ElementoBioseguridad getMontoBioseguridad() {
        return montoBioseguridad;
    }

    public void setMontoBioseguridad(ElementoBioseguridad montoBioseguridad) {
        this.montoBioseguridad = montoBioseguridad;
    }

    public Medicina getMontoMedicina() {
        return montoMedicina;
    }

    public void setMontoMedicina(Medicina montoMedicina) {
        this.montoMedicina = montoMedicina;
    }

}