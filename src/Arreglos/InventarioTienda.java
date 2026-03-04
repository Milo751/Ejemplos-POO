package Arreglos;

public class InventarioTienda {

    public static void main(String[] args) {

        // Crear array original con tamaño fijo
        String[] productos = new String[3];

        productos[0] = "Laptop";
        productos[1] = "Mouse";
        productos[2] = "Teclado";

        System.out.println("Inventario inicial:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

        // Intento de agregar un nuevo producto (esto causaría error)
        // productos[3] = "Monitor"; // ❌ ArrayIndexOutOfBoundsException

        System.out.println("\nEl inventario está lleno. Necesitamos más espacio...");

        // Crear nuevo array con mayor tamaño
        String[] nuevoInventario = new String[4];

        // Copiar manualmente los elementos
        for (int i = 0; i < productos.length; i++) {
            nuevoInventario[i] = productos[i];
        }

        // Agregar nuevo producto
        nuevoInventario[3] = "Monitor";

        // Reasignar referencia
        productos = nuevoInventario;

        System.out.println("\nInventario actualizado:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
    }
}
