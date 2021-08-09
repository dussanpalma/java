package javacurso.poo;

public class Persona {

    // atributos de la clase 
    public String nombre;
    public String apellido;

    // a continuacion el metodo, publico para que se abra desde otras clases  
    public void desplegarInformacion() {  //

        System.out.println(nombre);
        System.out.println(apellido);

    }

      // setters 
    public void Establece_Nombre(String nombre_persona){
        
        nombre=nombre_persona; 
        
        
    }
    
     //getters 
    public String Dime_Nombre(){
        
        return "El nombre de esta persona es: " + nombre; 
        
    }
    
    public void Establece_Apellido(String apellido_persona){
        
        nombre=apellido_persona; 
        
        
    } 
    
    public String Dime_Apellido(){
        
        return "El apellido de esta persona es: " + apellido; 
        
    }
    
    
    
    
}
