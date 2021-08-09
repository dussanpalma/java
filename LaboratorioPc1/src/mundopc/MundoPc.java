package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPc {

    public static void main(String[] args) {

        Monitor monitorHP = new Monitor("HP", 24);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora Dussan",
                monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 24);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gemer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer 1",
                monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorGamer2 = new Monitor("Gamer", 24);
        Teclado tecladoGamer2 = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer2 = new Raton("Bluetooth", "Gemer");
        Computadora computadoraGamer2 = new Computadora("Computadora Gamer 2",
                monitorGamer2, tecladoGamer2, ratonGamer2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraGamer2);

        orden1.mostarOrden();

    }

}
