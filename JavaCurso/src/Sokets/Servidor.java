package Sokets;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Servidor {

    public static void main(String[] args) {

        MarcoServidor mimarco = new MarcoServidor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoServidor extends JFrame implements Runnable {

    public MarcoServidor() {

        setBounds(1200, 300, 280, 350);
        JPanel milamina = new JPanel();
        milamina.setLayout(new BorderLayout());
        areatexto = new JTextArea();
        milamina.add(areatexto, BorderLayout.CENTER);
        add(milamina);
        setVisible(true);
        Thread mihilo = new Thread(this);
        mihilo.start();

    }

    private JTextArea areatexto;

    @Override
    public void run() {

        try {
            //        System.out.println("Estoy a la escucha");
            ServerSocket servidor = new ServerSocket(9999);      
            while(true){
            Socket misocket = servidor.accept();
            DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());
            String mensaje_texto = flujo_entrada.readUTF();
            areatexto.append("\n" + mensaje_texto);
            misocket.close();
            }         
        } catch (IOException ex) {
        }

    }
}
