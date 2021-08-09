package componet_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

    public static void main(String[] args) {

        MarcoPrueba mimarco = new MarcoPrueba();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoPrueba extends JFrame {

    public MarcoPrueba() {

        setSize(500, 300);
        setLocation(800, 200);
        setTitle("Área de Texto");

        setLayout(new BorderLayout());

        laminaBotones = new JPanel();

        botonInsertar = new JButton("Insertar");

        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AreaTexto.append("En un lugar de la mancha  ");

            }

        });

        laminaBotones.add(botonInsertar);

        botonSaltoLinea = new JButton("Salto linea");

        botonSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean saltar = !AreaTexto.getLineWrap();

                AreaTexto.setLineWrap(saltar);

//                if (saltar == true) {
//                    
//                    botonSaltoLinea.setText("Quitar Salto");
//                    
//                } else {
//                    
//                    botonSaltoLinea.setText("Salto Linea");
//                }
// expresado con el operador ternario 

                botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");

            }

        });

        laminaBotones.add(botonSaltoLinea);

        add(laminaBotones, BorderLayout.SOUTH);

        AreaTexto = new JTextArea(2, 20);

        laminaConBarras = new JScrollPane(AreaTexto);

        add(laminaConBarras, BorderLayout.CENTER);

    }

    private JPanel laminaBotones;

    private JButton botonInsertar, botonSaltoLinea;

    private JTextArea AreaTexto;

    private JScrollPane laminaConBarras;

}
