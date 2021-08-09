package componet_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Desplegables {

    public static void main(String[] args) {

        Pcombo mimarco = new Pcombo();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Pcombo extends JFrame {

    public Pcombo() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        LaminaPcombo milamina = new LaminaPcombo();
        add(milamina);

    }

}

class LaminaPcombo extends JPanel {

    public LaminaPcombo() {

        setLayout(new BorderLayout());

        texto = new JLabel("Tú no me dejas en paz, de mi mente no te vas");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);

        JPanel lamina_norte = new JPanel();

        micombo = new JComboBox();
        micombo.setEditable(true);
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Segoe UI");

        
        Evento_combo mievento = new Evento_combo();
        micombo.addActionListener(mievento);
        lamina_norte.add(micombo);

        add(lamina_norte, BorderLayout.NORTH);

    }

    private class Evento_combo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            texto.setFont(new Font((String) micombo.getSelectedItem(), Font.PLAIN, 15));

        }

    }

    private JLabel texto;

    private JComboBox micombo;
    
  
}
