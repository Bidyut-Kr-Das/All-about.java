abstract class A {
    // abstract method to be implemented later in subclasses
    public abstract void print();
}

class B extends A {
    // implementation of the abstract method
    public void print() {
        String name = "ABCD";
        int age = 21;
        float salary = 222.50f;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

public class Program37 {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
    }
}
