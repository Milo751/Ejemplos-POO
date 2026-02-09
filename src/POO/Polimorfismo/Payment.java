package POO.Polimorfismo;

public class Payment {

    protected double amount;
    protected Receipt receipt; // Composición

    public Payment(double amount) {
        this.amount = amount;
        this.receipt = new Receipt("0001", "08/02/2026");
    }

    // Método original
    public void processPayment() {
        System.out.println("Procesando pago genérico...");
        receipt.printReceipt();
    }

    // 🔁 SOBRECARGA
    public void processPayment(String currency) {
        System.out.println("Procesando pago de " + amount + " " + currency);
        receipt.printReceipt();
    }
}

