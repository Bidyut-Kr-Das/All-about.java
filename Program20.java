class B {
    Program20 obj;

    B(Program20 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);
    }
}

public class Program20 {
    int data = 10;

    Program20() {
        B obj = new B(this);
        obj.display();
    }

    public static void main(String[] args) {
        Program20 obj = new Program20();
    }
}
