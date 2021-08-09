
import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe un numero para sumarlo");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Escribe otro numero para sumarlo");
        int b = Integer.parseInt(scanner.nextLine());
        
        int resultado = a / b; // se puede poner -,*,/, diferentes Aritmeticos 
        double resultado2 = a / b;  // un double por si la division da decimal

        System.out.println("resultado 2 = " + resultado2);

    }

}
