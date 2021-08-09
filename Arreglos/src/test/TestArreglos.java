package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];

        //System.out.println("edades = " + edades);
        edades[0] = 10;
        edades[1] = 11;
        edades[2] = 12;

        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);
        
        // edades[3] = 5;  no se puede porque solo hay int[3]
        
        
        for (int i = 0; i < edades.length; i++) { // .length se utiliza para imprimir los int[3] del arrays
            
            System.out.println("Edades elemento " + i + ": " + edades[i]);
            
        }

        // sintaxis resumida para arrays 
        
        String frutas[] = {"Naranja" , "Platano", "Uva"}; 
        for (int i = 0; i < frutas.length; i++) {
            
            System.out.println("Fruta " + i + " = " + frutas[i]);
            
        }
         
        
    }
}
