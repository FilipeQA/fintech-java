package fintech;

public class Main {

    public static void main(String[] args) {

        Client client = new Client (
                "Filipe Amado",
                "12345678900",
                "filipe@email.com"
        );

        System.out.println("Name: " + client.getName());
        System.out.println("CPF: " + client.getCpf());
        System.out.println("E-mail: " + client.getEmail());
    }
}
