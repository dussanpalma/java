package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Dussan", 5000);

//        determinarTipo(empleado);
        empleado = new Gerente("Karla", 5000, "Contabiliad");
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {  // aqui preguntamos si la variable empleado es de tipo Gerente

            System.out.println("Es de tipo gerente");   // vamos utilizando tipos del menos especifico 

            Gerente gerente = (Gerente) empleado;  // conversion de variable de Empleado a Gerente // conversion de variable de Clase Padre a clase hija 
            gerente.getDepartamento();
            System.out.println("Gerente = " + gerente.getDepartamento());
            
            // conversion de variable sintaxis corta 
            // ((Gerente) empleado).getDepartamento();

        } else if (empleado instanceof Empleado) {

            System.out.println("Es de tipo Empleado");

        } else if (empleado instanceof Object) {

            System.out.println("No es de tipo object");  // al mas especifico 

        }

    }

}
