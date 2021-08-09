package componet_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Jslidersll {

    public static void main(String[] args) {

        Frame_Slidersll mimarco = new Frame_Slidersll();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Frame_Slidersll extends JFrame {

    public Frame_Slidersll() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        LaminaSlidersll milamina = new LaminaSlidersll();
        add(milamina);

    }

}

class LaminaSlidersll extends JPanel {

    public LaminaSlidersll() {

        setLayout(new BorderLayout());

        rotulo = new JLabel("Where are you from? I am from Colombia");
        add(rotulo, BorderLayout.CENTER);

        control = new JSlider(8, 50, 12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));

        control.addChangeListener(new EventoSlider());

        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);

    }

    private class EventoSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {

            ++contador;
            System.out.println("Estas manipulando el Slider; " + control.getValue());

          rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));


        }

    }

    private JLabel rotulo;

    private JSlider control;

    private static int contador;

}
