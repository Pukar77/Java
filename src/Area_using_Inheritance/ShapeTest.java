package Area_using_Inheritance;

class Shape {
    double getArea() { return 0; }
}
class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double getArea()
    { return l * w; }
}
class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r; }
    double getArea()
    { return Math.PI * r * r; }
}
class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) {
        this.b = b;
        this.h = h; }
    double getArea()
    { return 0.5 * b * h; }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape rect = new Rectangle(14, 11);
        Shape circle = new Circle(3.7);
        Shape tri = new Triangle(7, 11);
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + tri.getArea());
    }}


