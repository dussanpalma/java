
public class OperadoresRelacionales {
    
      public static void main(String args[]) {
        int a = 3;
        int b = 2;

        boolean c = (a == b);
        System.out.println("c = " + c); 

        boolean d = a != b;
        System.out.println("d = " + d);

        String cadena = "Hola";
        String cadena2 = "Hola";
        boolean e = cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);

        boolean f = cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println("f = " + f);

        boolean g = a <= b;   // si se cumple mayor  que > o el mayor o igual >= da true
        System.out.println("g = " + g);  //true

        if (a % 2 == 0) {  // para ver el producto 
            System.out.println("Es numero par");  
        } else {
            System.out.println("Es numero impar");
        }
        
        int edad = 40;
        int adulto = 18;
        if(edad >= adulto){ //mayor igual 
            System.out.println("Es un adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }
        

    }
    
}
