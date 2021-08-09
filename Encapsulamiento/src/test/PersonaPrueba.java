package test;

import dominio.*;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Dussan", 5000, false);

        // metodo set para modificar información
        // metodo get para recuperar información
        persona1.setNombre("Duvan Palma");
        System.out.println("nombre: " + persona1.getNombre()); // se imprime este nombre, porque se modifico con el set
        System.out.println("sueldo: " + persona1.getSueldo());  // aqui no se modifico
        System.out.println("eliminado: " + persona1.isEliminado());  // aqui tampoco se modifico 

        System.out.println("persona1: " + persona1.toString());  //  este metodo (toString) se utiliza para imprimir todo de una vez

    }

}
