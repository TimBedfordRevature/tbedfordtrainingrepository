package accounts;

import utilities.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    private static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    Connection connection = null;

    public CustomerDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        String query = "insert into customer (name, email, password, acc_number, balance) values (?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getPassword());
        preparedStatement.setInt(4, customer.getAcc_number());
        preparedStatement.setDouble(5, customer.getBalance());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Account added");
        else
            System.out.println("ERROR: Something went wrong");
    }

    @Override
    public void updateCustomerInfo(String email, String password, int id) throws SQLException {
        String query = "update customer set email = ?, password = ? where id = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,email);
        preparedStatement.setString(2, password);
        preparedStatement.setInt(3, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("account updated" + "\nEmail: " + email + "\nPassword: " + password);
        else
            System.out.println("ERROR: something went wrong...");
    }

    @Override
    public List<Integer> getAccountNumbers() throws SQLException {
        String query = "select acc_number from customer";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);

        List<Integer> accNumbers = new ArrayList<>();

        while (resultSet.next()) {
            int acc_number = resultSet.getInt(1);
            accNumbers.add(acc_number);
        }
        return accNumbers;
    }

    @Override
    public Customer customerLogin(int acc_number, String password) throws SQLException {
        String query = "select * from customer where acc_number = ? AND password = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, acc_number);
        preparedStatement.setString(2, password);
        resultSet = preparedStatement.executeQuery();

        Customer customer = new Customer();
        while (resultSet.next()) {
            customer.setId(resultSet.getInt("id"));
            customer.setName(resultSet.getString("name"));
            customer.setEmail(resultSet.getString("email"));
            customer.setPassword(resultSet.getString("password"));
            customer.setAcc_number(resultSet.getInt("acc_number"));
            customer.setBalance(resultSet.getInt("balance"));
        }
        return customer;
    }

    @Override
    public Customer depositMoney(Customer customer, double amount) throws SQLException {
        String query = "update customer set balance = balance +? where acc_number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDouble(1, amount);
        preparedStatement.setInt(2, customer.getAcc_number());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("$" + amount + " deposited");
        else
            System.out.println("ERROR: something went wrong...");
        return customer;
    }

    @Override
    public Customer withdrawMoney(Customer customer, double amount) throws SQLException {
        String query = "update customer set balance = balance -? where acc_number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDouble(1, amount);
        preparedStatement.setInt(2, customer.getAcc_number());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("$" + amount + " withdrawn ");
        else
            System.out.println("ERROR: something went wrong...");
        return customer;
    }

    @Override
    public void viewBalance(int acc_number) throws SQLException {
        String query = "select * from customer where acc_number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, acc_number);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            double balance = resultSet.getDouble(6);
            System.out.println("Your account balance is: $" + balance);
        }
    }

    @Override
    public double getBalance(int acc_number) throws SQLException {
        String query = "select * from customer where acc_number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, acc_number);
        resultSet = preparedStatement.executeQuery();
        double balance = 0.0;
        if (resultSet.next()) {
            balance = resultSet.getDouble(6);
        }
        return balance;
    }
}