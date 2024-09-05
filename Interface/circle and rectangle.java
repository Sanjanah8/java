interface Shape {
    void draw();
    double area();
}
class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Implement the interface in a class for Rectangle
class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class Helloo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.area());

        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
