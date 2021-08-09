package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {

//        System.out.println("Dia 1: " + Dias.LUNES);
//        
//        indicarDiaSemana(Dias.LUNES);


        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4 continente: "
                + Continentes.AMERICA.getPaises() + " " + Continentes.AMERICA.getNumeroPaises());
        
        System.out.println("");
        
        
         System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("No. Paises en el 1 continente: "
                + Continentes.AFRICA.getPaises() + " " + Continentes.AFRICA.getNumeroPaises());
        
        System.out.println("");
        
        
       System.out.println("Continente no. 2: " + Continentes.EUROPA);
        System.out.println("No. Paises en el 2 continente: "
                + Continentes.EUROPA.getPaises() + " " + Continentes.EUROPA.getNumeroPaises()); 
       
        

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {

            case LUNES:
                System.out.println("Primer dia de la semana");
                break;

            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;

        }

    }

}
