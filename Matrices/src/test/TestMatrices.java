package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {

        int edades[][] = new int[3][2]; // declarando matriz 

        edades[0][0] = 5;
        edades[0][1] = 6;

        edades[1][0] = 7;
        edades[1][1] = 8;

        edades[2][0] = 9;
        edades[2][1] = 10;

        // impresion normal 
        System.out.println("Edades 0-0 = " + edades[0][0]);
        System.out.println("Edades 0-1 = " + edades[0][1]);
        System.out.println("Edades 1-0 = " + edades[1][0]);
        System.out.println("Edades 1-1 = " + edades[1][1]);
        System.out.println("Edades 2-0 = " + edades[2][0]);
        System.out.println("Edades 2-2 = " + edades[2][1]);

        // impresion con for 
        for (int i = 0; i < edades.length; i++) { // for anidado (un for dentro de otro for)

            for (int j = 0; j < edades[i].length; j++) {

                System.out.println("Edades " + i + "-" + j + ": " + edades[i][j]);

            }

        }

        // sintaxis simplificada ejemplo con matriz fruta
        String frutas[][] = {{"Naranja", "Limon", "Papaya"}, {"Fresa", "Zanahoria", "Mora"}};
        imprimir(frutas);

        // ejemplo con matriz persona sintaxis larga
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Dussan");
        personas[0][1] = new Persona("Danna");
        personas[0][2] = new Persona("Duvan");

        personas[1][0] = new Persona("Ninfa");
        personas[1][1] = new Persona("Andres");
        personas[1][2] = new Persona("Hellem");

        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Frutas " + i + "-" + j + ": " + matriz[i][j]);
            }
        }

    }

}
