package StaticWrapper;

public class Student {
    // Atributo de instancia (pertenece a cada objeto)
    String name;

    // Atributo estático (pertenece a la clase)
    static int totalStudents;

    // Bloque estático (se ejecuta una sola vez)
    static {
        totalStudents = 0;
        System.out.println("Clase Estudiante cargada en memoria");
    }

    // Constructor
    public Student(String name) {
        this.name = name;
        totalStudents++;
    }

    // Metodo de instancia
    void saludar () {
        System.out.println("Hola soy el estudiante " + name);
    }

    // Metodo estatico
    public static int getTotalStudents() {
        return totalStudents;
    }


}
