// 5. Shape Calculator with Polymorphism:
// Create a class named Shape with an abstract method calculateArea().
// Create subclasses for Circle, Rectangle, and Triangle implementing the
// calculateArea() method.
// Create an array of Shape objects and calculate the total area of all shapes using polymorphism.

abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double calculateArea() {
        return width * height;
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double calculateArea() {
        return 0.5 * base * height;
    }
}
public class ex5 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 7)
        };
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("Total Area: " + totalArea);
    }
}
