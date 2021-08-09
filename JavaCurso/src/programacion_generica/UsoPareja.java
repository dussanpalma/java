package programacion_generica;

public class UsoPareja {

    public static void main(String[] args) {

//        Convirtiendolo en tipo String  
        Pareja<String> una = new Pareja<>();
        una.setPrimero("Juan");
        System.out.println(una.getPrimero());

        // convirtiendolo en tipo objeto
        Persona pers1 = new Persona("Ana");
        Pareja<Persona> dos = new Pareja<>();
        dos.setPrimero(pers1);
        System.out.println(dos.getPrimero());

    }

}

class Persona {

    public Persona(String nombre) {

        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

    private String nombre;

}
