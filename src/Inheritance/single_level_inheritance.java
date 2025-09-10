package Inheritance;
class Animal{
    void show(){
        System.out.println("This is base class");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("This is child class");
    }
}
public class single_level_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.show();
    }
}
