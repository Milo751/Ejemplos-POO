package POO;

public class BankAccount {
    protected String ownerName;
    private String accountNumber;
    private double balance;
    public String bankName;

    public BankAccount(String ownerName, String accountNumber, double balance, String bankName) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    public double deposit (double amount) {
        return balance += amount;
    }

    public double withdraw (double amount) {
        if (balance >= amount) {
            return balance -= amount;
        }
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
