package javacurso.poo;

/* a continuacion primera clase*/
public class coche {

    /* a continuacion las caracteristicas de los objetos */
    private final int ruedas;

    private final int largo;

    private final int ancho;

    private final int motor;

    private final int peso_plataforma;

    private String color;

    private int peso_total;

    private boolean asientos_cuero, climatizador;

    /* a continuacion metodo constructor */
    public coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }
    //a continuacion metodo getters 
    // el metodo getters debe tener siempre un return  

    public String dime_datos_generales() {

        return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + ". Mide " + largo / 1000
                + " metros con un ancho de  " + ancho + " cm y un peso de plataforma de " + peso_plataforma
                + "kg";
    }

    // a continuación el metodo setter para color 
    public void establece_color(String color_coche) {

        color = color_coche;

    }

    /* para poder imprimir en otra clase el metodo setter, agregamos 
                otro metodo getters  */
    // metodo getters color 
    public String dime_color() {

        return "El color de tu coche es " + color;
    }


    /* metodo 
               setter para asientos  */
    public void configura_asientos(String asientos_cuero) {

        if (asientos_cuero.equalsIgnoreCase("si")) {

            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;

        }

    }

    // metodo getter asientos 
    public String dime_asientos() {

        if (asientos_cuero == true) {

            return "El coche tiene asientos de cuero";

        } else {

            return "El coche tiene asientos de serie";
        }

    }

    // metodo setters para climatizador 
    public void configura_climatizador(String climatizador) {

        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }

    }

    // metodo getters climatizador 
    public String dime_climatizador() {

        if (climatizador == true) {
            return "El coche incorpora climatizador";

        } else {
            return "El coche lleva aire acondicionado";
        }
    }


    /* a continuación metodo setter y getter(Estableciendo el valor y tambien return) juntos como ejemplo aunque no se recomienda 
           se recomienda seguir como haciamos antes, por separado */
    public String dime_peso_coche() {

        int peso_carroceria = 500;

        peso_total = peso_plataforma + peso_carroceria;

        if (asientos_cuero == true) {

            peso_total = peso_total + 50;
        }
        if (climatizador == true) {

            peso_total = peso_total + 20;
        }

        return "El peso del coche es " + peso_total;

    }

    public int precio_coche() {  //getter 

        int precio_final = 10000;

        if (asientos_cuero == true) {

            precio_final += 2000;
        }
        if (climatizador == true) {

            precio_final += 1500;

        }

        return precio_final;

    }

}
