class DocumentTask extends Thread {
    DocumentTask(String name) { super(name); }
    public void run() {
        for (int page = 1; page <= 5; page++) {
            System.out.println(getName() + " printing page " + page);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
public class Q10 {
    public static void main(String[] args) {
        new DocumentTask("Document A").start();
        new DocumentTask("Document B").start();
    }
}
