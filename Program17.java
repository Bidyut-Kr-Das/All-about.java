class A {
    A() {
        System.out.println("hello A");
    }

    A(int x) {
        this();
        System.out.println(x);
    }
}

public class Program17 {
    public static void main(String[] args) {
        A obj = new A(10);
    }
}
