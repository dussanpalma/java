package javacurso.poo;

import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Dussan Palma Solano", 85000, 1998, 3, 23);
        Empleado empleado2 = new Empleado("Gissell Nieto Alean", 95000, 1998, 6, 4);
        Empleado empleado3 = new Empleado("Danna Palma Solano", 105000, 2004, 2, 17);
        Empleado empleado4 = new Empleado("Ninfa Solano Maestre", 105000, 1977, 6, 25);

        empleado1.subeSueldo(0);
        empleado2.subeSueldo(0);
        empleado3.subeSueldo(5);
        empleado4.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
                + " Fecha de alta: " + empleado1.dameFechaContrato());

        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
                + " Fecha de alta: " + empleado2.dameFechaContrato());

        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
                + " Fecha de alta: " + empleado3.dameFechaContrato());

        System.out.println("Nombre: " + empleado4.dameNombre() + " Sueldo: " + empleado4.dameSueldo()
                + " Fecha de alta: " + empleado4.dameFechaContrato());

    }

}
// a continuación otra clase llamada Empleado 

class Empleado {

    /* a continuación creamos el metodo constructor debe ser 
public para que otras clases puedan verlo, y este tendra parametros 
     */
    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        /* a continuación declaramos las variables igual a parametros y utilizamos 
                   clase GregorianCalendar de java.util, utilizamos el 2do constructor en la api, que 
                       utiliza, año, mes, dia con datos int, recordar que el conteo siempre empieza en 0
                        tambine utilizamos el metodo getTime de la clase GregoriaCalendar que lo que hace 
                           es devolver la fecha (getTime es heredada de clase Calendar y a su vez de la clase Object  */
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia); // se le resta -1 a mes, por el conteo siempre empieza por 0
        altaContrato = calendario.getTime();

    }

    // a continuación Getter de nombre
    public String dameNombre() {

        return nombre;

    }

    // a continuación  Getter  de sueldo 
    public double dameSueldo() {

        return sueldo;
    }

    // a continuación getter de la fechaContrato 
    public Date dameFechaContrato() {

        return altaContrato;
    }

    // a continuación un setter con parametro de dato double porque es un porcentaje
    public void subeSueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }


    /* a continuación las variables y  creanmos una variable 
            Date de tipo objeto, para eso hay que importar el package de la clase  
               Date del paquete java.util   */
    private final String nombre;
    private double sueldo;
    private final Date altaContrato;

}
