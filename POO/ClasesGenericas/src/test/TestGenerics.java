package test;

import genericos.ClaseGenerica;

public class TestGenerics {

    public static void main(String[] args) {

        // se utiliza clase envolvente 
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);

        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Dussan");

        objetoString.obtenerTipo();
        
        ClaseGenerica<Boolean> objetoBoolean = new ClaseGenerica(true);
        
        objetoBoolean.obtenerTipo();
        
    }

}
