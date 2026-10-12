import demo.AccessDemo;
public class Main {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Public = " + obj.a);
        // b, c and d are not accessible from this unrelated class in another package.
    }
}
