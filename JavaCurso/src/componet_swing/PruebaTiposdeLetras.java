package componet_swing;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class PruebaTiposdeLetras {

    public static void main(String[] args) {

        String fuente = JOptionPane.showInputDialog("Introduce Fuente");

        boolean estaLaFuente = false;

        // para ver que letras tengo instaladas en mi ordenador
        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombredelafuente : nombresDeFuentes) {

            System.out.println(nombredelafuente);
            
            if (nombredelafuente.equalsIgnoreCase(fuente)) {

                estaLaFuente = true;

            }

        }

        if (estaLaFuente) {

            System.out.println("Fuente instalada");

        } else {

            System.out.println("No esta instalada la fuente");

        }

    }
}
