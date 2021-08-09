
package Test;

import domain.Orden;
import domain.Producto;


public class VentasTest {
    
     public static void main(String[] args) {
        
         Producto producto1 = new Producto("Camisa", 25.000);
         Producto producto2 = new Producto("Pantalon", 85.000);
         
         Orden orden1 = new Orden(); 
         orden1.agregarProduto(producto1);
         orden1.agregarProduto(producto2);
         
  
         
         orden1.mostarOrden();
         
    }
    
}
