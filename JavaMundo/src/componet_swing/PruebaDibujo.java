package componet_swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {

    public static void main(String[] args) {

        MarcoConDibujos mimarco = new MarcoConDibujos();

        mimarco.setVisible(true);

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Prueba de Dibujo");
        setSize(500, 500);
        laminaConFiguras milamina = new laminaConFiguras();
        add(milamina);
        milamina.setBackground(SystemColor.window);
    }

}

class laminaConFiguras extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

//        g.draw3DRect(100, 120, 350, 250, true); ejemplos 
//        g.drawArc(50, 100, 100, 200, 120, 150);
        Graphics2D g2 = (Graphics2D) g;   // ejemplo en 2D

        Rectangle2D rectangulo = new Rectangle2D.Double(70, 50, 350, 350); // Instancia 

        g2.setPaint(Color.BLACK);
        g2.draw(rectangulo);
        g2.setPaint(Color.red);
        g2.fill(rectangulo);

        // elipse 
        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.setPaint(new Color(171, 185, 31)); // para dar color RGB

        g2.fill(elipse);

    }

}
