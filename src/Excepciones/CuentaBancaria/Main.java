package Excepciones.CuentaBancaria;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Camilo", 1000);

        try {
            System.out.println("Saldo inicial: " + cuenta.getSaldo());

            // Caso correcto
            cuenta.depositar(500);

            // ❌ Error: monto negativo
            cuenta.depositar(-100);

            // ❌ Error: retirar más del saldo
            cuenta.retirar(2000);

            // Caso correcto
            cuenta.retirar(300);

        } catch (MontoInvalidoException e) {
            System.out.println("Error de monto: " + e.getMessage());

        } catch (SaldoInsuficienteException e) {
            System.out.println("Error de saldo: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());

        } finally {
            System.out.println("Operación bancaria finalizada.");
        }
    }
}

