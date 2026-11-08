package id.ac.polinema;

public abstract class Account {
    private String accountNumber;
    private Customer owner;
    private double balance;

    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (!canWithdraw(amount)) {
            throw new InsufficientBalanceException(
                accountNumber + ": insufficient balance for a withdrawal of " + amount
            );
        }
        balance -= amount;
    }

    protected abstract boolean canWithdraw(double amount);

    public double monthlyFee() {
        return 0.0;
    }

    public void printInfo() {
        System.out.println(accountNumber + " - " + owner.getName()
                + " - balance: " + balance);
    }
}
