package componet_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaCuadroTexto {

    public static void main(String[] args) {

        MarcoTexto mimarco = new MarcoTexto();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoTexto extends JFrame {

    public MarcoTexto() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
        setIconImage(miIcono);

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Correo Electronico");

        LaminaTexto milamina = new LaminaTexto();
        add(milamina);

    }

}

class LaminaTexto extends JPanel {

    public LaminaTexto() {

        setLayout(new BorderLayout());

        //lamina 2
        JPanel milamina2 = new JPanel();
        milamina2.setLayout(new FlowLayout());

        resultado = new JLabel("", JLabel.CENTER);

        JLabel textoEmail = new JLabel("Email: ");
        milamina2.add(textoEmail);

        campo1 = new JTextField(20);
        milamina2.add(campo1);

        add(resultado, BorderLayout.CENTER);

        JButton miboton = new JButton("Enter");

        DameTexto mievento = new DameTexto();
        miboton.addActionListener(mievento);

        milamina2.add(miboton);
        add(milamina2, BorderLayout.NORTH);

    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int correcto = 0;

            String email = campo1.getText().trim();

            for (int i = 0; i < email.length(); i++) {

                if (email.charAt(i) == '@') {

                    correcto++;
                }

            }

            if (correcto != 1) {

                resultado.setText("Incorrecto");

            } else {

                resultado.setText("Correcto");
            }

        }

    }

    private JTextField campo1;

    private JLabel resultado;
}
