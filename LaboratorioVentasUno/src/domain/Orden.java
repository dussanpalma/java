package domain;

public class Orden {

    private int idOrden;
    private Producto productos[];  // declarando arrays
    private static int contadorOrdenes;
    public int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {  // este constructor solo inicializara IdOrden y Productos y el Arrays

        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProduto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {

            this.productos[this.contadorProductos++] = producto;

        } else {

            System.out.println("Se ha superado el maximo de productos " + Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {

        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {

            Producto producto = this.productos[i];
            total += producto.getPrecio();

        }

        return total;
    }

    public void mostarOrden() {

        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; this.contadorProductos < 10; i++) {

            System.out.println(this.productos[i]);

        }

    }

}
