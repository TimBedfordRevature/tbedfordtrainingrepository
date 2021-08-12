package accounts;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    void addCustomer(Customer customer) throws SQLException;

    void updateCustomerInfo(String email, String password, int id) throws SQLException;

    List<Integer> getAccountNumbers() throws SQLException;

    Customer customerLogin(int acc_number, String password) throws SQLException;

    Customer depositMoney(Customer customer, double amount) throws SQLException;

    Customer withdrawMoney(Customer customer, double amount) throws SQLException;

    void viewBalance(int accountNumber) throws SQLException;

    public double getBalance(int acc_number) throws SQLException;

}
