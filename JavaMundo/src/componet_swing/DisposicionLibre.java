package componet_swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisposicionLibre {

    public static void main(String[] args) {

        MarcoLibre mimarco = new MarcoLibre();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoLibre extends JFrame {

    public MarcoLibre() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");

        LaminaLibre milamina = new LaminaLibre();
        add(milamina);
        
  

    }

}

class LaminaLibre extends JPanel {

    public LaminaLibre() {

        setLayout(new EnColumnas());

        
//        JButton boton1 = new JButton("Agregar Nombre");
//        boton1.setBounds(20, 20, 150, 50);
//        add(boton1);
//
//        JButton boton2 = new JButton("Agregar Apellido");
//        boton2.setBounds(20, 100, 150, 50);
//        add(boton2);
        JLabel nombre = new JLabel("NOMBRE:  ");
        JLabel apellido = new JLabel("APELLIDO:  ");
        JLabel identificacion = new JLabel("CC:  ");
        JLabel ciudad = new JLabel("CIUDAD:  ");

        JTextField c_nombre = new JTextField();
        JTextField c_apellido = new JTextField();
        JTextField c_identificacion = new JTextField();
        JTextField c_ciudad = new JTextField();

//        nombre.setBounds(180, 40, 80, 10);
//        c_nombre.setBounds(240, 33, 100, 25);
//        apellido.setBounds(180, 120, 80, 10);
//        c_apellido.setBounds(245, 113, 100, 25);
        add(nombre);
        add(c_nombre);
        add(apellido);
        add(c_apellido);
        add(identificacion);
        add(c_identificacion);
        add(ciudad);
        add(c_ciudad);

    }

}

// mi propia Disposicion 
class EnColumnas implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container parent) {

        int contador = 0;
        int n = parent.getComponentCount();
        int y = 20;

        for (int i = 0; i < n; i++) {

            contador++;
            Component c = parent.getComponent(i);

            c.setBounds(x, y, 100, 20);

            x += 100;

            if (contador % 2 == 0) {

                x = 20;
                y += 40;

            }

            // PARA PONER EN EL CENTRO MIRAR EL VIDEO 120 
        }

    }

    private int x = 20;
    private int y;

}
