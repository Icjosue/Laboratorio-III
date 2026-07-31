package Ejercicio24_ReintentarLectura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReintentarLectura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int edad = 0;

        System.out.println("--- Sistema de Reintento Automático ---");

        while (!entradaValida) {
            try {
                System.out.print("Por favor, ingresa tu edad: ");
                edad = scanner.nextInt();
                entradaValida = true; // Si llega aquí, la entrada fue un número
            } catch (InputMismatchException e) {
                System.out.println("¡Entrada inválida! Inténtalo de nuevo.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        System.out.println("¡Gracias! Tu edad registrada es: " + edad);
        scanner.close();
    }
}