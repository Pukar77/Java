package Inheritance;

class Lion{
    void eats(){
        System.out.println("Lion is eating");
    }
}

class Tiger extends Lion{
    void watching(){
        System.out.println("Tiger is watching");
    }
}

class Zebra extends  Lion{
    void running(){
        System.out.println("Zebra is running");
    }
}

public class Heirarchical_Inheritance {
    public static void main(String[] args) {
        Zebra z = new Zebra();
        z.running();
        z.eats();

        Tiger t = new Tiger();
        t.eats();
        t.watching();
    }
}
