package POO.Polimorfismo;

public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Pago en efectivo por $" + amount);
        receipt.printReceipt();
    }
}
