
import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {

        int edades[] = {5, 6, 8, 9, 10, 11, 12, 13, 14};

        // for normal 
        // for (int i = 0; i < edades.length; i++) {
        // for Each mejorado 
        for (int edad : edades) {
            System.out.println("edad = " + edad);

        }

        System.out.println("");

        // creación de objetos con arrays y sintaxis resumida        
        Persona personas[] = {new Persona("Juan"),
            new Persona("Camilo"),
            new Persona("Carlos")};

        for (Persona persona : personas) {

            System.out.println("persona = " + persona);

        }

    }

}
