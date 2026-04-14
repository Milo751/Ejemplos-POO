package Parcial.Productos;

public class ProductoGeneral extends Producto {

    public ProductoGeneral(String nombre, double precioBase, int cantidad) {
        super(nombre, precioBase, cantidad);
    }

    @Override
    public double calcularTotal() {
        return getPrecioBase() * getCantidad();
    }
}