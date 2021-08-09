package componet_swing;

import javax.swing.*;

public class CreandoMarcos {

    public static void main(String[] args) {

        MiMarco marco1 = new MiMarco(); // instancia de clase

        marco1.setVisible(true); //Metodo o clase para mostrar ventana

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Metodo para cerrar ventana

    }

}

class MiMarco extends JFrame {

    public MiMarco() {

        // algunas metodos de clase JFrame
        setSize(500, 300); // configurar medidas del cuadro
        setLocation(800, 200); // configurar location
        setResizable(false); // se puede agrandar con el cursos 
        // setExtendedState(Frame.MAXIMIZED_BOTH); //Sale en toda la pantalla
        setTitle("Mi ventana"); // titulo de la ventana

    }

}
