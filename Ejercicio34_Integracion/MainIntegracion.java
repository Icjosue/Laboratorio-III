package Ejercicio34_Integracion;

import java.util.ArrayList;
import java.util.List;

// Interfaz requerida
interface Vehiculo {
    void encender();
}

class Carro implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("El carro arranca con llave: ¡Brum brum!");
    }
}

class Moto implements Vehiculo {
    @Override
    public void encender() {
        System.out.println("La moto arranca con pedal/botón: ¡Rnnn rnnn!");
    }
}

// Clases para el cálculo de áreas en lista
abstract class Figura {
    public abstract double area();
}

class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado) { this.lado = lado; }
    @Override
    public double area() { return lado * lado; }
}

public class MainIntegracion {
    public static void main(String[] args) {
        System.out.println("--- INTEGRACIÓN DE CONCEPTOS ---");
        
        // 1. Integración de Figuras en Lista
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5));
        figuras.add(new Cuadrado(10));

        double sumaAreas = 0;
        for (Figura f : figuras) {
            sumaAreas += f.area();
        }
        System.out.println("Suma total de áreas de la lista: " + sumaAreas);

        System.out.println("\n--- PRUEBA DE INTERFAZ VEHÍCULO ---");
        // 2. Uso de Interfaz
        Vehiculo miCarro = new Carro();
        Vehiculo miMoto = new Moto();

        miCarro.encender();
        miMoto.encender();
    }
}