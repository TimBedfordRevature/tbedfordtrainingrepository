package accounts;

import utilities.ConnectionFactory;
import utilities.Functions;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    Connection connection = null;

    public EmployeeDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void approveApplication(Customer customer) throws SQLException {
        Functions.approveAccount(customer);
    }

    @Override
    public void deleteCustomer(int id) throws SQLException {
        String query = "delete from customer where id = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("account deleted");
        else
            System.out.println("ERROR: something went wrong...");
    }

    @Override
    public Customer getCustomerInfo(int acc_number) throws SQLException {
        String query = "select * from customer where acc_number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, acc_number);
        resultSet = preparedStatement.executeQuery();

       Customer customer = new Customer();
        while (resultSet.next()) {
            customer.setId(resultSet.getInt(1));
            customer.setName(resultSet.getString(2));
            customer.setEmail(resultSet.getString(3));
            customer.setPassword(resultSet.getString(4));
            customer.setAcc_number(resultSet.getInt(5));
            customer.setBalance(resultSet.getDouble(6));
        }
        return customer;
    }

    @Override
    public List<Customer> getCustomers() throws SQLException {
        String query = "select * from customer";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);

        List<Customer> accounts = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            String password = resultSet.getString(4);
            int accNumber = resultSet.getInt(5);
            double balance = resultSet.getDouble(6);
            accounts.add(new Customer(id, name, email, password, accNumber, balance));
        }
        return accounts;
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        String query = "update customer set name = ?, email = ? password = ? where id = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getPassword());
        preparedStatement.setInt(4, customer.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("account updated");
        else
            System.out.println("ERROR: something went wrong...");
    }

    @Override
    public Employee employeeLogin( int emp_number, String password) throws SQLException {
        String query = "select * from employee where emp_number = ? AND password = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, emp_number);
        preparedStatement.setString(2, password);
        resultSet = preparedStatement.executeQuery();

        Employee employee = new Employee();
        while (resultSet.next()) {
            employee.setId(resultSet.getInt("emp_id"));
            employee.setName(resultSet.getString("name"));
            employee.setPassword(resultSet.getString("password"));
            employee.setEmp_number(resultSet.getInt("emp_number"));
        }
        return employee;
    }

}
