package Parcial;

import Exceptions.CantidadInvalidaException;
import Exceptions.LimiteProductosException;
import Exceptions.PrecioInvalidoException;
import Exceptions.ProductoDuplicadoException;
import Productos.ProductoElectronico;
import Productos.ProductoGeneral;
import Productos.ProductoPerecedero;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== CASO 1: FACTURA COMPLETA ===");
        try {
            Factura f1 = new Factura();

            f1.agregarProducto(new ProductoPerecedero("Yogurt", 2000, 3, 0.2));
            f1.agregarProducto(new ProductoPerecedero("Manzanas", 1500, 4, 0));
            f1.agregarProducto(new ProductoGeneral("Galletas", 4000, 2));
            f1.agregarProducto(new ProductoGeneral("Detergente", 12000, 1));
            f1.agregarProducto(new ProductoElectronico("Televisor", 1500000, 1));

            f1.mostrarFactura();

        } catch (Exception e) {
            System.out.println("Error en caso 1: " + e.getMessage());
        }

        System.out.println("\n=== CASO 2: CANTIDAD INVÁLIDA ===");
        try {
            new ProductoGeneral("Azúcar", 2500, -3);
        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== CASO 3: PRECIO INVÁLIDO ===");
        try {
            new ProductoGeneral("Arroz", -1000, 2);
        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== CASO 4: LÍMITE DE PRODUCTOS ===");
        try {
            Factura f2 = new Factura();

            f2.agregarProducto(new ProductoGeneral("Pan", 1200, 1));
            f2.agregarProducto(new ProductoGeneral("Leche", 2000, 1));
            f2.agregarProducto(new ProductoGeneral("Huevos", 500, 1));
            f2.agregarProducto(new ProductoGeneral("Carne", 15000, 1));
            f2.agregarProducto(new ProductoGeneral("Pollo", 12000, 1));

            // Este debe fallar (supera el límite de 5)
            f2.agregarProducto(new ProductoGeneral("Jugo", 3000, 1));

        } catch (LimiteProductosException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ProductoDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CantidadInvalidaException | PrecioInvalidoException e) {
            System.out.println("Error en creación de producto: " + e.getMessage());
        }

        System.out.println("\n=== CASO 5: PRODUCTOS DUPLICADOS ===");
        try {
            Factura f3 = new Factura();

            f3.agregarProducto(new ProductoGeneral("Café", 10000, 1));

            // Este debe fallar (duplicado)
            f3.agregarProducto(new ProductoGeneral("Café", 10000, 2));

        } catch (ProductoDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LimiteProductosException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CantidadInvalidaException | PrecioInvalidoException e) {
            System.out.println("Error en creación de producto: " + e.getMessage());
        }
    }
}