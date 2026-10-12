import testpack.PublicClass;
public class Main {
    public static void main(String[] args) {
        new PublicClass().display();
        // DefaultClass cannot be accessed directly outside package testpack.
    }
}
