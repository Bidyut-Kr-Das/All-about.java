class myThread1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Currently running Thread 1");
            i++;
        }
    }
}

class myThread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Currently running Thread 2");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        myThread1 thread1 = new myThread1();
        Thread t1 = new Thread(thread1);
        t1.start();
        myThread2 thread2 = new myThread2();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
