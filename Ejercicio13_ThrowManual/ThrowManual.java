package Ejercicio13_ThrowManual;

public class ThrowManual {
    public static void main(String[] args) {
        double saldo = 500.00;
        double retiro = 600.00;
        System.out.println("--- Cajero Automático ---");
        
        try {
            if (retiro > saldo) {
                // Lanzamos el error manualmente con throw
                throw new Exception("Fondos insuficientes para retirar $" + retiro);
            }
            saldo -= retiro;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } catch (Exception e) {
            System.out.println("Transacción rechazada: " + e.getMessage());
        }
    }
}