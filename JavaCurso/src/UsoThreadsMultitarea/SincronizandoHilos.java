package UsoThreadsMultitarea;

public class SincronizandoHilos {

    public static void main(String[] args) {

//----------------------------- HILO 1 --------------------------------------------------             
        HilosVarios hilo1 = new HilosVarios();
        hilo1.start(); // start se utiliza para empezar el hilo

//----------------------------- HILO 2 --------------------------------------------------     
        HilosVarios2 hilo2 = new HilosVarios2(hilo1);
        hilo2.start();

//----------------------------- HILO 3 --------------------------------------------------     
        HilosVarios2 hilo3 = new HilosVarios2(hilo2);
        hilo3.start();

        System.out.println("Tareas terminadas");
    }

}

//----------------------------- CLASE PARA EJECUTAR LOS HILOS --------------------------------------------------     
class HilosVarios extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Ejecutando hilo " + getName());

            try {

                //slepp se utiliza para frenar el hilo 
                Thread.sleep(500);

            } catch (InterruptedException ex) {

                System.out.println("Fallo en el sleep");

            }

        }

    }

}

//----------------------------- CLASE PARA EJECUTAR LOS HILOS 2 SINCRONIZADOS  --------------------------------------------------
class HilosVarios2 extends Thread {

    public HilosVarios2(Thread hilo) {

        this.hilo = hilo;

    }

    @Override
    public void run() {

// join se utiliza para que el hilo continue hasta su muerte, y luego comience el hilo 2
        try {
            hilo.join();
        } catch (InterruptedException ex) {
        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Ejecutando hilo " + getName());

            try {

                //slepp se utiliza para frenar el hilo 
                Thread.sleep(500);

            } catch (InterruptedException ex) {

                System.out.println("Fallo en el sleep");

            }

        }

    }

    private Thread hilo;

}
