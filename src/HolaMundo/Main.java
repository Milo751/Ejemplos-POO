package HolaMundo;

public class Main {
    static void main(String[] args) {
        String name = "Camilo";
        int age = 24;
        boolean hello = false;

        if (hello) {
            System.out.println("Hola mundo, me llamo " + name + " y tengo " + age);
        } else {
            System.out.println("No gracias");
        }

        Book libro = new Book();
        System.out.println(libro.name);
        System.out.println("Escrito por: " + libro.author);
        System.out.println("Con un total de: " + libro.pages + "páginas");
        libro.open(true);
        libro.open(false);

        Person persona = new Person();
        System.out.println(persona.name);
        System.out.println(persona.age);
        System.out.println(persona.height);
        System.out.println(persona.profesion);
        persona.walk();
        System.out.println("Me leí " + persona.read(libro));
        System.out.println("Me leí " + persona.readBo(libro.name));

    }
}
