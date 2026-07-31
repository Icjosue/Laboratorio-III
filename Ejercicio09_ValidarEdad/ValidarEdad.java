package Ejercicio09_ValidarEdad;

import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Sistema de Registro ---");
        
        System.out.print("Por favor, ingresa tu edad: ");
        
        try {
            int edad = scanner.nextInt();
            
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser un número negativo.");
            }
            
            System.out.println("¡Registro exitoso! Tienes " + edad + " años.");
            
        } catch (Exception e) {
            System.out.println("Error en el registro: " + e.getMessage());
        }
        
        scanner.close();
    }
}