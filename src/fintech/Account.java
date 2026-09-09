package fintech;

public class Account {

    private int accountNumber;
    private double balance;
    private Client client;

    public Account(int accountNumber, Client client) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public double calculateFee() {
        return 0;
    }
}