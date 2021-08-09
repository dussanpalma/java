package aritmetica;

import exepciones.OperacionExepcion;

public class Aritmetica {

    //sintaxis creando una exepcion propia 
    
    
    public static int division(int numerador, int denominador)
            throws OperacionExepcion {

        if (denominador == 0) {

            throw new OperacionExepcion("Division entre cero");

        }

        return numerador / denominador;

    }

}
