
import java.io.FileWriter;
import java.io.IOException;

public class StremFicheroEscribir {

    public static void main(String[] args) {

        Escribiendo accede = new Escribiendo();

        accede.escribir();

    }

}

class Escribiendo {

    public void escribir() {

        
        
        // tambien podemos utilizar el metodo BufferWriter
        FileWriter escritura = null;
        try {
            
            String frase = "Esto es una prueba de Escritura";
            escritura = new FileWriter("C:/Users/Usuario/Downloads/Dussan/nuevo.txt");

            for (int i = 0; i < frase.length(); i++) {

                escritura.write(frase.charAt(i));

            }

        } catch (IOException ex) {

        } finally {
            try {
                escritura.close();
            } catch (IOException ex) {

            }
        }

    }

}
