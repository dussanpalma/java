package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {

        // metodo List
        // respeta el orden 
        // se puede duplicar elementos 
        List miLista = new ArrayList();

        miLista.add("Lunes");  // elementos 
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");

//          sintaxis for Each
        for (Object elemento : miLista) {
           // System.out.println("Elemento miLista= " + elemento);

//            sintaxis landa
//            miLista.forEach(elemento -> {
//            System.out.println("Elemento = " + elemento);
//        });
            // cualquiera de las dos sintaxis sirve 
        }

        // metodo Set
        // no respeta el orden 
        // no se puede duplicar elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
  //      imprimir(miSet);


        // metodo Map 
        // no se utiliza .add se utiliza .put
        Map miMapa = new HashMap();
        miMapa.put("Valor 1", "Dussan");
        miMapa.put("Valor 2", "Palma");
        miMapa.put("Valor 3", "Solano");

        // sintaxis para acceder a un elemento de un map
        String elemento = (String) miMapa.get("Valor 1");
        //System.out.println("elemento = " + elemento);

        // sintaxis para acceder todos los elementos de un map
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

     public static void imprimir(Collection coleccion) {

        // se puede utilizar landa o for each
        for (Object elemento : coleccion) {

            System.out.println("elemento miSet = " + elemento);

        }
        
     }
     
}
    
    

