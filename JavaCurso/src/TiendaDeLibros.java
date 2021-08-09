
import java.util.Scanner;

public class TiendaDeLibros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //scanner siempre pide un string 
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine()); // de String a int 
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine()); //de String a double 
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine()); //de String a double

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }

}
