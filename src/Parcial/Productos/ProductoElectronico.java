package Parcial.Productos;

public class ProductoElectronico extends Producto {

    private static final double IMPUESTO = 0.19;

    public ProductoElectronico(String nombre, double precioBase, int cantidad) {
        super(nombre, precioBase, cantidad);
    }

    @Override
    public double calcularTotal() {
        double total = getPrecioBase() * getCantidad();
        return total + (total * IMPUESTO);
    }
}