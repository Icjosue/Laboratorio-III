package Ejercicio19_MayorA100;

import java.util.Scanner;

public class MayorA100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Validador de Números Grandes ---");
        System.out.print("Ingresa un número mayor a 100: ");
        
        try {
            int numero = scanner.nextInt();
            if (numero <= 100) {
                throw new Exception("El número ingresado (" + numero + ") no es mayor a 100.");
            }
            System.out.println("¡Número aceptado! Es mayor a 100.");
        } catch (Exception e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
        
        scanner.close();
    }
}