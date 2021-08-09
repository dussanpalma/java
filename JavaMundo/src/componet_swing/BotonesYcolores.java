package componet_swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class BotonesYcolores {

    public static void main(String[] args) {

        MarcoBotones mimarco = new MarcoBotones();

        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }

}

class MarcoBotones extends JFrame { //constructor 

    public MarcoBotones() {

        setTitle("Botones y Eventos");

        setBounds(300, 300, 700, 400);

        LaminaBotones milamina = new LaminaBotones();

        add(milamina);

        EventosDeRaton EventoRaton = new EventosDeRaton();

        addMouseListener(EventoRaton);
        
//        addMouseMotionListener(EventoRaton);

    }

}

class LaminaBotones extends JPanel implements ActionListener { //Responde a enventos de raton 

    JButton botonOscuro = new JButton("Oscuro");
    JButton botonBlanco = new JButton("Blanco");
    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");
    JButton botonAmarillo = new JButton("Amarillo");

    public LaminaBotones() {

        add(botonOscuro);
        add(botonBlanco);
        add(botonAzul);
        add(botonRojo);
        add(botonVerde);
        add(botonAmarillo);

        botonOscuro.addActionListener(this); // al hacer click 
        botonBlanco.addActionListener(this);
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
        botonAmarillo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {  // objeto pertenece a la interfaz ActionListener

        Object botonPulsado = e.getSource();

        if (botonPulsado == botonOscuro) {

            setBackground(Color.darkGray);

        } else if (botonPulsado == botonBlanco) {

            setBackground(Color.LIGHT_GRAY);
        } else if (botonPulsado == botonAzul) {

            setBackground(Color.BLUE);

        } else if (botonPulsado == botonRojo) {

            setBackground(Color.RED);

        } else if (botonPulsado == botonVerde) {

            setBackground(Color.green);

        } else if (botonPulsado == botonAmarillo) {

            setBackground(Color.YELLOW);
        }

    }

}

class EventosDeRaton implements MouseListener {  //eventos de raton 

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Has hecho click en la Coordenada X: " + e.getX() + " "
                + " Y: " + e.getY());
        
        System.out.println("Has hecho los siguientes clicks: " + (e.getClickCount())); 
    }

    @Override
    public void mousePressed(MouseEvent e) {
          
        System.out.println(e.getModifiersEx());  // muestra el valor del click derecho, izquierdo y reuda
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("Acabas de entar");

    }

    @Override
    public void mouseExited(MouseEvent e) {
 
        System.out.println("Acabas de salir");

    }

    
    // aqui abajo los metodos de la clase Abstracta MouseMotionListener para ver si arastras o mueves
          // que no esta implementada en la clase 
    
//    @Override
//    public void mouseDragged(MouseEvent e) {
//        System.out.println("Estas arrastrando el raton");
//        
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//        
//        System.out.println("Estas moviendo el raton");
//        
//    }

}
