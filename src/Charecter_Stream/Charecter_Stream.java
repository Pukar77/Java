package Charecter_Stream;
import java.io.*;

public class Charecter_Stream {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\Java_inteview\\Java_practice\\src\\Charecter_Stream/input.txt");
            FileWriter writer = new FileWriter("D:\\Java_inteview\\Java_practice\\src\\Charecter_Stream/output.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
