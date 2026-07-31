package Ejercicio15_LanzarPersonalizada;

class MembresiaVencidaException extends Exception {
    public MembresiaVencidaException(String mensaje) {
        super(mensaje);
    }
}

public class LanzarPersonalizada {
    public static void main(String[] args) {
        int diasRestantes = 0;
        System.out.println("--- Verificación de Acceso al Gimnasio ---");
        
        try {
            if (diasRestantes <= 0) {
                throw new MembresiaVencidaException("Tu membresía ha expirado. Favor de renovar en recepción.");
            }
            System.out.println("¡Acceso concedido! Que tengas un buen entrenamiento.");
        } catch (MembresiaVencidaException e) {
            System.out.println("Acceso denegado: " + e.getMessage());
        }
    }
}