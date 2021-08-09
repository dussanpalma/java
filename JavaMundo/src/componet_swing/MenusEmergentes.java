package componet_swing;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MenusEmergentes {

    public static void main(String[] args) {

        MenuEmergente mimarco = new MenuEmergente();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MenuEmergente extends JFrame {

    public MenuEmergente() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Menú Emergente");

        LaminaMenuEmergente milamina = new LaminaMenuEmergente();
        add(milamina);

    }

}

class LaminaMenuEmergente extends JPanel {

    public LaminaMenuEmergente() {

        JPopupMenu emergente = new JPopupMenu();

        JMenu opciones = new JMenu("Opciones");

        setLayout(new BorderLayout());

        JPanel laminaMenu = new JPanel();
        JMenuBar mibarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamagno = new JMenu("Tamaño");

        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);

        laminaMenu.add(mibarra);
        add(laminaMenu, BorderLayout.NORTH);

        JTextPane miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);

//---------------------------------------------------------------------------------------------------------------------------------------
        JMenuItem guardar = new JMenuItem("Guardar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem guardar_como = new JMenuItem("Guardar Como", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem cortar = new JMenuItem("Cortar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem copiar = new JMenuItem("Copiar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem pegar = new JMenuItem("Pegar", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem generales = new JMenuItem("Generales", (new ImageIcon("src/componet_swing/oscuro.gif")));
        JMenuItem otrosArchivos = new JMenuItem("Otros", (new ImageIcon("src/componet_swing/oscuro.gif")));

        JMenuItem opcion1 = new JMenuItem("Blanco", (new ImageIcon("src/componet_swing/blanco.gif")));
        JMenuItem opcion2 = new JMenuItem("Rojo", (new ImageIcon("src/componet_swing/oscuro.gif")));
        opciones.add(opcion1);
        opciones.add(opcion2);

        emergente.add(guardar);
        emergente.add(guardar_como);
        emergente.add(copiar);
        emergente.add(pegar);
        emergente.addSeparator();
        emergente.add(generales);
        emergente.add(otrosArchivos);
        emergente.add(opciones);

        miarea.setComponentPopupMenu(emergente);
        setComponentPopupMenu(emergente);

    }

}
