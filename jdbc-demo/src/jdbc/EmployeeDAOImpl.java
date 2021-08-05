package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAO {

    private static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    Connection connection = null;

    public EmployeeDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employee (name, email) values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("employee saved");
        else
            System.out.println("Something went wrong");

    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update employee set name = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setInt(3, employee.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("employee updated");
        else
            System.out.println("Oops! something went wrong");

    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("employee delete");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        String query = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        List<Employee> employeeList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            employeeList.add(new Employee(id, name, email));
            // System.out.println("ID = " + id + ", Name = "  + name + ", Email = " + email);
        }
        return employeeList;
    }

    @Override
    public Employee employeeById(int id) throws SQLException {
        String query = "select * from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Employee employee = new Employee();

        while (resultSet.next()) {
            employee.setId(resultSet.getInt("id"));
            employee.setName(resultSet.getString("name"));
            employee.setEmail(resultSet.getString("email"));
        }

        return employee;
    }
}
