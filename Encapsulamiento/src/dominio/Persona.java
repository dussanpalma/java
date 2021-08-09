package dominio;

public class Persona {

    private String nombre;  // IMPORTANTE !! variable encapsulada 
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }

    // a continación getter y setters creados por el IDER en Insert code
    
    
    
    public String getNombre() { //getters 
        return this.nombre;
    }

    public void setNombre(String nombre) { // setters 
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {   // en los boolean no se utiliza Get, se utiliza is 
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

   
    @Override
      public String toString(){    // este metodo se utiliza para imprimir todo de una vez en el test 
          
          return "Persona nombre: " + this.nombre + " , sueldo: " + this.sueldo + " , eliminado: " + 
                  this.eliminado; 
          
          
      }
    
    
    
    
}
