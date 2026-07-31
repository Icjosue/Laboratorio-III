package Ejercicio21_ValidarEmail;

import java.util.Scanner;

public class ValidarEmail {
    public static void validarCorreo(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("El correo electrónico debe contener un símbolo '@'.");
        }
        System.out.println("Correo electrónico válido: " + email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Validación de Correo ---");
        System.out.print("Ingresa tu correo: ");
        String correo = scanner.nextLine();

        try {
            validarCorreo(correo);
        } catch (Exception e) {
            System.out.println("Error de formato: " + e.getMessage());
        }
        scanner.close();
    }
}