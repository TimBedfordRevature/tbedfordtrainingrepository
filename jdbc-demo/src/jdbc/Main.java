package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static boolean running = true;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
        int option = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your option number: ");

        while (running) {
            System.out.println("**************************************");
            System.out.println("Select from the options below");
            System.out.println("**************************************");
            System.out.println("1 - Add Employee");
            System.out.println("2 - Update Employee");
            System.out.println("3 - Delete Employee");
            System.out.println("4 - List Employees");
            System.out.println("5 - Read Employee");
            System.out.println("6 - Exit");
            System.out.println("**************************************");
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee();
                    employee.setName(name);
                    employee.setEmail(email);
                    dao.addEmployee(employee);
                }
                break;
                case 2: {
                    System.out.println("Enter the ID of the employee you want to update: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter New Name: ");
                    String name = scanner.next();
                    System.out.println("Enter New Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee();
                    employee.setId(id);
                    employee.setName(name);
                    employee.setEmail(email);
                    dao.updateEmployee(employee);
                }
                break;
                case 3: {
                    System.out.println("Input ID of employee you want to delete: ");
                    int id = scanner.nextInt();
                    dao.deleteEmployee(id);
                }
                break;
                case 4: {
                    System.out.println(dao.getEmployees());
                }
                break;
                case 5: {
                    System.out.println("Enter employee id: ");
                    int id = scanner.nextInt();
                    System.out.println(dao.employeeById(id));
                }
                break;
                case 6: {
                    running = false;
                }
                break;
            }
        }


        // write data you want to insert
//        Employee employee = new Employee();
//        employee.setName("Stacy");
//        employee.setEmail("s@mail.com");

        // Employee DAO
//        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
//        dao.addEmployee(employee);
//
//        System.out.println(dao.getEmployees());

        // Step 1: load the driver
        //Class.forName("jdbc:mysql://localhost:3306/revature");

        // Step 2: create connection object
//        String host = "jdbc:mysql://localhost:3306/";
//        String database = "revature";
//        String connectionString = host + database;
//        String username = "TimBedford";
//        String password = "H@l0Infin1t2021";
//
//        Connection conn = DriverManager.getConnection(connectionString, username, password);
//
//        // Step 3: create statement object
//        Statement statement = conn.createStatement();

        // Step 4: execute Queries

        // Demo 1: create a table
//        String query = "create table employee (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email CHAR(50))";
//        statement.executeUpdate(query);
//        System.out.println("table created successfully");

//        // Demo 2: Insert data into our table
//        String query = "insert into employee (name, email) values ('Tim', 't@mail.com')";
//        statement.executeUpdate(query);
//        System.out.println("row created successfully");

        // Demo 3: Update data of our table
//        String query = "update employee set name = ?, email = ? where id = ?";
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setString(1, "Nick");
//        preparedStatement.setString(2, "n@mail.com");
//        preparedStatement.setInt(3,1);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("("+rowAffected+") rows affected");

        // Demo 4: Delete data from our table
//        String query = "delete from employee where id = ?";
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setInt(1,1);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("("+rowAffected+") rows affected");
//        int rowAffected = 1;
//        System.out.println(String.format("(%d) rows affected",rowAffected));

        // Demo 5: print data from our table
//        String query = "select * from employee";
//        ResultSet resultSet = statement.executeQuery(query);
//
//        while (resultSet.next()) {
//           int id =  resultSet.getInt(1);
//           String name = resultSet.getString(2);
//           String email =  resultSet.getString(3);
//
//            System.out.println("ID = " + id + ", Name = "  + name + ", Email = " + email);
//        }

//        String name = "Sam";
//        int age = 10;
//        String output = String.format("%s is %d years old", name, age);
//        System.out.println(output);

        // Personal Practice 1: use scanner to directly input a query
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter your query:\nEnter 'exit' to stop");
//
//            String query = scanner.nextLine();
//            if(scanner.equals("exit")) {
//                break;
//            } else {
//                statement.executeUpdate(query);
//                System.out.println("query successful");
//            }
//        }

        // Personal Practice 2: user scanner with Preparedstatement to input a query
//        String query = "insert into employee (name, email) values (?, ?)";
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String value1 = scan.nextLine();
//        System.out.println("Enter email: ");
//        String value2 = scan.nextLine();
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setString(1, value1);
//        preparedStatement.setString(2, value2);
//        preparedStatement.executeUpdate();
//        System.out.println("Query successful");


        // Step 5: close connection
        //  conn.close();
//        if (conn.isClosed()) {
//            System.out.println("connection closed");
//        } else {
//            System.out.println("connection is open");
//        }
    }
}
