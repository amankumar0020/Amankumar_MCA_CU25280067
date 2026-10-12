abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a, b, c, height;

    Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * b * height;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeAbstractMain {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5, 3);
        System.out.printf("Circle area: %.2f%n", circle.calculateArea());
        System.out.printf("Circle perimeter: %.2f%n", circle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}
