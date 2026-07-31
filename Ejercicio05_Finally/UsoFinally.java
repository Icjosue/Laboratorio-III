package Ejercicio05_Finally;

public class UsoFinally {
    public static void main(String[] args) {
        System.out.println("--- Uso del bloque Finally ---");
        
        try {
            System.out.println("Paso 1: Intentando hacer una división...");
            int resultado = 100 / 0; // Esto provocará un error
            System.out.println("Paso 2: Este mensaje no se verá por el error.");
            
        } catch (ArithmeticException e) {
            System.out.println("Paso 2 (Alternativo): ¡Atrapamos un error matemático!");
            
        } finally {
            System.out.println("Paso 3 (Finally): Este bloque siempre se ejecuta. Es ideal para cerrar conexiones o liberar memoria.");
        }
    }
}