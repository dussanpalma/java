
import java.util.Scanner;

public class ElMayorDeDosNumeros {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el numero 1: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero 2: ");
        int numero2 = Integer.parseInt(consola.nextLine());

        if (numero1 > numero2) {

            System.out.println("El numero mayor es: " + numero1);

        } else if (numero1 < numero2) {

            System.out.println("El numero mayor es: " + numero2);

        } else {

            System.out.println("Los dos numeros son iguales");
            
            
            
            /*  otra forma de hacerlo es con el ternario
            Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2); //(ternario)
                  
            */
        }

    }

}
