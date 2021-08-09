 package componet_swing;

import java.awt.Color;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VariasFuentesDeEventos {

    public static void main(String[] args) {

        marcoAccion marco = new marcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class marcoAccion extends JFrame {

    public marcoAccion() {
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("src/graficos/icono.gif");
        setIconImage(miIcono);

        setTitle("Multiples Eventos");
        setBounds(600, 350, 600, 300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);

    }
}

class PanelAccion extends JPanel {
    

    public PanelAccion() {

        AccionColor accionOscuro = new AccionColor("Oscuro", new ImageIcon("src/componet_swing/oscuro.gif"), Color.darkGray);
        AccionColor accionBlanco = new AccionColor("Blanco", new ImageIcon("src/componet_swing/blanco.gif"), Color.WHITE);
        AccionColor accionRed = new AccionColor("Rojo", new ImageIcon("src/componet_swing/azul.gif"), Color.red);

        // esta es otra forma de agregar botones con accion 
        add(new JButton(accionOscuro));
        add(new JButton(accionBlanco));
        add(new JButton(accionRed));
        
       

//        JButton botonOscuro = new JButton("Oscuro");
//        JButton botonBlanco = new JButton("Blanco");
//        JButton botonAzul = new JButton("Azul");
//
//        add(botonOscuro);
//        add(botonBlanco);
//        add(botonAzul);



      // Multiples Eventos 

       InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
       
       
       mapaEntrada.put(KeyStroke.getKeyStroke(" ctrl A"), "fondo_oscuro");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_blanco");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl C"), "fondo_rojo");
       
           
     
       ActionMap mapaAccion=getActionMap();
       
       
       mapaAccion.put("fondo_oscuro", accionOscuro);

     
       mapaAccion.put("fondo_blanco", accionBlanco);
       
    
       mapaAccion.put("fondo_rojo", accionRed);
       

       
    }

    class AccionColor extends AbstractAction {

        private AccionColor(String nombre, Icon icono, Color color_boton) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Cambia a COLOR " + nombre);
            putValue("color_de_fondo", color_boton);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_de_fondo");

            setBackground(c);
            
            System.out.println("Nombre: " + getValue(Action.NAME) +  ""
            + " Descripcion: " + getValue(Action.SHORT_DESCRIPTION));

        }

    }

}
