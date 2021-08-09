
import java.util.Scanner;

public class BucleWhileHacker {

    public static void main(String args[]) {

        System.out.println("Escribe un Numero y lo multiplicare hasta 40");

        Scanner consola = new Scanner(System.in);
        int N = Integer.parseInt(consola.nextLine());

        int i = 0;

        while (N < 40) {

            System.out.println(N + " x " + i + " = " + N * i);
            i++;

            if (i == 41) {

                break;
            }
        }

    }

}
