package accounts;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void approveApplication(List<Customer> customerList) throws SQLException;

    void deleteCustomer(int id) throws SQLException;

    Customer getCustomerInfo(int acc_number) throws SQLException;

    List<Customer> getCustomers() throws SQLException;

    void updateCustomer(int id, int acc_number) throws SQLException;

    Employee employeeLogin(int emp_number, String password) throws SQLException;
}
