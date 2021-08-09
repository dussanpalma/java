package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println(empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Dussan Palma", 'F', 23, "Barranquilla-Colombia"); // para que salgan los parametros se debe undir Ctrl + space
        System.out.println(cliente1);

    }

}
