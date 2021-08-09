package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersona;

    // todos los bloques de inicialización son antes del constructor
    static { //bloque de inicialización statico, no se puede utilizar this. 

        System.out.println("Ejecución bloue estatico");
        ++Persona.contadorPersona;

        // idPersona = 10;  esta variable no se puede iniciar aqui, porque no es static
    }

    // bloque de inicialización no estatico  
    {
        System.out.println("Ejecución bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;

    }

    // constructor 
    public Persona() {

        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
