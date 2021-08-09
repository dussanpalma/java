package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {

        // clases envolventes de t ipos primitivos 
        /* 
        int- Integer(tipo object)
        long - Long(tipo object)
        float - Float(tipo object)
        double - Double(tipo object)
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short 
        
         */
        
        
        // se utilizan para utilizar metodos 
        // int entero = 20; 
        Integer entero = 20;  // Autoboxing (envolver)
        
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.floatValue());
        System.out.println("entero = " + entero.doubleValue());
        System.out.println("entero = " + entero.toString());
        
        int entero2 = entero; // Unboxing (desenvolver) 
        System.out.println("entero2 = " + entero2);
                
        
    }

}
