
import java.util.Scanner;
class Prime_Number {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        boolean isprime = true;

        int i;

        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }


    }
}