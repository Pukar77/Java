package Calculator;

import java.util.Scanner;
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("\nChoose Operation:");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result = " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result = " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result = " + result);
                break;
            case 4:
                result = divide(num1, num2);
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }}



