
import javacurso.poo.Persona;

public class PasoPorReferenciaObjetos {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.Establece_Nombre("Dussan Palma");
        System.out.println(persona1.Dime_Nombre());
        cambiarValor(persona1);
        System.out.println("persona1 = " + persona1.Dime_Nombre());
             
                
    }

    public static void cambiarValor(Persona persona1){
        
        persona1.nombre = "Duvan Palma"; // cambio el valor de persona1 desde otra clase 
        
    }
    
}
