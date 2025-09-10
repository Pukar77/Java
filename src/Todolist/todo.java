import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TaskManager {
    static int choice;
    static String[] tasks = new String[100]; // Array to store tasks
    static int taskCount = 0; // Variable to keep track of the number of tasks

    // Database connection parameters
    static final String DB_URL = "jdbc:mysql://localhost:3306/try";
    static final String USER = "root";
    static final String PASS = "root";

    // Method to create the tasks table if it doesn't exist
    static void createTasksTable() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = connection.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS tasks (id INT AUTO_INCREMENT PRIMARY KEY, task_description VARCHAR(255))";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to clear the tasks table
    static void clearTasksTable() {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = connection.createStatement()) {
            String sql = "DELETE FROM tasks";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Load the MySQL JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
            return;
        }

        // Create the tasks table if it doesn't exist
        createTasksTable();

        // Clear the tasks table
        clearTasksTable();

        Scanner scanner = new Scanner(System.in);
        input(scanner);
    }

    static void input(Scanner scanner) {
        while (true) {
            System.out.println("Enter 1 to add a new task");
            System.out.println("Enter 2 to remove a task");
            System.out.println("Enter 3 to display tasks");
            System.out.println("Enter 4 to exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (taskCount < tasks.length) {
                        System.out.println("Enter the task to be assigned:");
                        String newTask = scanner.nextLine();
                        tasks[taskCount] = newTask;
                        taskCount++;
                        System.out.println("Task added successfully!");

                        // Add the task to the database
                        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
                            String sql = "INSERT INTO tasks (task_description) VALUES (?)";
                            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                                statement.setString(1, newTask);
                                statement.executeUpdate();
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Task limit reached. Cannot add more tasks.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the task index to be removed:");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < taskCount) {
                        String taskToRemove = tasks[indexToRemove];
                        for (int i = indexToRemove; i < taskCount - 1; i++) {
                            tasks[i] = tasks[i + 1];
                        }
                        taskCount--;
                        System.out.println("Task removed successfully!");

                        // Remove the task from the database
                        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
                            String sql = "DELETE FROM tasks WHERE task_description = ?";
                            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                                statement.setString(1, taskToRemove);
                                statement.executeUpdate();
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Invalid task index!");
                    }
                    scanner.nextLine(); // Consume newline
                    break;

                case 3:
                    System.out.println("Displaying tasks:");
                    if (taskCount == 0) {
                        System.out.println("No tasks added yet.");
                    } else {
                        for (int i = 0; i < taskCount; i++) {
                            System.out.println((i + 1) + ". " + tasks[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the task manager. Goodbye!");
                    return; // Exit the method (and program)

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
