package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
      
        Aritmetica aritmetica1 = new Aritmetica(5, 2, "Dussan"); //llamando al constructor 2 con argumentos 

        System.out.println(aritmetica1.a);
        System.out.println(aritmetica1.b);
        System.out.println(aritmetica1.c);

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba retorno int = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8); // llamando al metodo con argumentos

        System.out.println("Resultado utilizando argumento: " + resultado);

    }
}
