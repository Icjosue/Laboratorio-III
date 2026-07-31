package Ejercicio30_Empleado;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Error: El salario no puede ser negativo.");
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre + " | Salario: $" + salario);
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA VARIOS EMPLEADOS ---");
        Empleado e1 = new Empleado("Roberto", 2500.00);
        Empleado e2 = new Empleado("Laura", -1000.00); // Salario inválido
        Empleado e3 = new Empleado("Sofia", 3200.00);

        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();
    }
}