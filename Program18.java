class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        this.m();
    }
}

public class Program18 {
    public static void main(String[] args) {
        A obj = new A();
        obj.n();
    }
}
