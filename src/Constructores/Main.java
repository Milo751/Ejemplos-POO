package Constructores;

public class Main {
    static void main(String[] args) {
        House casa = new House();
        House casa2 = new House(3, 6, 120.4);
        House casa3 = new House(4, 2, 17.4);
        System.out.println("Las puertas de la casa son: " + casa2.doors);
        System.out.println("Las puertas de la casa son: " + casa3.doors);

        Dog perro = new Dog();
        Dog perro2 = new Dog("Medium", "Boston", 10);

        Calculator calculadora = new Calculator();
        System.out.println(calculadora.suma(1,2));
        System.out.println(calculadora.suma(1,2,3,4));

        Users usuario1 = new Users("Camilo");
        Users usuario2 = new Users("Camilo", 24);
        Users usuario3 = new Users("Camilo", 24, "Hombre");
        Users usuario4 = new Users("Camilo", 24, "Hombre", "camilo.garcia86@eia.edu.co");

        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(usuario3.toString());
        System.out.println(usuario4.toString());

    }
}
