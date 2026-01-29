package StaticWrapper;

public class ExampleString {
    static void main(String[] args) {
        String name = "Gabriel";
        System.out.println(name);
        System.out.println(name.toUpperCase());

        String name2 = "Gabriel";
        System.out.println(name==name2); // true (Mismos espacios en memoria)

        String name3 = new String("Gabriel");
        System.out.println(name==name3); //false (diferentes espacios en memoria)

        Person person = new Person("Camilo", "Garcia");
        System.out.println(person.toString());

        // Metodos string
        String text = "Hola, mundo!";
        System.out.println("Longitud: " + text.length()); // 12

        System.out.println("Caracter en la posición 2: " + text.charAt(2)); // 'l'

        System.out.println("Subcadena: " + text.substring(0, 5)); // "Hola"

        System.out.println("Mayusculas: " + text.toUpperCase()); // "HOLA, MUNDO"
        System.out.println("Minusculas: " + text.toLowerCase()); // "hola, mundo"

        String text1 = "Hola";
        String text2 = "hola";
        System.out.println("Son iguales? " + text1.equals(text2)); // false

        System.out.println("Son iguales? (ignorando mayusculas) " + text1.equalsIgnoreCase(text2)); // true

        System.out.println("Contiene 'mundo'? " + text.contains("mundo")); // true

        System.out.println("Reemplazando: " + text.replace('o', 'a')); // "Hala, munda!"

        String textWithSpaces = "  Hola, mundo!  ";
        System.out.println("Trimmed: " + textWithSpaces.trim()); // "Hola, mundo!"

        String csvText = "Uno,Dos,Tres";
        String[] parts = csvText.split(",");
        System.out.println("Dividido");
        for (String part : parts) {
            System.out.println(part);
        }
        // Uno
        // Dos
        // Tres
    }
}
