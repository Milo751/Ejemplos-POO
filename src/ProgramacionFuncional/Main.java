package ProgramacionFuncional;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    String getNombre() {
        return nombre;
    }

    int getEdad() {
        return edad;
    }
}

@FunctionalInterface
interface Formateador { // Interfaz funcional propia
    String formatear(Estudiante e);
}

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = List.of(
                new Estudiante("Ana", 20),
                new Estudiante("Luis", 17),
                new Estudiante("Pedro", 22),
                new Estudiante("Maria", 16)
        );

        // Predicate: filtra
        Predicate<Estudiante> esMayor = e -> e.getEdad() >= 18;

        // Function: transforma
        Function<Estudiante, String> obtenerNombre = e -> e.getNombre();

        // Consumer: ejecuta
        Consumer<String> imprimir = nombre -> System.out.println(nombre);

        // Interfaz funcional propia + lambda
        Formateador formateador = e -> "Estudiante: " + e.getNombre().toUpperCase();

        // STREAM COMPLETO (pipeline)
        List<String> resultado = estudiantes.stream()
                .filter(e -> e.getEdad() >= 18)                         // filtra
                .map(obtenerNombre)                      // transforma
                .map(String::toUpperCase)                // otra transformación
                .collect(Collectors.toList());           // terminal

        // imprimir con Consumer
        resultado.forEach(imprimir);

        // uso de interfaz funcional propia
        System.out.println("\nFormateados:");
        estudiantes.stream()
                .filter(esMayor)
                .map(formateador::formatear)
                .forEach(System.out::println);

        // Optional + Stream
        Optional<Estudiante> primero = estudiantes.stream()
                .filter(esMayor)
                .findFirst();

        // ofNullable + orElse
        Estudiante estudianteSeguro = Optional
                .ofNullable(primero.orElse(null))
                .orElse(new Estudiante("Por defecto", 0));

        System.out.println("\nPrimero encontrado:");
        System.out.println(estudianteSeguro.getNombre());
    }
}
