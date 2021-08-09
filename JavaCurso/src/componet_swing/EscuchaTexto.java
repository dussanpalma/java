package componet_swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EscuchaTexto {

    public static void main(String[] args) {

        MarcoConTexto2 mimarco = new MarcoConTexto2();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConTexto2 extends JFrame {

    public MarcoConTexto2() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        LaminaConTexto2 milamina = new LaminaConTexto2();
        add(milamina);

    }

}

class LaminaConTexto2 extends JPanel {

    public LaminaConTexto2() {

        JTextField micampo = new JTextField(20);

        EscuchaTexto el_evento = new EscuchaTexto();

        Document midoc = micampo.getDocument();

        midoc.addDocumentListener(el_evento);

        add(micampo);

    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {

            System.out.println("Has introducido texto");

        }

        @Override
        public void removeUpdate(DocumentEvent e) {

            System.out.println("Has borrado texto");

        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }

    }

}
