abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("withdrawl of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. withdrawl failed.");
        }

    }

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("withdrawl of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. withdrawl failed.");
        }
    }
}

public class Program43 {
    public static void main(String[] args) {
        double initialBalance, depositAmount, withdrawlAmount;
        initialBalance = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount("SA001", initialBalance);
        System.out.println("Savings A/c: Initial balance: $" + initialBalance);
        depositAmount = 500.00;
        savingsAccount.deposit(depositAmount);
        withdrawlAmount = 250.00;
        savingsAccount.withdraw(withdrawlAmount);
        withdrawlAmount = 1600.00;
        System.out.println("Try to withdraw: $" + withdrawlAmount);
        savingsAccount.withdraw(withdrawlAmount);
    }
}
