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
        p=Persona.getInstance("Jose", "álvarez", 25);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Pasos: "+ p.getPasos());
        p.caminar();
        System.out.println("Pasos: "+ p.getPasos());
    }
    
}