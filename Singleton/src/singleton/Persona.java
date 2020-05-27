package singleton;

/**
 *
 * @author carli
 */

class Persona {
    //declarando
    private String nombre;
    private String apellido;
    private int edad;
    private int pasos = 0;
    private static Persona instancia;

    private Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //iniciando metodo para introducir datos que posteriormente necesitaremos
    public static Persona getInstance (String nombre, String apellido, int edad) {
        if (instancia==null) {
            instancia = new Persona(nombre,apellido,edad);
        }
        return instancia;
    }
    //sumando los pasos
    public void caminar(){
        pasos++;
    }
    //obteniendo los pasos
    public int getPasos() {
        return pasos;
    }
    //obteniendo nombre
    public String getNombre() {
        return nombre;
    }
    //Obteniendo apellido
    public String getApellido() {
        return apellido;
    }
    //obteniendo edad
    public int getEdad() {
        return edad;
    }

}