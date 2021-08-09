package componet_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTexto {

    public static void main(String[] args) {

        AreaTexto mimarco = new AreaTexto();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class AreaTexto extends JFrame {

    public AreaTexto() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        LaminaAreaTexto milamina = new LaminaAreaTexto();
        add(milamina);

    }

}

class LaminaAreaTexto extends JPanel {

    public LaminaAreaTexto() {
        
        miarea = new JTextArea(3,15);
        
        JScrollPane laminaBarras= new JScrollPane(miarea);

        miarea.setLineWrap(true);
        
        add(laminaBarras);
        
        JButton miboton = new JButton("Dale");
        
        miboton.addActionListener(new GestionaArea());
        
        add(miboton);
        

    }

    private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(miarea.getText());
            
        }
        
        
        
    }
    
     private final JTextArea miarea;
    
}
