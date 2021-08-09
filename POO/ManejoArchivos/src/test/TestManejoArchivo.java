package test;


import manejoarchivos.ManejoArchivos;
import static manejoarchivos.ManejoArchivos.anexarArchivo;
import static manejoarchivos.ManejoArchivos.escribirArchivo;
import static manejoarchivos.ManejoArchivos.leerArchivo;

public class TestManejoArchivo {

    public static void main(String[] args) {

        String nombreArchivo = "Prueba.txt";

//        ManejoArchivos.crearArchivo(nombreArchivo);

//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "Adios");
        
         
        leerArchivo(nombreArchivo);


    }

}
