package Ejercicio17_ErrorCharAt;

public class ErrorCharAt {
    public static void main(String[] args) {
        String palabra = "Java";
        System.out.println("--- Inspección de Caracteres ---");
        
        try {
            // La palabra "Java" solo tiene caracteres en las posiciones 0, 1, 2 y 3.
            char letra = palabra.charAt(10); 
            System.out.println("La letra es: " + letra);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: La posición solicitada supera el tamaño del texto.");
        }
    }
}