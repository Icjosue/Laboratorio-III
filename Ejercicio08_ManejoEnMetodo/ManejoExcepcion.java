package Ejercicio08_ManejoEnMetodo;

public class ManejoExcepcion {

    // Este método hace todo el trabajo sucio por dentro
    public static void calcularDoble(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El doble del número es: " + (numero * 2));
        } catch (NumberFormatException e) {
            System.out.println("¡Error DENTRO del método! El texto '" + texto + "' no es un número.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Prueba de Manejo Interno ---");
        // Le pasamos texto en lugar de un número, pero el programa no colapsará
        calcularDoble("Veinte"); 
    }
}