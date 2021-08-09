package proyectoCaja;

public class CajaDos {

    public static void main(String[] args) {

        CajaUno calculandoVolumen1 = new CajaUno();

        calculandoVolumen1.ancho = 3;
        calculandoVolumen1.alto = 2;
        calculandoVolumen1.profundo = 20;

        System.out.println("El volumen de la caja con el constructor 1 es: " + calculandoVolumen1.volumen());

        CajaUno calculandoVolumen2 =new CajaUno(3, 2, 20);
        
        System.out.println("El volumen de la caja con el constructor 2 es: " + calculandoVolumen2.volumen());

    }

}
