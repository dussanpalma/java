package componet_swing;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosVentana { // respondiendo desde el System.in

    public static void main(String[] args) {

        MarcoVentana mimarco = new MarcoVentana(); // instancia de clase

        mimarco.setVisible(true); //Metodo o clase para mostrar ventana

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Metodo para cerrar ventana

        MarcoVentana mimarco2 = new MarcoVentana();

        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mimarco2.setVisible(true);
    }
}

class MarcoVentana extends JFrame {

    public MarcoVentana() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        M_Ventana oyente_ventana = new M_Ventana();

        addWindowListener(oyente_ventana);

    }

}

class M_Ventana extends WindowAdapter{

    /* como es una interfaz se deben poner todos los metodos aunque no los utilices 
                                                      o se puede utilizar una clase adaptadora  KeyAdapter, 
                                                                                 WindowAdapter o MouseAdapter y heredamos todos los metodos 
                                                                      y podemos reescribir cualquier metodo*/
    
//    @Override
//    public void windowActivated(WindowEvent e) {
//
//        System.out.println("Ventana Activada");
//    }

    @Override
    public void windowClosed(WindowEvent e) {

        System.out.println("La venta ha sido cerrada");
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.out.println("Cerrando Ventana");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

        System.out.println("Ventana Desactivada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

        System.out.println("Ventana Restaurada");
    }

    @Override
    public void windowIconified(WindowEvent e) {

        System.out.println("Ventana Minimizada");

    }

    @Override
    public void windowOpened(WindowEvent e) {

        System.out.println("Ventana Abierta");
    }

}
