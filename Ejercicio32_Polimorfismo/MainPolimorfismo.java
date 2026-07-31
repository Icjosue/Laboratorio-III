package Ejercicio32_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void sonido() {
        System.out.println("Sonido de animal.");
    }
}

class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("El perro dice: ¡Guau!");
    }
}

class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("El gato dice: ¡Miau!");
    }
}

public class MainPolimorfismo {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE POLIMORFISMO ---");
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro());
        granja.add(new Gato());
        granja.add(new Perro());

        // Recorremos la lista ejecutando el mismo método en distintos tipos de objeto
        for (Animal a : granja) {
            a.sonido();
        }
    }
}