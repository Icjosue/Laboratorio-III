package Ejercicio33_Abstraccion;

abstract class Figura {
    public abstract double area();
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

public class MainAbstraccion {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE ABSTRACCIÓN ---");
        Figura c = new Cuadrado(4);
        Figura cir = new Circulo(3);

        System.out.println("Área del Cuadrado: " + c.area());
        System.out.println("Área del Círculo: " + cir.area());
    }
}