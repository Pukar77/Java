// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Reverse_Number {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;

        while(number!=0){
            int lastdigit = number % 10;
            reverse = reverse*10 + lastdigit;
            number /= 10;
        }

        System.out.println(reverse);


    }
}