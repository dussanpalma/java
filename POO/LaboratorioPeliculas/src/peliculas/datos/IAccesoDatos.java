package peliculas.datos;

import java.util.List;
import peliculas.domain.Pelicula;
import peliculas.exepciones.AccesoDatosEx;
import peliculas.exepciones.*;

public interface IAccesoDatos {
                                                        // exepciones 
    public abstract boolean existe(String nombreArchivo) throws AccesoDatosEx; 
    
    public abstract List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx; 
    
    public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx; 
    
    public abstract void crear(String nombreArchivo) throws AccesoDatosEx; 
    
    public abstract void borrar(String nombreArchivo) throws AccesoDatosEx; 
    
    
}
