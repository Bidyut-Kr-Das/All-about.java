class Person {
    public void message() {
        System.out.println("This is person class");
    }
}

class Student extends Person {
    public void message() {
        System.out.println("This is student class");
    }

    public void display() {
        message();
        super.message();
    }
}

public class Program33 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
