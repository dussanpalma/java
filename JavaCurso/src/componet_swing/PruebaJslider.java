package componet_swing;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class PruebaJslider {

    public static void main(String[] args) {

        Frame_Sliders mimarco = new Frame_Sliders();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Frame_Sliders extends JFrame {

    public Frame_Sliders() {

        setBounds(550, 400, 550, 350);

        Lamina_Sliders milamina = new Lamina_Sliders();

        add(milamina);

        setVisible(true);

    }

}

class Lamina_Sliders extends JPanel {

    public Lamina_Sliders() {

        JSlider ejemplo1 = new JSlider();

        ejemplo1.setMajorTickSpacing(50);
        ejemplo1.setMinorTickSpacing(25);
        ejemplo1.setPaintTicks(true);

        ejemplo1.setFont(new Font("Serif", Font.PLAIN, 14));

        ejemplo1.setPaintLabels(true);

        ejemplo1.setSnapToTicks(true);

        add(ejemplo1);

    }

}
