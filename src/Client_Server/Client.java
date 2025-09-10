package Client_Server;

import java.net.Socket;
import java.io.*;
import java.util.Scanner;
public class Client {b
    public static void main(String[] args) {
        String host = "localhost"; // server IP
        int port = 5000;
        try (Socket socket = new Socket(host, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner sc = new Scanner(System.in)) {
            System.out.println("Connected to server at " + host + ":" + port);
            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = sc.nextLine();
                out.println(message); // send to server
                String response = in.readLine(); // read server response
                System.out.println("Server: " + response);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }  }
        } catch (IOException e) {
            e.printStackTrace();
        }    }}
