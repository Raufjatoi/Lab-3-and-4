// 2. Shape Hierarchy:
// Create a class named Shape with a method to calculate area (abstract).
// Create subclasses for Circle, Rectangle, and Triangle inheriting from Shape.
// Implement the calculateArea() method in each subclass accordingly.
// Create an array of Shape objects and calculate the total area of all shapes.
abstract class  Shape {
    abstract double calculate_area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override 
    double calculate_area(){
        return Math.PI * radius * radius;
    }
} 
class Rectangle extends Shape{
    double with;
    double hight;
    Rectangle(double with , double hight){
        this.with = with;
        this.hight = hight;
    }
    @Override
    double calculate_area(){
        return with * hight;
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base , double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double calculate_area(){
        return 0.5 * base * height;
    }
}

public class ex2 {
    public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(2);
    shapes[1] = new Rectangle(3, 4);
    shapes[2] = new Triangle(3, 4);
    
    int total_area = 0;
    for (Shape shape : shapes ){
        total_area += shape.calculate_area() ;
    }
    System.out.println("total area of all shapes is " + total_area);
    }
}
