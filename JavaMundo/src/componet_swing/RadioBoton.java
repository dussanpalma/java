package componet_swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioBoton {

    public static void main(String[] args) {

        MarcoRadio mimarco = new MarcoRadio();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoRadio extends JFrame {

    public MarcoRadio() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        laminaRadio milamina = new laminaRadio();
        add(milamina);

    }

}

class laminaRadio extends JPanel {

    public laminaRadio() {

        ButtonGroup migrupo1 = new ButtonGroup();

        ButtonGroup migrupo2 = new ButtonGroup();

        JRadioButton boton1 = new JRadioButton("Azul", false);
        JRadioButton boton2 = new JRadioButton("Amarrillo", false);
        JRadioButton boton3 = new JRadioButton("Negro", false);
        JRadioButton boton4 = new JRadioButton("Blanco", false);

        JRadioButton boton5 = new JRadioButton("Masculino", false);
        JRadioButton boton6 = new JRadioButton("Femenino", false);

        migrupo2.add(boton5);
        migrupo2.add(boton6);

        migrupo1.add(boton1);
        migrupo1.add(boton2);
        migrupo1.add(boton3);
        migrupo1.add(boton4);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

        add(boton5);
        add(boton6);

    }

}
