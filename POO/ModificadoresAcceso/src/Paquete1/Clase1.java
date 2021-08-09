package Paquete1;


/* public en clases: se puede utilizar esta 
    clase desde otra clase en el mismo o diferente paquete */

/* protected no se admite en clases */ 


public class Clase1 {
    
    
    

    /* public en atributos, este atributo se puede utilizar 
    en otras clases directamente*/
    
    /* protected en atributos, este atributo no se puede utilizar 
    en otras clases directamente, solamente clases hijas */
    
    public String atributoPublico = "Valor atributo publico";


    
    
    // public en constructores, tambien se puede acceder desde otras clases 
    
    /* protected en constructores, este constructor no se puede utilizar 
    en otras clases directamente, solamente clases hijas y si podemos utilizar super*/
    
    public Clase1() {

        System.out.println("Constructor publico");
    }


    
    
    /* public en metodos,se puede acceder desde otra clase */
    
     /* protected en metodos, este metodo no se puede utilizar 
    en otras clases directamente, solamente clases hijas */
    
    public void metodoPublico() {
        System.out.println("Metodo publico");

    }

}



