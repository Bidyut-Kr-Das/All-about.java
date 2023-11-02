class Employee {
    String name;
    String designation;
    String department;
    double salary;

    public Employee() {
        this.name = null;
        this.designation = null;
        this.department = null;
        this.salary = 0;
    }

    public Employee(String name, String dept, String designation, double salary) {
        this.name = name;
        this.department = dept;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(String name, String dept, String designation) {
        this.name = name;
        this.department = dept;
        this.designation = designation;
        if (designation == "management")
            this.salary = 100000;
        else if (designation == "clark")
            this.salary = 50000;
        else if (designation == "peon")
            this.salary = 25000;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("department: " + department);
        System.out.println("designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class Program28 {
    public static void main(String[] args) {
        Employee[] arr = { new Employee(), new Employee("abc", "CSE", "manager", 10100),
                new Employee("def", "CSE", "peon") };
        arr[0].display();
        arr[1].display();
        arr[2].display();
    }
}
