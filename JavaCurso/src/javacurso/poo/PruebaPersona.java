package javacurso.poo;

public class PruebaPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona(); // creando objetos  
        persona1.nombre = "Dussan";
        persona1.apellido = "Palmna";
        persona1.Dime_Nombre();
        System.out.println(persona1.Dime_Nombre()); 
        persona1.Dime_Apellido(); 
        System.out.println(persona1.Dime_Apellido());
              
        
                
       // persona1.desplegarInformacion(); //imprime en la consola

        Persona persona2 = new Persona(); // objeto 2
        persona2.nombre = "Gissell";
        persona2.apellido = "Nieto";
        

        Persona persona3 = new Persona(); // objeto 3
        persona3.nombre = "Nombre: Duvan";
        persona3.apellido = "Apellido: Palma";
       

        Persona persona4 = new Persona(); // objeto 4
        persona4.nombre = "Juanito";
        persona4.apellido = "Perez";
        
    }

}
