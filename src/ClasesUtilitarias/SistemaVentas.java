package ClasesUtilitarias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SistemaVentas {

    public static void main(String[] args) {

        String nombreCliente = "Camilo Garcia";
        double precioProducto = 100000;
        int cantidad = 2;
        double descuento = 10;

        double subtotal = CalculadoraUtil.calcularSubtotal(precioProducto, cantidad);
        double valorDescuento = CalculadoraUtil.calcularDescuento(subtotal, descuento);
        double subtotalConDescuento = subtotal - valorDescuento;
        double iva = CalculadoraUtil.calcularIVA(subtotalConDescuento);
        double total = subtotalConDescuento + iva;

        total = CalculadoraUtil.redondear(total);

        // Uso de clases utilitarias de Java
        String nombreMayus = nombreCliente.toUpperCase();
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Cliente: " + nombreMayus);
        System.out.println("Fecha: " + fechaActual.format(formatter));
        System.out.println("Total a pagar: $" + total);
    }
}