package domain;

import java.io.Serializable;

// todo lo que debe tener una clase para ser JavaBeans 
// implementes Serializable, atributos private, un constructor vacio 
// tener un get y set por cada atributo privado 
public class Persona implements Serializable {

    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
