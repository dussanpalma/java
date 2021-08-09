package test;

public class test {

    public static void main(String[] args) {

        imprimirNumeros(3, 4, 5);
        imprimirNumeros(3, 1, 2);
        imprimirNumeros(2, 1, 5);
        variosParametros("Dussan", 8, 50);

    }

    private static void imprimirNumeros(int... numeros) { // argumento variable
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + (numeros)[i]);

        }

    }

    private static void variosParametros(String nombre, int... numeros) { // si hay mas parametros el argumento variable debe ser el ultimo
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);

    }

}
