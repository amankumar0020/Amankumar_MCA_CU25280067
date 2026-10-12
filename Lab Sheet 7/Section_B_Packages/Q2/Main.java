import shapes.Circle;
import shapes.Rectangle;
public class Main {
    public static void main(String[] args) {
        System.out.println("Circle area = " + new Circle().area(5));
        System.out.println("Rectangle area = " + new Rectangle().area(4, 6));
    }
}
