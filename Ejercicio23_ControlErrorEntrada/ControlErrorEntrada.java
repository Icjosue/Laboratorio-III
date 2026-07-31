package Ejercicio23_ControlErrorEntrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlErrorEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Captura Segura de Precio ---");
        
        try {
            System.out.print("Ingresa el precio del producto (ej. 19.99): ");
            double precio = scanner.nextDouble();
            System.out.println("Precio capturado exitosamente: $" + precio);
        } catch (InputMismatchException e) {
            System.out.println("Error: El dato ingresado no es un número decimal válido.");
        }
        scanner.close();
    }
}