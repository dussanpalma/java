package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    /* es una variable que se asocia con la clase, se incrementa 
      con cada objeto que se crea*/
    
    public Persona(String nombre) {
        this.nombre = nombre;

        Persona.contadorPersona++; /* no se necesita this, por ser static
        // en los estatic utilizamos alante el nombre de la class 
         en los atributos que no son static utilizamos el this */

        this.idPersona = Persona.contadorPersona;

    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
