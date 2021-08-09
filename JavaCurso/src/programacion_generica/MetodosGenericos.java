package programacion_generica;

public class MetodosGenericos {

    public static void main(String[] args) {

        String nombres[] = {"Jose", "Maria", "Pepe"};
        String elementos = MisMatrices.<String>getElementos(nombres);
        System.out.println(elementos);
    }

}

class MisMatrices {

    public static <T> String getElementos(T[] a) {

        return "El array tiene " + a.length + " elementos";

    }

}
