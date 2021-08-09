package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PosicionLayouts {

    public static void main(String[] args) {

        miMarco1 marco1 = new miMarco1();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Metodo para cerrar ventana

    }

}

class miMarco1 extends JFrame {

    public miMarco1() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/layouts/icon.gif");
        setIconImage(miIcono);

        setSize(600, 350);
        setLocation(600, 300);
        setTitle("Layouts");

        Panel_Layout lamina = new Panel_Layout();

        Panel_Layout2 lamina2 = new Panel_Layout2();

        add(lamina, BorderLayout.NORTH);

        add(lamina2, BorderLayout.SOUTH);

    }

}

class Panel_Layout extends JPanel {

    public Panel_Layout() {

        // posicionamiento con BorderLayou
        setLayout(new BorderLayout(10, 10));

        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Rojo"), BorderLayout.SOUTH);

    }

}

class Panel_Layout2 extends JPanel {

    public Panel_Layout2() {

        // posicionamiento con FlowLayout
        // setLayout(new FlowLayout(FlowLayout.CENTER, 50, 110));
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 110));

        add(new JButton("Azul"));
        add(new JButton("Verde"));
        add(new JButton("Negro"));

    }

}
