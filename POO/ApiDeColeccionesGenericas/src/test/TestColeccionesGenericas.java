package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        // metodo List
        // respeta el orden 
        // se puede duplicar elementos 
        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");  // elementos 
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");

        //     imprimir(miLista);
        //String elemento = miLista.get(0); 
        //System.out.println("elemento = " + elemento);
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
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //   imprimir(miSet);

        // metodo Map 
        // no se utiliza .add se utiliza .put
        // si se duplica un valor, se conservara solo el ultimo
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor 1", "Dussan");
        miMapa.put("Valor 2", "Palma");
        miMapa.put("Valor 3", "Solano");
        miMapa.put("Valor 3", "Carlos");

        // sintaxis para acceder a un elemento de un map sin convertir a String 
        String elementoMapa = miMapa.get("Valor 1");
        System.out.println("elemento Mapa = " + elementoMapa);

        // sintaxis para acceder todos los elementos de un map
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection<String> coleccion) {

        // se puede utilizar landa o for each
        for (String elemento : coleccion) {

            System.out.println("elemento = " + elemento);

        }

    }

}
