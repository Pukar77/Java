package File_Handeling;

import java.io.File;
public class FileProperties {
    public static void main(String[] args) {
        String path = "D://Java_inteview//Java_practice//src/Pukar.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
        } else {
            System.out.println("File does not exist!");
        }
    }
}

