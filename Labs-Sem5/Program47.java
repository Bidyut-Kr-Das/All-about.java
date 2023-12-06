class B implements Runnable {
    @Override
    public void run() {
        System.out.println("This code is running in a thread.");
    }
}

public class Program47 {
    public static void main(String[] args) {
        B obj = new B();
        Thread t = new Thread(obj);
        t.start();
        System.out.println("This code is outside the thread");
    }
}
