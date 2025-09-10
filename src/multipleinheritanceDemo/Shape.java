package multipleinheritanceDemo;

interface Shape {
    double getArea();
}
class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length; this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base; this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }}



