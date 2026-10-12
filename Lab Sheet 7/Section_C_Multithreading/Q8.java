class Counter {
    int count = 0;
    void increment() { count++; }
}
public class Q8 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) c.increment();
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Expected count = 200000");
        System.out.println("Actual count = " + c.count);
    }
}
