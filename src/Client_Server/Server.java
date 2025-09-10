package Client_Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class Server {
    public static void main(String[] args) {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port + ". Waiting for client...");
            Socket clientSocket = serverSocket.accept(); // accept client connection
            System.out.println("Client connected: " + clientSocket.getInetAddress());
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client says: " + message);
                if (message.equalsIgnoreCase("bye")) {
                    out.println("Goodbye!");
                    break;
                }
                out.println("Server received: " + message);
            }
            in.close();
            out.close();
            clientSocket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }    }}

