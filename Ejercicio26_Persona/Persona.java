package Ejercicio26_Persona;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para aprovechar la validación
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Error: La edad no puede ser negativa. Se asignará 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public void mostrarDatos() {
        System.out.println("Persona: " + nombre + " | Edad: " + edad);
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA CLASE PERSONA ---");
        Persona p1 = new Persona("Carlos", 25);
        p1.mostrarDatos();

        Persona p2 = new Persona("Ana", -5); // Probando validación de edad
        p2.mostrarDatos();
    }
}