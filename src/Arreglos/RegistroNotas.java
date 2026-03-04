package Arreglos;

public class RegistroNotas {

    public static void main(String[] args) {

        // Declaración e inicialización del array
        double[] notas = new double[5];

        // Valores por defecto
        System.out.println("Nota inicial en posición 0: " + notas[0]);

        // Asignar valores
        notas[0] = 4.5;
        notas[1] = 3.8;
        notas[2] = 4.2;
        notas[3] = 5.0;
        notas[4] = 4.7;

        // Acceder a valores
        System.out.println("Primera nota: " + notas[0]);
        System.out.println("Última nota: " + notas[4]);
    }
}