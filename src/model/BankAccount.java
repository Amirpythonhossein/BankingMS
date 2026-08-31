package model;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative"
            );
        }

        this.balance = initialBalance;
    }

    public void deposit(double amount) {

        validateAmount(amount);

        balance += amount;
    }

    public void withdraw(double amount) {

        validateAmount(amount);

        if (balance < amount) {
            throw new IllegalStateException(
                    "Insufficient balance"
            );
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    private void validateAmount(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive"
            );
        }
    }
}