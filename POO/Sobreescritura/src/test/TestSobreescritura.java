package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {

    public static void main(String[] args) {

//        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        Empleado empleado = new Empleado("Dussan", 5000);
//        System.out.println("Empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Karla", 5000, "Contabiliad");
        imprimir(gerente);
//        System.out.println("gerente = " + gerente.obtenerDetalles());

    }

    //POLIMORFISMO para que .obtenerDetalles sirva para empleado y para gerente. 
    public static void imprimir(Empleado empleado) {

        System.out.println("empleado = " + empleado.obtenerDetalles());

    }

}
