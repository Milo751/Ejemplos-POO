package POO.Polimorfismo;

public class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Pago con tarjeta: " + cardNumber +
                " por $" + amount);
        receipt.printReceipt();
    }

    // 🔁 SOBRECARGA PROPIA
    public void processPayment(int installments) {
        System.out.println("Pago con tarjeta en " + installments +
                " cuotas por $" + amount);
        receipt.printReceipt();
    }
}


