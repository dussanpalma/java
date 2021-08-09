package componet_swing;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EscuchaTextoPassword {

    public static void main(String[] args) {

        Marco mimarco = new Marco();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Marco extends JFrame {

    public Marco() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/componet_swing/icono.gif");
        setIconImage(miIcono);

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Intranet");

        Lamina1 milamina1 = new Lamina1();
        add(milamina1, BorderLayout.CENTER);

        Lamina2 milamina2 = new Lamina2();
        add(milamina2, BorderLayout.SOUTH);

    }
}

class Lamina1 extends JPanel {

    public Lamina1() {

        JLabel textoUsuario = new JLabel("Usuario ", (new ImageIcon("src/componet_swing/oscuro.gif")), 2);
        add(textoUsuario);

        cuadroTextoUsuario = new JTextField(10);
        add(cuadroTextoUsuario);

        JLabel textoPassword = new JLabel("Contraseña ", (new ImageIcon("src/componet_swing/candado.png")), 2);
        add(textoPassword);

        cuadroTextoPassword = new JPasswordField(10);

        Comprueba_pass mievento = new Comprueba_pass();

        cuadroTextoPassword.getDocument().addDocumentListener(mievento);

        add(cuadroTextoPassword);

    }

    private class Comprueba_pass implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {

            char[] pass;

            pass = cuadroTextoPassword.getPassword();

            if (pass.length < 8 || pass.length > 12) {

                cuadroTextoPassword.setBackground(Color.red);

            } else {

                cuadroTextoPassword.setBackground(Color.GREEN);

            }

        }

        @Override
        public void removeUpdate(DocumentEvent e) {

            char[] pass;

            pass = cuadroTextoPassword.getPassword();

            if (pass.length < 8 || pass.length > 12) {

                cuadroTextoPassword.setBackground(Color.red);

            } else {

                cuadroTextoPassword.setBackground(Color.GREEN);

            }

        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }

    }

    private final JTextField cuadroTextoUsuario;

    private final JPasswordField cuadroTextoPassword;

}

class Lamina2 extends JPanel {

    public Lamina2() {

        JButton enviar = new JButton("LOGIN");
        add(enviar, BorderLayout.SOUTH);

    }

}
