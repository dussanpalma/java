package componet_swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MarcoConIcon {

    public static void main(String[] args) {

        MarcoCentrado mimarco = new MarcoCentrado();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class MarcoCentrado extends JFrame {

    public MarcoCentrado() {

        // utilizacion de la clase Toolkit
        Toolkit mipantalla = Toolkit.getDefaultToolkit();  // declarando objetos

        Dimension tamanoPantalla = mipantalla.getScreenSize();  // declarando objetos  

        int alturaPantalla = tamanoPantalla.height;  // campos de clase dimension 0
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla / 2, alturaPantalla / 2); // dividimos el total de la pantalla entre dos 

        setLocation(anchoPantalla / 4, alturaPantalla / 4);

        setTitle("Marco Centrado");

        Image miIcono = mipantalla.getImage("src/componet_swing/icono.gif");

        setIconImage(miIcono);

    }

}
