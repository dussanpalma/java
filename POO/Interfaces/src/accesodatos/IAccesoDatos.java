package accesodatos;

public interface IAccesoDatos { // las interfaces solo tienen atributos constantes 

    public static final int MAX_REGISTRO = 10; // constante 

    // cualquier metodo de las interfaces va a ser public stract 
    public abstract void insertar();

    public abstract void listar();

    public abstract void actualizar();

    public abstract void eliminar();

}
