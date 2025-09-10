import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] arr1 = {12,23,34,45,56};

        int i;

        for(i=0;i<5;i++){
            System.out.println(arr1[i]);
        }


        System.out.println("Enter the number of element you want to insert");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter the list of array");

        for(i=0;i<n;i++){
           arr[i] = scanner.nextInt();
        }

        System.out.println("You entered");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }



    }


}
