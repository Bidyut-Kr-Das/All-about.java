class Member {
    String name, address, ph;
    int age, salary;
    public static final String ins_name = "My organisation";

    public Member(String name, String address, int age, String ph, int salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.ph = ph;
        this.salary = salary;
    }

    public void display1() {
        System.out.println("from member class name = " + name);
        System.out.println("from member class address = " + address);
        System.out.println("from member class age = " + age);
        System.out.println("from member class salary: " + salary);
        System.out.println("The name of institute name = " + ins_name);
    }
}

class Employee extends Member {
    String spl;

    public Employee(String name, String address, int age, String ph, int salary, String spl) {
        super(name, address, age, ph, salary);
        this.spl = spl;
    }

    @Override
    public void display1() {
        super.display1();
        System.out.println("Specialization inside Employee class is" + spl);
    }
}

class Manager extends Member {
    String dept;

    public Manager(String name, String address, int age, String ph, int salary, String dept) {
        super(name, address, age, ph, salary);
        this.dept = dept;
    }

    @Override
    public void display1() {
        super.display1();
        System.out.println("Inside manager class department is " + dept);
    }
}

public class Program40 {
    public static void main(String[] args) {
        Employee[] e = new Employee[2];
        e[0] = new Employee("Asa", "garia", 22, "894512", 50000, "AI");
        e[1] = new Employee("Mina", "Saltlake", 23, "215487", 60000, "Block Chain");
        e[0].display1();
        e[1].display1();

        Manager m = new Manager("Megha", "Jadavpur", 27, "9845123", 70000, "MCA");
        m.display1();
    }
}
