package Colecciones.Listas;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> cursos = new ArrayList<>();

        cursos.add("Programación I");
        cursos.add("Estructuras de Datos");
        cursos.add("Bases de Datos");
        cursos.add("Programación I");

        System.out.println("Primer curso: " + cursos.get(0));

        System.out.println("\nLista de cursos:");

        for(String curso : cursos){
            System.out.println(curso);
        }

        System.out.println("\nTotal cursos: " + cursos.size());


        // LinkedList
        LinkedList<String> estudiantes = new LinkedList<>();

        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Carlos");

        System.out.println(estudiantes);

        estudiantes.addFirst("Pedro");

        estudiantes.addLast("Laura");

        System.out.println(estudiantes);
    }
}
