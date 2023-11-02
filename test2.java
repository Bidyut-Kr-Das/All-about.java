import java.io.IOException;

class Base {
    public Base() {
        System.out.println("This is base class constructor");
    }

    Base(int a) {
        System.out.println("This is parameterised constructor which is overloaded");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("This is derived class constructor");
    }

    Derived(int a) {
        super(a);
        System.out.println("Derived parameterised");
    }
}

class Derived2 extends Derived {
    Derived2() {
        System.out.println("Derived2  default constructor");
    }

    Derived2(int a) {
        super(a);
        System.out.println("Derived2 parameterised");
    }
}

public class test2 {
    public static void main(String[] args) throws IOException {

        // Derived2 d = new Derived2(2);
        // System.out.println();
        String name = System.out.getClass().getName();
        System.out.println(name);

    }

}
