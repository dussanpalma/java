package UsoThreadsMultitarea.Banco;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

    public static void main(String[] args) {

        Banco b = new Banco();

        for (int i = 0; i < 100; i++) {

            EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);

            Thread t = new Thread(r);

            t.start();

        }

    }

}

class Banco {

    public Banco() {
        cuentas = new double[100];

        for (int i = 0; i < cuentas.length; i++) {

            cuentas[i] = 2000;

        }
    }

    public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {

        cierreBanco.lock();
        
        try{
        
        if (cuentas[cuentaOrigen] < cantidad) { // evalua que el saldo no es inferior a la transferencia 

            return;

        }

        System.out.println(Thread.currentThread());

        cuentas[cuentaOrigen] -= cantidad;  // dinero que sale de la cuenta origen 

        System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);

        cuentas[cuentaDestino] += cantidad;

        System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
        }finally{
            
            cierreBanco.unlock();
            
        }
    }

    public double getSaldoTotal() {

        double suma_cuentas = 0;

        for (double a : cuentas) {

            suma_cuentas += a;

        }

        return suma_cuentas;
    }

    private final double[] cuentas;

    
     private Lock cierreBanco= new ReentrantLock(); 
    
    
}

class EjecucionTransferencias implements Runnable {

    public EjecucionTransferencias(Banco b, int de, double max) {

        banco = b;
        deLaCuenta = de;
        cantidadMax = max;

    }

    @Override
    public void run() {

        try {

            while (true) {

                int paraLaCuenta = (int) (100 * Math.random());
                double cantidad = cantidadMax * Math.random();
                banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);

                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
        }

    }

    private final Banco banco;
    private final int deLaCuenta;
    private final double cantidadMax;

}
