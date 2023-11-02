public class Program19 {

    void m(Program19 obj) {
        System.out.println("method is invoked");
    }

    void p() {
        m(this);
    }

    public static void main(String[] args) {
        Program19 obj = new Program19();
        obj.p();
    }
}