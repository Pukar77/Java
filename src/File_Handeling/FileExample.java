package File_Handeling;
import java.io.*;
import java.util.Scanner;
public class FileExample {
    public static void main(String[] args) {
        try {
            String path = "D://Java_inteview//Java_practice//src/Pukar.txt";
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to write into the file: ");
            String content = sc.nextLine();
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
            System.out.println("\nReading file content:");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

