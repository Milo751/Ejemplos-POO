package ClasesUtilitarias;

import java.util.Objects;

public final class CalculadoraUtil {

    private static final double IVA = 0.19;

    // Constructor privado para evitar instanciación
    private CalculadoraUtil() {
        throw new UnsupportedOperationException("Clase utilitaria - no instanciable");
    }

    public static double calcularSubtotal(double precio, int cantidad) {
        validarPrecio(precio);
        validarCantidad(cantidad);
        return precio * cantidad;
    }

    public static double calcularDescuento(double subtotal, double porcentajeDescuento) {
        if (porcentajeDescuento < 0) {
            throw new IllegalArgumentException("El descuento no puede ser negativo");
        }
        return subtotal * (porcentajeDescuento / 100);
    }

    public static double calcularIVA(double subtotalConDescuento) {
        return subtotalConDescuento * IVA;
    }

    public static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    private static void validarPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
    }

    private static void validarCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
    }
}
