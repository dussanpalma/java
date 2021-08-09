
public class OperadoresCondicionales {
    

    public static void main(String args[]) {
        int a = 20;
        int valorMinimo = 0;
        int valorMaximo = 10;
        
        boolean resultado = a >= 0 && a <= 10; // si a es mayor e igual que 0 y a es menor e igual a 10
        if(resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }
        
        boolean vacaciones = false;
        boolean diaDescanso = true ;
        
        if( vacaciones || diaDescanso){  // vacaciones o dia de descanso || = o 
            System.out.println("Padre puede asisitir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }
        
    }
}
    

