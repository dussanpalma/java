package componet_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cuadros_Dialogos {

    public static void main(String[] args) {

        CuadrosDialogos mimarco = new CuadrosDialogos();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class CuadrosDialogos extends JFrame {

    public CuadrosDialogos() {

        setBounds(500, 300, 400, 250);

        add(new LaminaCuadros());

    }

}

class LaminaCuadros extends JPanel {

    public LaminaCuadros() {

        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");

        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());
        boton5.addActionListener(new Accion_botones());

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);

    }

    private class Accion_botones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            // getSource sirve para saber que boton ha desencanedado la acción     
            if (e.getSource() == boton1) {

                System.out.println("Has pulsado el Boton 1 ");

                JOptionPane.showMessageDialog(LaminaCuadros.this, "Has pulsado el Boton 1", "Advertencia", 3);

            } else if (e.getSource() == boton2) {

                System.out.println("Has pulsado el boton 2");

                JOptionPane.showMessageDialog(LaminaCuadros.this, "Has pulsado el Boton 2", "Advertencia", 1, (new ImageIcon("src/componet_swing/oscuro.gif")));

            } else if (e.getSource() == boton3) {

                System.out.println("Has pulsado el boton 3");

                JOptionPane.showInputDialog("Introduce un nombre");

       } else if (e.getSource() == boton4) {

                System.out.println("Has pulsado el boton 4");

                JOptionPane.showConfirmDialog(LaminaCuadros.this, "Elige Opcion", "Confirmar", 1);

             } else if (e.getSource() == boton5) {

                System.out.println("Has pulsado el boton 5");

                JOptionPane.showOptionDialog(LaminaCuadros.this, "Elige", "Opciones", 
                        1, 2, (new ImageIcon("src/componet_swing/blanco.gif")), null , null);
                
            }

        }

    }

    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;

}
