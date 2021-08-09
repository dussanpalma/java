package componet_swing;

import java.awt.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarraHerramientas {

    public static void main(String[] args) {

        marcoHeramienta marco = new marcoHeramienta();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}

class marcoHeramienta extends JFrame {

    public marcoHeramienta() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/componet_swing/icono.gif");
        setIconImage(miIcono);

        setTitle("Multiples Eventos");
        setBounds(600, 350, 600, 300);

        lamina = new JPanel();
        add(lamina);

        //------------------------------------------------------------------------------------------------------------------ 
        AccionColor1 accionOscuro = new AccionColor1("Oscuro", new ImageIcon("src/componet_swing/oscuro.gif"), Color.darkGray);
        AccionColor1 accionBlanco = new AccionColor1("Blanco", new ImageIcon("src/componet_swing/blanco.gif"), Color.WHITE);
        AccionColor1 accionRed = new AccionColor1("Rojo", new ImageIcon("src/componet_swing/azul.gif"), Color.red);

        Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/componet_swing/salir.gif")) {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        };

        JMenu menu = new JMenu("Color");
        menu.add(accionOscuro);
        menu.add(accionBlanco);
        menu.add(accionRed);

        JMenuBar barra_menus = new JMenuBar();
        barra_menus.add(menu);

        setJMenuBar(barra_menus);

        //----------------------- Construyendo Barra de Herramientas -------------------------------------------------------------------------------------------       
        JToolBar barra = new JToolBar();
        barra.add(accionBlanco);

        barra.add(accionOscuro);
        barra.add(accionRed);
        barra.addSeparator();
        barra.add(accionSalir);

        add(barra, BorderLayout.SOUTH);

    }

    class AccionColor1 extends AbstractAction {

        private AccionColor1(String nombre, Icon icono, Color color_boton) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Cambia a COLOR " + nombre);
            putValue("color_de_fondo", color_boton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_de_fondo");

            lamina.setBackground(c);
            
            

        }

    }

    private JPanel lamina;

}
