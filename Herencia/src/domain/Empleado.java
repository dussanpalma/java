package domain;

public class Empleado extends Persona {

    private int idEmpleado;   // en esta clase utilizamos private, porque no tendra ninguna clase hija para heredar 
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre); // aqui lo relacionamos con el nombre de la clase padre 
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {  // otra forma de decir el metodo toString
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", nombre=").append(this.nombre);
        sb.append('}');
        return sb.toString();
    }

   
    
    
    
}
