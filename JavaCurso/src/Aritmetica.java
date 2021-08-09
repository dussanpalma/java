package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;
    String c; 

    // Ejemplo de Constructor vacio, se llaman con =new 
    public Aritmetica() { //constructor 1 y vacio, solo se llama cuando hay otro constructor con argumentos

        System.out.println("Ejecutando Constructor"); //ejemplo 

    }
    
    // Ejemplo de sobrecarga de constructor, (varios constructores)
    // a continuación otro constructor 
    
    public Aritmetica(int arg1, int arg2, String arg3){ // constructor 2
        
        this.a=arg1; 
        this.b=arg2;
        this.c=arg3;
        
        System.out.println("Ejecutando constructor con argumentos");
        
    }

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {  // sumar con retorno int en el metodo 
//        int resultado = a + b;
//        return resultado;
        return a + b;

    }

    public int sumarConArgumentos(int arg1, int arg2) { //sumar con argumentos en el metodo 

        this.a = arg1;   // this sirve para cuando el argumento y el atributo de la clase se llamen igual 
        b = arg2;    // o tambien se puede dejar asi porque en este caso no se llaman igual, this hace referencia al atributo de la clase 

        return sumarConRetorno();

    }

}
