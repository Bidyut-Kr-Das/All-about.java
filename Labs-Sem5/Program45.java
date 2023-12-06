interface Printable {
    public void print();
}

interface Showable {
    public void show();
}

public class Program45 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Program45 obj = new Program45();
        obj.print();
        obj.show();
    }
}
