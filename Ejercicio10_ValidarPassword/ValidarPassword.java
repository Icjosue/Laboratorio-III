package Ejercicio10_ValidarPassword;

import java.util.Scanner;

public class ValidarPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Creación de Contraseña ---");
        System.out.print("Ingresa una contraseña (mínimo 8 caracteres): ");
        String password = scanner.nextLine();
        
        try {
            if (password.length() < 8) {
                throw new Exception("La contraseña es muy corta. Tiene " + password.length() + " caracteres.");
            }
            System.out.println("¡Contraseña guardada con éxito!");
        } catch (Exception e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        }
        scanner.close();
    }
}