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
                // Nosotros mismos lanzamos la excepción si no nos gusta el número
                throw new Exception("El número no puede ser negativo. Ingresaste: " + numero);
            }
            
            System.out.println("¡Excelente! Ingresaste el número positivo: " + numero);
            
        } catch (Exception e) {
            // Aquí atrapamos la excepción que nosotros mismos lanzamos arriba
            System.out.println("¡Error de validación! " + e.getMessage());
        }
        
        scanner.close();
    }
}