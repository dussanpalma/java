
import java.util.Scanner;

public class CambiarVariable {
    
    public static void main(String args[]) {

        // de String a int 
        int edad = Integer.parseInt("20");
        int edad1 = Integer.parseInt("25");
        int edad2 = Integer.parseInt("30");
        int edad3 = Integer.parseInt("35");
        
        System.out.println(edad + edad1 + edad2 + edad3); //sumandolos 

        // de String a Double 
        double ValorPI = Double.parseDouble("3.1416");
        System.out.println(ValorPI);

        // pedir un valor con Scanner en la consola scanner siempre pide un String 
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(consola.nextLine()); // aqui lo convertimos a int porque siempre pide String Scanner 
        System.out.println("Edad: " + edad);

        // de int a String 
        String EdadTexto = String.valueOf(10);        
        System.out.println(EdadTexto + "Edad Texto = ");

        // para imprimir un caracter  
        char caracter = "Hola".charAt(1);        // el metodo charAt solicita solo un caracter
        System.out.println("caracter = " + caracter);
        
        //ejemplo para solicitar un caracter con el metodo chatAt
        System.out.println("Proporciona un caracter");
        caracter=consola.nextLine().charAt(0); 
        System.out.println("caracter = " + caracter);
        
    }
    
}
