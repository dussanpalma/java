package proyectoCaja;

public class CajaUno { // las clases comienzan por mayuscula 

    int ancho;
    int alto;
    int profundo;

    public CajaUno() {
        
    

    }

    public CajaUno(int ancho, int alto, int profundo) {
        
        this.ancho=ancho; 
        this.alto=alto;
        this.profundo=profundo;
        

    }

    public int volumen() {  // los metodos comienzan por minuscula 

        int volumen = ancho * alto * profundo;

        return  volumen;

    }

}
