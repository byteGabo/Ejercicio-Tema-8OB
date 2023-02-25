
import gabo.Persona;

public class Main {
    public static void main(String[] args) {
        //Aqui creo una nueva persona  con su respectivo datos:
        Persona persona1 = new Persona(25,"Manolo", "+50245487512");

        //Aqui uso los metodos get para obtener los datos de la persona
        int edad = persona1.getEdad();
        String nombre = persona1.getNombre();
        String telefono = persona1.getTelefono();

        //Y al final los imprimo por consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono );

    }
}