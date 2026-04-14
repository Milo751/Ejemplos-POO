package Parcial;

import Exceptions.LimiteProductosException;
import Exceptions.ProductoDuplicadoException;
import Productos.Producto;

public class Factura {

    private static int contador = 1;

    private int id;
    private Producto[] productos;
    private int indice;

    public Factura() {
        this.id = contador++;
        this.productos = new Producto[5];
        this.indice = 0;
    }

    public void agregarProducto(Producto p)
            throws LimiteProductosException, ProductoDuplicadoException {

        if (indice >= productos.length) {
            throw new LimiteProductosException("Máximo de productos alcanzado");
        }

        for (int i = 0; i < indice; i++) {
            if (productos[i].equals(p)) {
                throw new ProductoDuplicadoException("Producto duplicado: " + p.getNombre());
            }
        }

        productos[indice++] = p;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += productos[i].calcularTotal();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura #" + id);
        for (int i = 0; i < indice; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total: " + calcularTotal());
    }
}
