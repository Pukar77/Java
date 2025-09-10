import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter you name");
        Scanner scanner = new Scanner(System.in);
       name =  scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
