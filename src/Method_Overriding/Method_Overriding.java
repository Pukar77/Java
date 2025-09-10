package Method_Overriding;

class Animal{
    void show(){
        System.out.println("This is Parent class method");
    }
}

class Dog extends Animal{
    @Override
    void show() {
        System.out.println("This is child class method");
    }
}

public class  Method_Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.show();

        Dog d = new Dog();
        d.show();

    }
}

