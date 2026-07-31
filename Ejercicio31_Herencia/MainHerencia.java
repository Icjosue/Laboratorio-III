package Ejercicio31_Herencia;

class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void sonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }
}

public class MainHerencia {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE HERENCIA ---");
        Animal miMascota = new Perro("Firulais");
        miMascota.sonido(); // Llama al sonido sobrescrito del perro
    }
}