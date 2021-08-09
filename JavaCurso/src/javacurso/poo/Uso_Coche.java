
package javacurso.poo;

import javax.swing.*; 

public class Uso_Coche {

public static void main(String[] args){


    coche micoche=new coche();  //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE 

    micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
 
    System.out.println(micoche.dime_datos_generales());

    System.out.println(micoche.dime_color()); 

    micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene acientos de cuero?")); 
                
    System.out.println(micoche.dime_asientos()); 

    micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?")); 

    System.out.println(micoche.dime_climatizador()); 

    System.out.println(micoche.dime_peso_coche()); 
 
    System.out.println("El precio final del coche es: " + micoche.precio_coche()); 


   

   }


}
