package componet_swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuadroConLamina {

    public static void main(String[] args) {

        MarcoConTexto1 mimarco = new MarcoConTexto1();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConTexto1 extends JFrame {

    public MarcoConTexto1() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Mi ventana");
        
        LaminaConTexto milamina = new LaminaConTexto(); 
        add(milamina);

    }

}

class LaminaConTexto extends JPanel{
    
    public LaminaConTexto(){
        
        
    }
      
}
