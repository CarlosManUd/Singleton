package singleton;

/**
 *
 * @author carli
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p;
        p=Persona.getInstance("Carlos", "Figueiras", 21);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Pasos: "+ p.getPasos());
        p.caminar();
        System.out.println("Pasos: "+ p.getPasos());
        //obteniendo datos y mostrandolos por pantalla
    }
    
}