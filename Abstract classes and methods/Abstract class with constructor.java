abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5);
        System.out.println(circle.name + " Area: " + circle.area());
        System.out.println(circle.name + " Perimeter: " + circle.perimeter());

        Shape rectangle = new Rectangle("Rectangle", 4, 7);
        System.out.println(rectangle.name + " Area: " + rectangle.area());
        System.out.println(rectangle.name + " Perimeter: " + rectangle.perimeter());
    }
}
