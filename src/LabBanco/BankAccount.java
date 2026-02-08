package LabBanco;

public class BankAccount {

    // Atributos de instancia
    private String ownerName;
    private final String accountNumber;
    private Double balance;
    private Double dailyWithdrawalLimit;
    private Double originalDailyLimit;
    private Boolean active;

    // Atributos estáticos
    private static Integer totalAccounts = 0;
    private static Integer totalOperations = 0;
    private static Integer blockedAccounts = 0;

    // Constructor
    public BankAccount(String ownerName, String accountNumber,
                       Double initialBalance, Double dailyWithdrawalLimit) {

        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
        this.originalDailyLimit = dailyWithdrawalLimit;
        this.active = true;

        totalAccounts++;
    }

    // Métodos de negocio

    public Boolean deposit(Double amount) {
        if (!active) {
            System.out.println("Error: Account is blocked. Deposit not allowed.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
            return false;
        }

        balance += amount;
        totalOperations++;
        return true;
    }

    public Boolean withdraw(Double amount) {
        if (!active) {
            System.out.println("Error: Account is blocked. Withdrawal not allowed.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
            return false;
        }

        if (amount > dailyWithdrawalLimit) {
            System.out.println("Error: Daily withdrawal limit exceeded.");
            return false;
        }

        balance -= amount;
        dailyWithdrawalLimit -= amount;
        totalOperations++;
        return true;
    }

    public void blockAccount() {
        if (active) {
            active = false;
            blockedAccounts++;
            System.out.println("Account " + accountNumber + " has been blocked.");
        }
    }

    public void activateAccount() {
        if (!active) {
            active = true;
            blockedAccounts--;
            System.out.println("Account " + accountNumber + " has been activated.");
        }
    }

    public void resetDailyLimit() {
        dailyWithdrawalLimit = originalDailyLimit;
        System.out.println("Daily withdrawal limit has been reset.");
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountInfo() {
        return "Owner: " + ownerName +
                " | Account: " + accountNumber +
                " | Balance: " + balance +
                " | Remaining Daily Limit: " + dailyWithdrawalLimit +
                " | Active: " + active;
    }



    // Métodos estáticos

    public static Integer getTotalAccounts() {
        return totalAccounts;
    }

    public static Integer getTotalOperations() {
        return totalOperations;
    }

    public static Integer getBlockedAccounts() {
        return blockedAccounts;
    }
}

