class Person {
    private String name;
    private int birthYear;

    public Person(String n, int byear) {
        this.name = n;
        this.birthYear = byear;
    }

    public String toString() {
        return "Person[name = " + name + ", birthYear = " + birthYear + "]";
    }
}

class Instructor extends Person {
    private double salary;

    public Instructor(String n, int byear, double s) {
        super(n, byear);
        salary = s;
    }

    @Override
    public String toString() {
        return "Employee[super = " + super.toString() + ",salary=" + salary + "]";
    }
}

class Student extends Person {
    private String major;

    public Student(String n, int byear, String m) {
        super(n, byear);
        major = m;
    }

    @Override
    public String toString() {
        return "Student[super = " + super.toString() + ",major = " + major + "]";
    }
}

public class Program38 {
    public static void main(String[] args) {
        Person a = new Person("Anil", 1992);
        Student b = new Student("jimmy", 1919, "Information Technology");
        Instructor c = new Instructor("Mike", 1998, 95000);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
