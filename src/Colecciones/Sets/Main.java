package Colecciones.Sets;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> estudiantes = new HashSet<>();

        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Ana");

        System.out.println(estudiantes);

        HashSet<Estudiante> estudiantes2 = new HashSet<>();
        estudiantes2.add(new Estudiante("Ana"));
        estudiantes2.add(new Estudiante("Luis"));
        estudiantes2.add(new Estudiante("Ana"));

        System.out.println(estudiantes2);

        HashSet<String> datos = new HashSet<>();

        datos.add("FB");
        datos.add("Ea");

        System.out.println("FB".hashCode());
        System.out.println("Ea".hashCode());

        System.out.println(datos);
    }
}
