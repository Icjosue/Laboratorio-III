package Ejercicio16_TextoVacio;

import java.util.Scanner;

public class ValidarTextoVacio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Registro de Nombre ---");
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();
        
        try {
            // .trim() le quita los espacios en blanco al inicio y al final
            if (nombre.trim().isEmpty()) {
                throw new Exception("El campo de nombre no puede estar vacío.");
            }
            System.out.println("Nombre registrado con éxito: " + nombre);
        } catch (Exception e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
        
        scanner.close();
    }
}