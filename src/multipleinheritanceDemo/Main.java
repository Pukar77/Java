package multipleinheritanceDemo;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(7, 8);
        Shape circle = new Circle(6.45);
        Shape triangle = new Triangle(5, 9);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());
    }}


