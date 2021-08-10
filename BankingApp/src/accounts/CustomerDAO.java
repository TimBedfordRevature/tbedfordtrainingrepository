package accounts;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    void addCustomer(Customer customer) throws SQLException;

//    void updateCustomer(Customer customer) throws SQLException;

//    void deleteCustomer(int id) throws SQLException; // customer can only delete their own accounts.

//    List<Customer> getCustomers(int acc_number) throws SQLException;

    List<Integer> getAccountNumbers() throws SQLException;

 //   Customer customerById(int id); // will be used by employee

    Customer customerLogin(int acc_number, String password) throws SQLException;

    Customer depositMoney(Customer customer, double amount) throws SQLException;

    Customer withdrawMoney(Customer customer, double amount) throws SQLException;

    void viewBalance(int accountNumber) throws SQLException;

    public double getBalance(int acc_number) throws SQLException;

}
