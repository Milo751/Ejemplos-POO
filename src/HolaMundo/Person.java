package HolaMundo;

public class Person {
    String name = "Camilo";
    int age = 24;
    double height = 1.71;
    String profesion = "Ing de Sistemas";

    void walk () {
        System.out.println("Estoy caminando");
    }

    String read (Book book) {
        System.out.println("Estoy leyendo");
        return book.name;
    }

    String readBo (String book) {
        System.out.println("Estoy leyendo");
        return book;
    }
}
