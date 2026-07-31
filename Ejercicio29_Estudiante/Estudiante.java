package Ejercicio29_Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Double> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 100) {
            notas.add(nota);
            System.out.println("Nota " + nota + " agregada correctamente.");
        } else {
            System.out.println("Error: La nota " + nota + " no está entre 0 y 100.");
        }
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) return 0.0;
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    public void mostrarResultado() {
        System.out.println("Estudiante: " + nombre + " | Promedio: " + calcularPromedio());
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA CLASE ESTUDIANTE ---");
        Estudiante est = new Estudiante("María");
        est.agregarNota(85.0);
        est.agregarNota(105.0); // Nota inválida
        est.agregarNota(95.0);
        est.mostrarResultado();
    }
}