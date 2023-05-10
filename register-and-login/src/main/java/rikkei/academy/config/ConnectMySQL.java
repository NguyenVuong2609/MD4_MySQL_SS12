package rikkei.academy.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/form_login_vuong";
    private static final String USER = "root";
    private static final String PASS = "Cuti26091993";
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Connect Successful");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connect Failed");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
