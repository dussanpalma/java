package programacion_generica;

public class Pareja<T> {

    public Pareja() {

        primero = null;

    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getPrimero() {
        return primero;
    }

    private T primero;

}
