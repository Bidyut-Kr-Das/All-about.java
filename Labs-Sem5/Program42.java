abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calcSalary();

    public abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calcSalary() {
        return baseSalary * bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager name: " + name);
        System.out.println("Base salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total salary: $" + calcSalary());
    }
}

class Programmer extends Employee {

    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcSalary() {
        return baseSalary + (overtimeHours * hourlyRate);
    }
    @Override
    public void displayInfo() {
        System.out.println("Manager name: " + name);
        System.out.println("Base salary: $" + baseSalary);
        System.out.println("overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total salary: $" + calcSalary());
    }
}

public class Program42 {
    public static void main(String[] args) {
        Employee manager = new Manager("Corona Cadogan", 6000, 1000);
        Employee programmer = new Programmer("Antal Nuka", 5000, 20, 25.0);
        manager.displayInfo();
        System.out.println("------------------------");
        programmer.displayInfo();
    }
}
