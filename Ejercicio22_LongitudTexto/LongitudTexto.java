package Ejercicio22_LongitudTexto;

import java.util.Scanner;

public class LongitudTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Validador de Código de Producto ---");
        System.out.print("Ingresa el código (debe tener exactamente 5 caracteres): ");
        String codigo = scanner.nextLine();

        try {
            if (codigo.length() != 5) {
                throw new Exception("El código debe tener 5 caracteres, pero ingresaste " + codigo.length() + ".");
            }
            System.out.println("¡Código aceptado!");
        } catch (Exception e) {
            System.out.println("Error de longitud: " + e.getMessage());
        }
        scanner.close();
    }
}