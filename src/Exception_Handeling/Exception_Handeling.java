package Exception_Handeling;


import java.util.Scanner;

public class Exception_Handeling {
static void checkAge(int age)throws ArithmeticException{
    if(age<18){
        throw new ArithmeticException("Your age is less than 18, you cannot vote");
    }else{
        System.out.println("Access granted");
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            checkAge(age);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This block always gets executed");
        }



    }
}
