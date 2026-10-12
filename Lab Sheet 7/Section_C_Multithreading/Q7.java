class FirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("First thread: " + i);
    }
}
class SecondThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Second thread: " + i);
    }
}
public class Q7 {
    public static void main(String[] args) throws InterruptedException {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Both threads completed.");
    }
}
