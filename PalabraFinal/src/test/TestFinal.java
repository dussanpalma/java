package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5; // no se puede cambiar porque la variable es final 
        
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante:" + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona(); /*  ejemplo objeto final, ya no podemos utilziar 
                                                    otro objeto con persona1, pero si se puede modificar su referencia  */
        //persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre:" + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre:" + persona1.getNombre());
    }
}
