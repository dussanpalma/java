package test;

import static aritmetica.Aritmetica.division;
import exepciones.OperacionExepcion;

public class TestExepciones {

    public static void main(String[] args) {

        int resultado = 0;

        // poner exceptiones de menor a mayor gerarquia 
        try {
            resultado = division(10, 0);

        } catch (OperacionExepcion e) {

            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Ocurrio un error de  tipo Exception : ");
            // e.printStackTrace(System.out);
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Se reviso la division entre cero");

        }

        System.out.println("Resultado: " + resultado);
    }

}
