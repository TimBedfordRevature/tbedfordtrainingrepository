package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection connection = null;

    private ConnectionFactory() {};

    public static Connection getConnection() throws SQLException { // static because we don't have to create the object of the class
        if (connection == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("config/dbConfig");
            String url = bundle.getString("url");
            String username = bundle.getString("username");
            String password = bundle.getString("password");
            connection = DriverManager.getConnection(url, username, password);
        }

        return connection;
    }
}
