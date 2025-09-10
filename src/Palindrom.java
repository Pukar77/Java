

import java.util.Scanner;
class Palindrom{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int original = number;
        int reversed=0;

        while(number!=0){
            int lastdigit = number % 10;
            reversed = reversed*10+lastdigit;
            number /= 10;
        }

        if(original == reversed){
            System.out.println("The number is palindrom");
        }else{
            System.out.println("The number is not palindrom");
        }

    }
}