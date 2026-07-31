package Ejercicio28_Producto;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo. Se asignará $0.0");
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA LISTA DE PRODUCTOS ---");
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Laptop", 1200.50));
        lista.add(new Producto("Mouse", -15.0)); // Invalido
        lista.add(new Producto("Teclado", 45.00));

        for (Producto p : lista) {
            p.mostrarProducto();
        }
    }
}