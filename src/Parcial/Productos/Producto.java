package Parcial.Productos;

import Exceptions.CantidadInvalidaException;
import Exceptions.PrecioInvalidoException;

public abstract class Producto {
    private String nombre;
    private double precioBase;
    private int cantidad;

    public Producto(String nombre, double precioBase, int cantidad)
            throws PrecioInvalidoException, CantidadInvalidaException {

        if (precioBase < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo");
        }

        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad debe ser mayor a 0");
        }

        if (cantidad == 0) {
            throw new
        }

        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract double calcularTotal();

    @Override
    public String toString() {
        return nombre + " - Cantidad: " + cantidad + " - Total: " + calcularTotal();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Producto p = (Producto) obj;
        return nombre.equalsIgnoreCase(p.nombre)
                && precioBase == p.precioBase;
    }
}