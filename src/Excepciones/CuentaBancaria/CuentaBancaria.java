package Excepciones.CuentaBancaria;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // 💰 Depositar dinero
    public void depositar(double monto) throws MontoInvalidoException {

        if (monto <= 0) {
            throw new MontoInvalidoException("El monto a depositar debe ser mayor a 0");
        }

        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }

    // 💸 Retirar dinero
    public void retirar(double monto)
            throws SaldoInsuficienteException, MontoInvalidoException {

        if (monto <= 0) {
            throw new MontoInvalidoException("El monto a retirar debe ser mayor a 0");
        }

        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }

        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}

