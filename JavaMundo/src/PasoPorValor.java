
public class PasoPorValor {

    public static void main(String[] args) {

        int x = 10;
        
        System.out.println("x = " + x);
        
        cambioValor(x);
        
        System.out.println("El nuevo valor es: " + x);   

    }

    public static void cambioValor(int arg1) {
        
        System.out.println("arg1 = " + arg1);
        
        arg1 = 20;  
        
        System.out.println("arg1 = " + arg1);

    }

}
