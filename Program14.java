class Student {
    private int roll;
    private String name;
    private double fee;

    public Student(int roll, String name, double fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("fee: " + fee);
    }
}

public class Program14 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "ABC", 5000);
        Student s2 = new Student(121, "DEF", 6000);
        s1.display();
        s2.display();
    }
}
