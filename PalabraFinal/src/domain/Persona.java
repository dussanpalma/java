package domain;

public final class Persona { // uso de la palabra final en clase 

    
    public final static int MI_CONSTANTE = 1; // uso palabra final en atributos

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final void imprimir() {
        System.out.println("Metodo imprimir");
    }
}
