package ficheros_directorios;

import java.io.File;
import java.util.Arrays;

public class Acceso_Ficheros {
    
    public static void main(String[] args) {
        
        
        File ruta = new File("C:/Users/Usuario/Downloads/Dussan");
        
        System.out.println(ruta.getAbsolutePath());
        
        String[] nombres_archivos = ruta.list();
        
        for(int i=0; i<nombres_archivos.length;i++){
            
            System.out.println(Arrays.toString(nombres_archivos)); 
            
        }
        
    }
    
}

