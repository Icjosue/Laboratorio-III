package Ejercicio20_SimularError;

public class SimularError {
    public static void main(String[] args) {
        System.out.println("--- Simulacro de Error de Sistema ---");
        try {
            boolean sensorFallando = true;
            if (sensorFallando) {
                throw new RuntimeException("Falla crítica simulada en el sensor de temperatura.");
            }
        } catch (RuntimeException e) {
            System.out.println("ALERTA: Se ha activado el protocolo de seguridad. Razón: " + e.getMessage());
        }
    }
}