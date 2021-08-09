
public class BucleForDos {
    
    public static void main(String args[]) {
        
        for( int contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue;//ir a la siguiente iteracion
            }   
            System.out.println("contador = " + contador);
        }
        
        for( int contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 == 0){
                System.out.println("contador = " + contador);
                break;
            }   
        }
        
        int contador = 0;
        while( contador < 3 ){
            System.out.println("contador = " + contador);
            contador++;
        }

       // int contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while( contador < 3);
    }
    
}
