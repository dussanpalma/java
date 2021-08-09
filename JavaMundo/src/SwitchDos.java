
public class SwitchDos {
    
    public static void main(String args[]) {
        int mes = 20;
        String estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:  //varios casos 
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
                
            default: 
                estacion = "Mes no valido";
                
        }
        System.out.println("estacion = " + estacion);
    }
    
}
