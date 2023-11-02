/*Either File name must be Program30.java 
            //or
change the public class name to your file name */
class Account {
    private String accoutnHolder;
    private String address;
    private String accountType;
    private int accountNumber;
    private double balance;

    // constructor 1
    public Account(String accountHolder, int accountNumber, double balance) {
        this.accoutnHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // constructor 2
    public Account(String accountHolder, int accountNumber, double balance, String address, String accountType) {
        this(accountHolder, accountNumber, balance);
        this.address = address;
        this.accountType = accountType;
    }

    // deposit method
    public void deposit(double money) {
        this.balance += money;
    }

    // withdraw method
    public void withdraw(double money) {
        if (balance < money)
            System.out.println("Low balance");
        else {
            balance -= money;
            System.out.println("withdraw successfull");
        }

    }

    public void getBalance() {
        System.out.println("Balance is: " + this.balance);
    }
}

public class Program30 {
    public static void main(String[] args) {
        Account a1 = new Account("Kingshuk", 1048, 60000);
        Account a2 = new Account("Aashish", 1053, 100000, "Rishra", "Savings");

        a1.deposit(40);
        a1.getBalance();
        a2.deposit(40);
        a2.getBalance();
    }
}
