package Ejercicio03_ConvertirTexto;

public class ConvertirTexto {
    public static void main(String[] args) {
        System.out.println("--- Conversión de Texto a Número ---");
        
        // Simulamos un texto que viene de una base de datos o interfaz, pero viene con un error (tiene una letra 'A')
        String precioTexto = "1500A"; 
        
        try {
            System.out.println("Intentando convertir el texto '" + precioTexto + "' a un número entero...");
            
            // Integer.parseInt convierte un String a int
            int precioNumero = Integer.parseInt(precioTexto); 
            
            System.out.println("El precio numérico es: " + precioNumero);
            
        } catch (NumberFormatException e) {
            System.out.println("¡Error! El texto proporcionado no tiene un formato numérico válido para convertirse.");
        }
    }
}