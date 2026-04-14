package SOLID;

public class PedidoService {

    public void procesarPedido(String tipoCliente, String tipoPago, double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }

        double descuento = 0;
        if (tipoCliente.equals("VIP")) {
            descuento = monto * 0.2;
        } else if (tipoCliente.equals("Regular")) {
            descuento = monto * 0.1;
        }

        double total = monto - descuento;

        if (tipoPago.equals("TARJETA")) {
            System.out.println("Pagando con tarjeta: " + total);
        } else if (tipoPago.equals("PAYPAL")) {
            System.out.println("Pagando con PayPal: " + total);
        }

        guardar(total);
        enviarCorreo("cliente@email.com", total);
    }

    public void enviarSMS(String telefono) {
        System.out.println("Enviando SMS...");
    }

    private void guardar(double total) {
        System.out.println("Guardando pedido: " + total);
    }

    private void enviarCorreo(String email, double total) {
        System.out.println("Enviando correo: " + total);
    }
}
