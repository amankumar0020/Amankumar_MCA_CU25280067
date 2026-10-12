public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is running.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
        Thread.sleep(200);
        System.out.println("State during sleep: " + t.getState());
        t.join();
        System.out.println("Final state: " + t.getState());
    }
}
