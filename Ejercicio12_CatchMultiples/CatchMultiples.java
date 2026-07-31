package Ejercicio12_CatchMultiples;

public class CatchMultiples {
    public static void main(String[] args) {
        System.out.println("--- Prueba de Múltiples Errores ---");
        String texto = "Cero"; // Esto causará un error al convertir
        
        try {
            int divisor = Integer.parseInt(texto); 
            int resultado = 100 / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (NumberFormatException e) {
            System.out.println("Error 1: El texto proporcionado no es un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error 2: No se puede dividir entre cero.");
        }
    }
}