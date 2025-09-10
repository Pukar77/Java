package javadatabase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class jdbcConnection {
    public static String URL = "jdbc:mysql://localhost:3306/java_nccs";
    public static String USERNAME = "root";
    public static String PASSWORD = "root";

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // Statement statement = connection.createStatement();

        
        // statement.execute("insert into students(id,name,phone) values (1,'hari', '9866337295'),(2,'Ram','9763345654')");


        Statement statement = connection.prepareStatement("insert into students(id,name,phone) values (1,'hari', '9866337295'),(2,'Ram','9763345654')");

        
        statement.executeUpdate("insert into students(id,name,phone) values (1,'hari', '9866337295'),(2,'Ram','9763345654')");
    }
    
    
    
}
