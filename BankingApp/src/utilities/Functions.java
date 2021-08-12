package utilities;

import accounts.Customer;
import accounts.CustomerDAO;
import accounts.CustomerDAOFactory;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Functions {

    public static Scanner scanner = new Scanner(System.in);
    public static CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();

    public static int generateAccountNumber() {
        int number = new Random().nextInt(900000) + 100000;
        return number;
    }

    public static void approveAccount(Customer customer) throws SQLException {
        System.out.println("Approve Customer Account: Y/N");
        String approval = scanner.next();
        approval.toLowerCase();

        if(approval.equals("y") || approval.equals("yes")) {
            customerDAO.addCustomer(customer);
            System.out.println("Application Approved");
        }else {
            System.out.println("Application denied");
        }
    }
}
