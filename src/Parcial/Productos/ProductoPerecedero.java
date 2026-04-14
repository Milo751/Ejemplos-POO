package Parcial.Productos;

public class ProductoPerecedero extends Producto {

    private double descuento; // porcentaje (ej: 0.2 = 20%)

    public ProductoPerecedero(String nombre, double precioBase, int cantidad, double descuento) {
        super(nombre, precioBase, cantidad);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        double total = getPrecioBase() * getCantidad();
        return total - (total * descuento);
    }
}