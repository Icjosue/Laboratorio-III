package Ejercicio06_Positivo;

import java.util.Scanner;

public class ValidarPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Validador de Números Positivos ---");
        
        try {
            System.out.print("Ingresa un número estrictamente positivo: ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                // Cambiamos Exception por IllegalArgumentException
                throw new IllegalArgumentException("El número no puede ser negativo. Ingresaste: " + numero);
            }
            
            System.out.println("¡Excelente! Ingresaste el número positivo: " + numero);
            
        } catch (IllegalArgumentException e) { 
            // Asegúrate de cambiarlo en el catch también
            System.out.println("¡Error de validación! " + e.getMessage());
        }
        
        scanner.close();
    }
}