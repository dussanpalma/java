package ficheros_directorios;

import java.io.File;

public class Pruebas_rutas {

    public static void main(String[] args) {

        File archivo = new File("ejemplo_archivo");

        System.out.println(archivo.getAbsolutePath());

        System.out.println(archivo.exists());
        
    }

}
