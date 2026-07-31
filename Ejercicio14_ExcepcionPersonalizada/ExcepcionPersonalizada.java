package Ejercicio14_ExcepcionPersonalizada;

// 1. Creamos nuestra propia clase de Error (hereda de Exception)
class MiErrorDeConexion extends Exception {
    public MiErrorDeConexion(String mensaje) {
        super(mensaje);
    }
}

public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Conexión ---");
        boolean hayInternet = false;
        
        try {
            if (!hayInternet) {
                // 2. Usamos nuestro error inventado
                throw new MiErrorDeConexion("No se detecta señal de red.");
            }
            System.out.println("Conectado a la base de datos.");
        } catch (MiErrorDeConexion e) {
            System.out.println("Falla crítica del sistema: " + e.getMessage());
        }
    }
}