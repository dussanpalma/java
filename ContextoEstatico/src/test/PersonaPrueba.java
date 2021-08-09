package test;

import domain.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {  // la palabra this no se puede utilizar en un metodo static 
        
        Persona persona1 = new Persona("Dussan");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Gissell");
        System.out.println("persona2 = " + persona2);
        // sin el atributo static el id no aumentaria
        
        imprimir(persona1);        
        imprimir(persona2);
        
    }
    
    public static void imprimir(Persona persona) {   // para utilzar metodos dentro del main, debe ser static tambien
        
        System.out.println("persona = " + persona);
        
    }
    
}
