class NameThread extends Thread {
    NameThread(String name) { super(name); }
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println(getName() + " : " + i);
    }
}
public class Q4 {
    public static void main(String[] args) {
        new NameThread("Thread A").start();
        new NameThread("Thread B").start();
    }
}
