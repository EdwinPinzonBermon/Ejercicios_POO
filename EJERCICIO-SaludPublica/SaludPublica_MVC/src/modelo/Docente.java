package modelo;


/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente extends Persona
{
    private String InstitucionEducativa;
    private NivelEducativo nivel;
    private ImplementoTecnologico montoTecnologia;
    private Servicio montoServicio;
    
    public Docente(){}
    
    public Docente(TipoDocumento tipoDocumento, String documento, String nombre, String apellido,
                   String direccion, String telefono, String estadoCivil,
                   int edad, int estrato, Bono bono,
                   String InstitucionEducativa, NivelEducativo nivel,
                   ImplementoTecnologico montoTecnologia, Servicio montoServicio) {
        super(tipoDocumento, documento, nombre, apellido, direccion, telefono,
              estadoCivil, edad, estrato, bono);
        this.InstitucionEducativa = InstitucionEducativa;
        this.nivel = nivel;
        this.montoTecnologia = montoTecnologia;
        this.montoServicio = montoServicio;
    }

    public String getInstitucionEducativa() {
        return InstitucionEducativa;
    }

    public void setInstitucionEducativa(String InstitucionEducativa) {
        this.InstitucionEducativa = InstitucionEducativa;
    }

    public NivelEducativo getNivel() {
        return nivel;
    }

    public void setNivel(NivelEducativo nivel) {
        this.nivel = nivel;
    }

    public ImplementoTecnologico getMontoTecnologia() {
        return montoTecnologia;
    }

    public void setMontoTecnologia(ImplementoTecnologico montoTecnologia) {
        this.montoTecnologia = montoTecnologia;
    }

    public Servicio getMontoServicio() {
        return montoServicio;
    }

    public void setMontoServicio(Servicio montoServicio) {
        this.montoServicio = montoServicio;
    }

}