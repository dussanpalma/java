package componet_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBotonEjemplo {

    public static void main(String[] args) {

        MarcoRadioEjemplo mimarco = new MarcoRadioEjemplo();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoRadioEjemplo extends JFrame {

    public MarcoRadioEjemplo() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Radio Ejemplo");

        laminaRadioEjemplo milamina = new laminaRadioEjemplo();
        add(milamina);

    }

}

class laminaRadioEjemplo extends JPanel {

    public laminaRadioEjemplo() {

        setLayout(new BorderLayout());

        texto = new JLabel("I WANT TO BREACK FREE FROM THE LIES, YOUR'E SO SELF SATISFED");
        add(texto, BorderLayout.CENTER);

        ButtonGroup migrupo = new ButtonGroup();
        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy Grande", false);

        JPanel lamina_radio = new JPanel();

        Evento_radio mievento = new Evento_radio();
        boton1.addActionListener(mievento);
        boton2.addActionListener(mievento);
        boton3.addActionListener(mievento);
        boton4.addActionListener(mievento);

        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);
        migrupo.add(boton4);

        lamina_radio.add(boton1);
        lamina_radio.add(boton2);
        lamina_radio.add(boton3);
        lamina_radio.add(boton4);

        add(lamina_radio, BorderLayout.SOUTH);

    }

    private class Evento_radio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == boton1) {
                texto.setFont(new Font("Serif", Font.PLAIN, 10));

            } else if (e.getSource() == boton2) {
                texto.setFont(new Font("Serif", Font.PLAIN, 12));

            } else if (e.getSource() == boton3) {
                texto.setFont(new Font("Serif", Font.PLAIN, 18));

            } else if (e.getSource() == boton4) {
                texto.setFont(new Font("Serif", Font.PLAIN, 24));

            }

        }

    }

    private final JLabel texto;
    private final JRadioButton boton1;
    private final JRadioButton boton2;
    private final JRadioButton boton3;
    private final JRadioButton boton4;

}
