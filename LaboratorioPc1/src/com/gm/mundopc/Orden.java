package com.gm.mundopc;

public class Orden {

    int idOrden;
    Computadora computadoras[]; // declarando arrays
    int contadorOrdenes;
    int contadorComputadoras;
    private static final int maxComputadoras = 5;

    public Orden() {

        this.idOrden = ++contadorOrdenes;
        this.contadorComputadoras = ++contadorComputadoras;
        this.computadoras = new Computadora[Orden.maxComputadoras];

    }

    public void agregarComputadora(Computadora computadora) {

        if (this.contadorComputadoras < Orden.maxComputadoras) {

            this.computadoras[this.contadorComputadoras++] = computadora;

        } else {

            System.out.println("Se ha alcanzado el limite de computadoras");

        }

    }

    public void mostarOrden() {

        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {

            System.out.println(this.computadoras[i]);

        }

    }

}
