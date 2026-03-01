package ClaseObject;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto("A001", "Laptop", 3500, "Tecnologia");
        Producto p2 = new Producto("A001", "Laptop Gamer", 4500, "Tecnologia");

        // Uso de equals()
        System.out.println("¿Son iguales? " + p1.equals(p2));

        // Uso de toString()
        System.out.println(p1);

        // Uso en colección que depende de hashCode()
        Set<Producto> inventario = new HashSet<>();
        inventario.add(p1);
        inventario.add(p2);

        System.out.println("Cantidad en inventario: " + inventario.size());

        // Uso de getClass()
        System.out.println("Clase del objeto: " + p1.getClass().getSimpleName());
    }
}
