package Method_Overloading;

public class Method_Overloading {
    int add(int a, int b){
        return  a+b;
    }

    double add(double a, double b){
        return  a+b;
    }

    int add(int a, int b, int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        Method_Overloading mo = new Method_Overloading();
        System.out.println("The sum of 2 and 3 is "+mo.add(2,3));
        System.out.println("The sum of 2.1 and 3.2 is "+ mo.add(2.1, 3.2));
        System.out.println("The sum of 1,2 and 3 is "+ mo.add(1,2,3));
    }



}
