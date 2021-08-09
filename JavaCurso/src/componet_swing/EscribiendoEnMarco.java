package componet_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {

        MarcoConTexto mimarco = new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConTexto extends JFrame {

    public MarcoConTexto() {

        setVisible(true);
        setSize(600, 450);
        setLocation(500, 300);
        setTitle("Crash Royale");

        Lamina miLamina = new Lamina();
        add(miLamina);

        // esto sirve para poner todo lo que se escriba en un solo color 
        miLamina.setForeground(Color.BLACK);

    }

}

class Lamina extends JPanel {

    //utilizando metodos de JPanel para escribir en un cuadro 
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Font mifuente = new Font("Pristina", Font.BOLD, 26);

        g2.setFont(mifuente);

//        g2.setColor(Color.BLUE);
        g2.drawString("Dussan Palma", 100, 100);

        // otra forma de escribir 
        g2.setFont(new Font("Arial", Font.BOLD, 26));
//        g2.setColor(new Color(128,90,50));
        g2.drawString("Utilizando Java", 100, 200);

    }

}
