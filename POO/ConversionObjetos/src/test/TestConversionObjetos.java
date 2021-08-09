
package test;

import domain.*;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        
        Empleado empleado; 
        
        empleado = new Escritor("Dussan", 5000, TipoEscritura.CLASICO);
        //System.out.println("Empleado = " + empleado);
        
        
        System.out.println(empleado.obtenerDetalles());
        
      /*  empleado.getTipoEscritura(); // no se puede porque solo esta definido en la clase escritor(clase hija) y no 
      en la clase Empleado(Padre) */ 
        
      
      // para poder llamarlo hacemos una conversion de objetos(Downcasting) (De tipo padre a clase hija)
      //((Escritor)empleado).getTipoEscritura();
      
      // Otra sintaxis para el DownCasting
      Escritor escritor = (Escritor) empleado; 
      escritor.getTipoEscritura(); 
      
      
      // Upcastring  (Convertidor De clase hija a clase padre) 
      Empleado empleado2 = escritor; 
        System.out.println(empleado.obtenerDetalles());
      
      
      
      
    }
    
    
}
