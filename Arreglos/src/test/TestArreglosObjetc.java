package test;

import domain.Persona;

public class TestArreglosObjetc {

    public static void main(String[] args) {
        // los arreglos se llaman en plural

        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Dussan");
        personas[1] = new Persona("Duvan");

        System.out.println("Persona 0 = " + personas[0]);
        System.out.println("Persona 1 = " + personas[1]);

        for (int i = 0; i < personas.length; i++) {

            System.out.println("Personas " + i + " = " + personas[i]);

        }

        
        
        
    }

}
