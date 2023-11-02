class BankingSystem {
    private double amount;
    private String name;
    private int acc_no;

    public void insert(int a, String n, double amount) {
        this.acc_no = a;
        this.name = n;
        this.amount = amount;

    }

    public void deposite(double dAmount) {
        amount += dAmount;

    }

    public void withdraw(double wAmount) {
        if (wAmount > amount)
            System.out.println("Insufficient Balance");
        else
            amount -= wAmount;
    }

    public void checkBalance() {
        System.out.println("THe balance is: " + amount);
    }

    public void showDetails() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Name: " + name);
    }

}

public class Program13 {
    public static void main(String[] args) {
        BankingSystem user1 = new BankingSystem();
        user1.insert(512101, "ABCD", 1000);
        user1.showDetails();
        user1.deposite(4000);
        user1.checkBalance();
        System.out.println("Withdrawing 6000");
        user1.withdraw(6000);
        System.out.println("Withdrawing 3000");
        user1.withdraw(3000);
        user1.checkBalance();
    }
}
