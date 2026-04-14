package Colecciones.Mapas;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Estudiante> estudiantes = new HashMap<>();

        estudiantes.put(1001, new Estudiante(1001, "Ana"));
        estudiantes.put(1002, new Estudiante(1002, "Luis"));
        estudiantes.put(1003, new Estudiante(1003, "Carlos"));

        estudiantes.put(1002, new Estudiante(1002, "Pedro"));

        Estudiante e = estudiantes.get(1002);

        System.out.println("Estudiante encontrado: " + e);

        //HashMap<int, Estudiante> profesores = new HashMap<>();
    }
}