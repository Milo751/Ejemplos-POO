package POO.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(100, "1234-5678"); // Inclusión
        Payment p2 = new PayPalPayment(200, "user@mail.com");
        Payment p3 = new CashPayment(50);

        // POLIMORFISMO
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();

        System.out.println("----- Sobrecarga -----");

        // Sobrecarga desde clase padre
        p1.processPayment("USD");

        // Sobrecarga específica de tarjeta
        CreditCardPayment card = (CreditCardPayment) p1;
        card.processPayment(6);
    }
}


