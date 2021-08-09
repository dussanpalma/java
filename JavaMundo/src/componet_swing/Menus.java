package componet_swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menus {

    public static void main(String[] args) {

        Menus1 mimarco = new Menus1();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Menus1 extends JFrame {

    public Menus1() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mis menus");

        LaminaMenus1 milamina = new LaminaMenus1();
        add(milamina);

    }

}

class LaminaMenus1 extends JPanel {

    public LaminaMenus1() {

        JMenuBar mibarra = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        JMenu ediccion = new JMenu("Edicción");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu otros = new JMenu("Otros");

        JMenu opciones = new JMenu("Opciones");
    
        JMenuItem guardar = new JMenuItem("Guardar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem guardar_como = new JMenuItem("Guardar Como", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem cortar = new JMenuItem("Cortar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem copiar = new JMenuItem("Copiar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem pegar = new JMenuItem("Pegar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem generales = new JMenuItem("Generales", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem otrosArchivos = new JMenuItem("Otros", (new ImageIcon("src/componet_swing/oscuro.gif")));

        JMenuItem opcion1 = new JMenuItem("Blanco", (new ImageIcon("src/componet_swing/blanco.gif")));
        JMenuItem opcion2 = new JMenuItem("Rojo", (new ImageIcon("src/componet_swing/azul.gif")));
        opciones.add(opcion1);
        opciones.add(opcion2);

        archivo.add(guardar);
        archivo.add(guardar_como);
        ediccion.add(cortar);
        ediccion.add(copiar);
        ediccion.add(pegar);
        ediccion.addSeparator();
        herramientas.add(generales);
        otros.add(otrosArchivos);
        ediccion.add(opciones);

        mibarra.add(archivo);
        mibarra.add(ediccion);
        mibarra.add(herramientas);
        mibarra.add(otros);

        add(mibarra);

    }

}
