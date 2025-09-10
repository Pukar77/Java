package Inheritance;

class Parent{
    void display() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("This is the child class");
    }
}

class Subchild extends Child{
    void see(){
        System.out.println("This is sub child class");
    }
}

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        Subchild sc = new Subchild();
        sc.display();
        sc.show();
        sc.see();
    }
}
