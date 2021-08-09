
import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(consola.nextLine());
        int Perimetro = (alto + ancho) * 2;
        int Area = alto * ancho;

        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);

    }

}
