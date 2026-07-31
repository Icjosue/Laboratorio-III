package Ejercicio25_MenuConErrores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConErrores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Saludar");
            System.out.println("2. Ver fecha aproximada");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("¡Hola! Esperamos que tengas un excelente día.");
                        break;
                    case 2:
                        System.out.println("Hoy es un gran día para programar Java.");
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Elige del 1 al 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Debes ingresar un número entero como opción.");
                scanner.nextLine(); // Limpieza de buffer
            }
        }
        scanner.close();
    }
}