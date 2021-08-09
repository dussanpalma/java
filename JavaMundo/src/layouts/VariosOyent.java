

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyent {
    

    public static void main(String[] args) {

        marcoPrincipal1 marco1 = new marcoPrincipal1();

        marco1.setVisible(true);

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

    class marcoPrincipal1 extends JFrame {

    public marcoPrincipal1() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
        setIconImage(miIcono);

        setSize(300, 200);
        setLocation(800, 200);
        setResizable(false);
        setTitle("Varios Oyentes");

        lamina1 milamina = new lamina1();
        add(milamina);

    }

}

class lamina1 extends JPanel {

    public lamina1() {

        JButton boton_nuevo = new JButton("Nuevo");
        boton_eliminar = new JButton("Eliminar todo");

        add(boton_nuevo);
        add(boton_eliminar);

        OyenteNuevo miOyente = new OyenteNuevo();

        boton_nuevo.addActionListener(miOyente);

    }

    private class OyenteNuevo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Marco_Emergente1 marco = new Marco_Emergente1(boton_eliminar);

            marco.setVisible(true);

        }

    }

    JButton boton_eliminar;

}

class Marco_Emergente1 extends JFrame {

    public Marco_Emergente1(JButton boton_de_principal) {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
        setIconImage(miIcono);

        contador++;

        setTitle("Ventana " + contador);

        setBounds(40 * contador, 40 * contador, 300, 150);

        CierraTodos oyenteCerrar = new CierraTodos();

        boton_de_principal.addActionListener(oyenteCerrar);

    }

    private class CierraTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            dispose();

        }

    }

    private static int contador = 0;

}

    

