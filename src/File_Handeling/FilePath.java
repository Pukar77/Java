package File_Handeling;
import java.io.File;
public class FilePath {
    public static void main(String[] args) {
        String path = "D://Java_inteview//Java_practice//src/Pukar.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }  }}



