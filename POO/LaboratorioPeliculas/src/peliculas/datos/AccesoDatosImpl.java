package peliculas.datos;

import java.io.*;
import java.io.File;
import java.util.*;
import peliculas.domain.Pelicula;
import peliculas.exepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);
        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {

        File archivo = new File(nombreArchivo); //agregamos una variable tipo File
        List<Pelicula> peliculas = new ArrayList<>(); // Creamos un objeto llamado peliculas tipo List, ArrayList

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {

                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();

            }

            entrada.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());

        } catch (IOException ex) {

            ex.printStackTrace();

            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());

        }

        return peliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));

            salida.println(pelicula.toString());

            salida.close();

            System.out.println("Se ha escrito una informacion al archivo: " + pelicula);

        } catch (IOException ex) {

            ex.printStackTrace();

            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());

        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {

        File archivo = new File(nombreArchivo);
        String resultado = null;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while (linea != null) {

                if (buscar != null && buscar.equalsIgnoreCase(linea)) {

                    resultado = "Pelicula: " + linea + " encontrada en el indice " + indice;
                    break;

                }

                linea = entrada.readLine();
                indice++;

            }

            entrada.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

            throw new LecturaDatosEx("Exepcion al buscar pelicula: " + ex.getMessage());

        } catch (IOException ex) {

            ex.printStackTrace();

            throw new LecturaDatosEx("Exepcion al buscar pelicula: " + ex.getMessage());

        }

        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));

            salida.close();

            System.out.println("Se ha creado el archivo");

        } catch (IOException ex) {

            ex.printStackTrace();

            throw new AccesoDatosEx("Exepcion al crear archivo: " + ex.getMessage());

        }

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
            archivo.delete();
        }

        System.out.println("Se ha borrado el archivo");

    }

}
