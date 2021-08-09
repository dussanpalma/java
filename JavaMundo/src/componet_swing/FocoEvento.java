package componet_swing;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

    public static void main(String[] args) {

        MarcoFoco mimarco = new MarcoFoco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoFoco extends JFrame {

    public MarcoFoco() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Foco Explicación");
        setVisible(true);
        add(new LaminaFoco());

    }

}

class LaminaFoco extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setLayout(null); //invalidamos la colocacion por defecto

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);

        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);

    }

    private class LanzaFocos implements FocusListener {  //oyente y clase interna 

        @Override
        public void focusGained(FocusEvent e) {

            System.out.println("Has ganado el foco");

        }

        @Override
        public void focusLost(FocusEvent e) {

            String email = cuadro1.getText();

            boolean comprobacion = false;

            for (int i = 0; i < email.length(); i++) {

                if (email.charAt(i) == '@') {

                    comprobacion = true;

                }

            }

            if (comprobacion) {

                System.out.println("Correcto");
            } else {

                System.out.println("Incorrecto");
            }
        }

    }

    JTextField cuadro1;
    JTextField cuadro2;

}
