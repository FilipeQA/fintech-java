package fintech;

public class Main {

    public static void main(String[] args) {

        Client client = new Client (
                "Filipe Amado",
                "12345678900",
                "filipe@email.com"
        );

        Account account = new Account(1001, client);

        account.deposit(1000);
        account.withdraw(250);

        Account checkingAccount = new CheckingAccount(1002, client);
        Account savingsAccount = new SavingsAccount(1003, client);

        System.out.println("Checking fee: R$ " + checkingAccount.calculateFee());
        System.out.println("Savings fee: R$ " + savingsAccount.calculateFee());

        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Balance: R$ " + account.getBalance());

        System.out.println("Name: " + client.getName());
        System.out.println("CPF: " + client.getCpf());
        System.out.println("E-mail: " + client.getEmail());
    }
}
