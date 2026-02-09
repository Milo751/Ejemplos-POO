package POO.Encapsulamiento;

public class Main {
    static void main(String[] args) {
        BankAccount cuenta = new BankAccount("Camilo", "123456789", 5000.0, "Bancol");
        System.out.println(cuenta.bankName);
        System.out.println(cuenta.ownerName);
        System.out.println(cuenta.deposit(700));
        System.out.println(cuenta.withdraw(580));
        cuenta.ownerName = "Agustin";
        // cuenta.balance = 123456;
        cuenta.setBalance(678910);
        System.out.println(cuenta.getBalance());

    }
}
