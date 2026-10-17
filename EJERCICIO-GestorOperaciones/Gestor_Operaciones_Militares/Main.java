import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args){
        iniciarPrograma();    
    }
    
    private static void iniciarPrograma(){
        GestorOperaciones gestor = new GestorOperaciones();
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println(crearMenu());
        System.out.print("Ingrese una opcion(1-8): ");
        int opcion = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        switch(opcion){
            case 1:
                System.out.print("Ingrese el tipo de operacion(Terrestre, Maritima, Aerea): ");
                String tipo = sc.nextLine();
                OperacionMilitar nueva = pedirDatosOperacion(sc, tipo);
                if(nueva!=null){
                    gestor.registrarOperacion(nueva);
                    System.out.println("Operacion registrada con exito \n");   
                }
                else{
                    System.out.println("No se pudo registrar la operacion \n");
                }
                break;
            case 2:
                System.out.println(gestor.consultarOperaciones());
                break;
            case 3:
                System.out.print("Ingrese el codigo de la operacion: ");
                String codigo = sc.nextLine();
                OperacionMilitar operacion = gestor.buscarOperacion(codigo);
                if(operacion!=null){
                    System.out.println(operacion.toString());
                }
                else{
                    System.out.println("Esa operacion no existe \n");   
                }
                break;
            case 4:
                System.out.print("Ingrese el codigo de la operacion a cambiar de estado: ");
                String codigoCambiar = sc.nextLine();
                System.out.print("Nuevo estado (EN_EJECUCION, FINALIZADA): ");
                Estado nuevoEstado = Estado.valueOf(sc.nextLine().toUpperCase().replace(" ", "_"));
                if (gestor.cambiarEstado(codigoCambiar, nuevoEstado)) {
                    System.out.println("Estado actualizado correctamente \n");
                } 
                else {
                    System.out.println("No se encontro una operacion con ese codigo \n");
                }
                break;
            case 5:
                System.out.print("Ingrese el tipo de operacion(terrestre, aerea, maritima): ");
                String tipoOperacion = sc.nextLine();
                System.out.println(gestor.mostrarOperacionesXTipo(tipoOperacion));
                break;
            case 6: 
                System.out.println(gestor.mostrarComplejidades());
                break;
            case 7: 
                OperacionMilitar masCompleja = gestor.buscarOperacionMasCompleja(); 
                if(masCompleja!=null){
                    System.out.println(masCompleja.toString());
                }else{
                    System.out.println("No hay operaciones registradas \n");
                }
                break;
            case 8:
                System.out.print("Programa Finalizado \n");
                System.exit(0);
            default:
                System.out.println("Opcion no valida, intenta de nuevo \n");
                break;
        }
        }
    }  
    
    private static String crearMenu(){
        String menu = "====GESTOR DE OPERACIONES MILITARES====\n";
        menu += "1. Registrar una nueva operacion \n";
        menu += "2. Consultar todas las operaciones registradas \n";
        menu += "3. Buscar operacion por su codigo \n";
        menu += "4. Cambiar el estado de una operacion \n";
        menu += "5. Mostrar las operaciones de determinado tipo \n";
        menu += "6. Calcular y mostrar el nivel de complejidad de cada operacion \n";
        menu += "7. Determinar operacion de mayor complejidad \n";
        menu += "8. Salir";
        
        return menu;
    }
    
    private static OperacionMilitar pedirDatosOperacion(Scanner sc, String tipo){
        System.out.print("Ingrese el codigo de la operacion: ");
        String codigo = sc.nextLine();
        
        System.out.print("Ingrese el nombre de la operacion: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese la zona de la operacion: ");
        String zona = sc.nextLine();
        
        System.out.print("Ingrese La fecha de la operacion: \n");
        System.out.print("-Ingrese el dia(numero): ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("-Ingrese el mes(numero): ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.print("-Ingrese el anio: ");
        int anio = Integer.parseInt(sc.nextLine());
        Fecha fecha = new Fecha(dia, mes, anio);
        
        System.out.print("Ingrese la cantidad de efectivos asignados: ");
        int efectivos = Integer.parseInt(sc.nextLine());
        
        if(tipo.equalsIgnoreCase("terrestre")){
            System.out.print("Ingrese el tipo de terreno: ");
            String tipoTerreno = sc.nextLine();
            
            System.out.print("Ingrese el numero de vehiculos utilizados: ");
            int vehiculos = Integer.parseInt(sc.nextLine());
            
            return new OperacionTerrestre(codigo, nombre, zona, fecha, Estado.PLANEADA, efectivos, tipoTerreno, vehiculos);
        }
        else if(tipo.equalsIgnoreCase("aerea")){
            System.out.print("Ingrese el numero de aeronaves utilizadas: ");
            int aeronaves = Integer.parseInt(sc.nextLine());
            
            System.out.print("Ingrese el numero estimado de horas de vuelo: ");
            int horasVuelo = Integer.parseInt(sc.nextLine());
            
            return new OperacionAerea(codigo, nombre, zona, fecha, Estado.PLANEADA, efectivos, aeronaves, horasVuelo);
        }
        else if(tipo.equalsIgnoreCase("maritima")){
            System.out.print("Ingrese el area maritima donde se desarrolla: ");
            String areaMaritima = sc.nextLine();
            
            System.out.print("Ingrese el numero de embarcaciones utilizadas: ");
            int embarcaciones = Integer.parseInt(sc.nextLine());
            
            return new OperacionMaritima(codigo, nombre, zona, fecha, Estado.PLANEADA, efectivos, areaMaritima, embarcaciones);
        }
        
        return null;
    }
    
}