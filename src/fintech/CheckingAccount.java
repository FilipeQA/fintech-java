package fintech;

public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber, Client client) {
        super(accountNumber, client);
    }

    @Override
    public double calculateFee() {
        return 10.00;
    }
}