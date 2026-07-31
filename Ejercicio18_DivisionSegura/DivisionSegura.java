package Ejercicio18_DivisionSegura;

public class DivisionSegura {
    
    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Imposible dividir entre cero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("--- División Segura mediante Método ---");
        try {
            double resultado = dividir(50, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Operación invalidad: " + e.getMessage());
        }
    }
}