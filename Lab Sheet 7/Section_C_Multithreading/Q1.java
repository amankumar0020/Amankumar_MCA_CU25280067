class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Hello from thread: " + i);
    }
}
public class Q1 {
    public static void main(String[] args) { new MyThread().start(); }
}
