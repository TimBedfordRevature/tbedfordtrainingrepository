package database.demo;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1: load the driver
        //Class.forName("jbdc:mysql://localhost:3306/revature");

        // Step 2: create connection object
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "TimBedford", "H@l0Infin1t2021");


        // Step 3: create statement object
        Statement statement = conn.createStatement();

        //statement.executeQuery("insert into employee (name, email) values ('name', 'n@mail.com')");
        // how to use java to input into database.
        String sql = "insert into employee (name, email) values (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "Kevin");
        ps.setString(2, "k@mail.com");
        ps.executeUpdate();

        // Step 4: execute query
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while (resultSet.next()) {
            System.out.println("Id: " + resultSet.getInt(1) + ", Name: " + resultSet.getString(2) + ", Email: "
                    + resultSet.getString(3));
        }

        ResultSet resultSet1 = statement.executeQuery("select * from product");
        while (resultSet1.next()) {
            System.out.println("Pid: " + resultSet1.getInt(1) + ", Name: " + resultSet1.getString(2) + ", manufacturer: "
                    + resultSet1.getString(3));
        }

        // Step 5: Close the connection
        conn.close();
    }
}

// create methods to each print out data for each table
