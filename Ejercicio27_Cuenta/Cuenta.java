package Ejercicio27_Cuenta;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto);
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto);
        } else {
            System.out.println("Error: Retiro denegado. Fondos insuficientes o monto inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual de la cuenta: $" + saldo);
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA CLASE CUENTA ---");
        Cuenta miCuenta = new Cuenta(1000.0);
        miCuenta.mostrarSaldo();
        miCuenta.depositar(500.0);
        miCuenta.retirar(2000.0); // Debería dar error por saldo negativo
        miCuenta.retirar(300.0);
        miCuenta.mostrarSaldo();
    }
}