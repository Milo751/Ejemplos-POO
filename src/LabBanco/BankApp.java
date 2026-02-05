package LabBanco;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Ana Perez", "ACC-001", 500.0, 300.0);

        BankAccount account2 =
                new BankAccount("Carlos Gomez", "ACC-002", 1000.0, 400.0);

        // Operaciones
        account1.deposit(200.0);
        account1.withdraw(100.0);
        account1.withdraw(250.0); // excede límite diario

        account2.withdraw(500.0); // excede límite
        account2.deposit(-50.0);  // inválido

        // Bloqueo y prueba
        account1.blockAccount();
        account1.withdraw(50.0);

        account1.activateAccount();
        account1.withdraw(50.0);

        // Reset del límite diario
        account1.resetDailyLimit();
        account1.withdraw(200.0);

        // Mostrar información
        System.out.println("\n--- Account Information ---");
        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());

        // Datos globales
        System.out.println("\n--- System Data ---");
        System.out.println("Total accounts: " +
                BankAccount.getTotalAccounts());

        System.out.println("Total operations: " +
                BankAccount.getTotalOperations());

        System.out.println("Blocked accounts: " +
                BankAccount.getBlockedAccounts());
    }
}

