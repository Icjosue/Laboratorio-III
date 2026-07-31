package Ejercicio01_DivisionCero;
import java.util.Scanner;

public class DivisionCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Programa de División Segura ---");
        System.out.print("Ingresa el primer número (dividendo): ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número (divisor): ");
        int numero2 = scanner.nextInt();

        // El bloque TRY intenta ejecutar el código que podría fallar
        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
            
        } 
        // El bloque CATCH "atrapa" el error si ocurre (en este caso, ArithmeticException por dividir entre 0)
        catch (ArithmeticException e) {
            System.out.println("¡Error! No se puede dividir un número entre cero.");
        }

        scanner.close();
    }
}