class SleepTask extends Thread {
    public void run() {
        try {
            System.out.println("Sleeping thread started.");
            Thread.sleep(2000);
            System.out.println("Sleeping thread resumed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class ContinueTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Other thread: " + i);
    }
}
public class Q6 {
    public static void main(String[] args) {
        new SleepTask().start();
        new ContinueTask().start();
    }
}
