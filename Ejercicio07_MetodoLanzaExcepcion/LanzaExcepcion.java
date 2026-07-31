package Ejercicio07_MetodoLanzaExcepcion;

public class LanzaExcepcion {
    
    // Este método "avisa" que puede lanzar una excepción
    public static void verificarNumero(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("El número es negativo.");
        }
        System.out.println("El número " + numero + " es válido.");
    }

    public static void main(String[] args) {
        System.out.println("--- Prueba de Método que Lanza Excepción ---");
        try {
            // Le pasamos un negativo a propósito para que falle
            verificarNumero(-15); 
        } catch (Exception e) {
            System.out.println("Error capturado en el main: " + e.getMessage());
        }
    }
}