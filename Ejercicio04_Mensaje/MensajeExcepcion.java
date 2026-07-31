package Ejercicio04_Mensaje;

public class MensajeExcepcion {
    public static void main(String[] args) {
        System.out.println("--- Prueba de Mensaje Personalizado ---");
        try {
            int[] arreglo = {10, 20, 30};
            // Intentamos acceder a la posición 5, pero el arreglo solo tiene 3 elementos (posiciones 0, 1 y 2)
            System.out.println("El valor es: " + arreglo[5]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Mensaje personalizado!: Te saliste de los límites del arreglo.");
            System.out.println("Mensaje técnico de Java: " + e.getMessage());
        }
    }
}