package utilities;

import accounts.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeInterface {
    public static EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDAO();
    private static Scanner scanner = new Scanner(System.in);
    public static boolean running = true;
    public static List<Customer> customerList = new ArrayList<>();
    public static Customer customer = new Customer();


    public static void employeeMenu(Employee employee) throws SQLException {
        int option = 0;
        System.out.println("Select an action: ");

        while (running) {
            System.out.println("================================");
            System.out.println("1 - Check Application Requests |");
            System.out.println("2 - Remove Customer Account    |");
            System.out.println("3 - Find Customer Info         |");
            System.out.println("4 - Get List of Customers      |");
            System.out.println("5 - Update Customer Account    |");
            System.out.println("6 - Logout                     |");
            System.out.println("================================");
            option = scanner.nextInt();

            switch (option){
                case 1:{
                        employeeDAO.approveApplication(UserInterface.pendingCustomer);
//                    employeeDAO.approveApplication(employeeDAO.addPendingAccountsToList(UserInterface.sendApplication()));
                }
                break;
                case 2: {
                    System.out.println("Enter the ID of the customer you are deleting: ");
                    int id = scanner.nextInt();
                    employeeDAO.deleteCustomer(id);
                }
                break;
                case 3:{
                    System.out.println("Enter the customer's account number: ");
                    int accountNumber = scanner.nextInt();
                    customer = employeeDAO.getCustomerInfo(accountNumber);
                    System.out.println(customer);
                }
                break;
                case 4: {
                    customerList = employeeDAO.getCustomers();
                    System.out.println(customerList);
                }
                break;
                case 5: {
                    System.out.println("Enter the customer's ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter updated customer account number: ");
                    int accountNumber = scanner.nextInt();
                    employeeDAO.updateCustomer(id, accountNumber);
                }
                break;
                case 6: {
                    UserInterface.userInterfaceMenu();
                    running = false;
                }
                break;
            }
        }
        scanner.close();
    }
}