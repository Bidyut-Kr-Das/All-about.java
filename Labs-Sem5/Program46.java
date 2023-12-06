class A extends Thread {
    @Override
    public void run() {
        System.out.println("This code is running in the thread");
    }
}

public class Program46 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        System.out.println("This is outside the thread");
    }
}
