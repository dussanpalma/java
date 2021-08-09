
public class OperadoresDeIgualdad {
    
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

    

    }
    
}
