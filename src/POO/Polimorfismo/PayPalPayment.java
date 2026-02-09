package POO.Polimorfismo;

public class PayPalPayment extends Payment {

    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Pago con PayPal: " + email +
                " por $" + amount);
        receipt.printReceipt();
    }
}

