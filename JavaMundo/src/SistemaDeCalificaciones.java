
import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10");
        int valor = Integer.parseInt(consola.nextLine());

        if (valor == 10 || valor == 9) {
            System.out.println("A");
        } else if (valor < 9 && valor == 8) {
            System.out.println("B");
        } else if (valor < 8 && valor == 7) {
            System.out.println("C");
        } else if (valor < 7 && valor == 6) {
            System.out.println("D");
        } else if (valor < 6) {
            System.out.println("F");
        } else{ 
            System.out.println("Numero no valido");
        }

    }

}
