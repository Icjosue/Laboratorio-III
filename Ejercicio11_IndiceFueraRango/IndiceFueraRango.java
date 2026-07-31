package Ejercicio11_IndiceFueraRango;

public class IndiceFueraRango {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Carlos"};
        System.out.println("--- Leyendo la lista de nombres ---");
        
        try {
            // El arreglo solo tiene índices 0, 1 y 2. El ciclo intenta llegar al 3.
            for (int i = 0; i <= 3; i++) {
                System.out.println("Nombre en posición " + i + ": " + nombres[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Ups! Intentaste leer una posición que no existe en la lista.");
        }
    }
}