package fintech;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, Client client) {
        super(accountNumber, client);
    }

    @Override
    public double calculateFee() {
        return 2.00;
    }
}