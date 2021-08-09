
public class PrioridadDeOperadores {
    
    
     public static void main(String args[]) {
        int x = 5; //6
        int y = 10; // 9
        int z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        int resultado = 4 + 5 * 6 / 3;//4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);//14
        
        resultado = (4 + 5) * 6 / 3; 
        System.out.println("resultado = " + resultado);
    }
    
}
