package model;

public class Customer extends User {

    private BankAccount account;

    public Customer(
            Long id,
            String username,
            BankAccount account) {

        super(id, username);
        this.account = account;
    }

    @Override
    public void login() {
        System.out.println("Customer login");
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}