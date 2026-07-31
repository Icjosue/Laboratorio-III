package Ejercicio02_EntradaNumerica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Validación de Entrada Numérica ---");
        
        try {
            System.out.print("Por favor, ingresa tu edad (solo números enteros): ");
            // Si el usuario escribe texto, la siguiente línea fallará y saltará al catch
            int edad = scanner.nextInt(); 
            System.out.println("Edad registrada correctamente: " + edad);
            
        } catch (InputMismatchException e) {
            System.out.println("¡Error! Ingresaste texto o caracteres no válidos. Debes ingresar un número entero.");
        }
        
        scanner.close();
    }
}