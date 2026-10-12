class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    @Override
    void area() {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

class Circle extends Shape {
    double radius = 7;

    @Override
    void area() {
        System.out.println("Circle Area = " + (Math.PI * radius * radius));
    }
}

public class Q14 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.area();
        c.area();
    }
}
