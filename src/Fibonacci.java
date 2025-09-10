
import java.util.Scanner;
class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {

        int n;
        System.out.println("Enter the index to find fiboancci series");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int result = fib(n);
        System.out.println("The fibonaci is "+ result);

    }
}