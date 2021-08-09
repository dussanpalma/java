
package peliculas.negocio;

public interface ICatalogoPeliculas {
    
   String NOMBRE_RECURSO = "peliculas.txt";
     
    
    public abstract void agregarPelicula(String nombrePelicula);
    
    public abstract void listarPeliculas(); 
    
    public abstract void buscarPelicula(String buscar); 
    
    public abstract void iniciarCatalogoPeliculas(); 
    
    
    
}
