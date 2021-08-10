package accounts;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void approveApplication(Customer customer) throws SQLException;

    void deleteCustomer(int id) throws SQLException;

    Customer getCustomerInfo(int acc_number) throws SQLException;

    List<Customer> getCustomers() throws SQLException;

    void updateCustomer(Customer customer) throws SQLException;

    Employee employeeLogin(int emp_number, String password) throws SQLException;
}
