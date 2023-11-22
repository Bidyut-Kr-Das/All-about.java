class Person {
    public Person() {
        System.out.println("person class constructor.");
    }
}

class Student extends Person {
    public Student() {
        super();
        System.out.println("Student class constructor.");
    }
}

public class Program34 {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
