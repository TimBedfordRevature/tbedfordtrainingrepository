package utilities;

import accounts.*;
import banking.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static boolean running = true;

    public static List<Integer> accNumberList = new ArrayList<>();
    public static Functions functions = new Functions();
    private static Customer currentUser = new Customer();
    private static Employee currentEmployee = new Employee();
    public static CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
    public static EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDAO();
    private static Scanner scanner = new Scanner(System.in);
    public static List<Customer> pendingCustomer = new ArrayList<>();

    public static void userInterfaceMenu() throws SQLException {
        int option = 0;
        System.out.println("Enter option number: ");

        while (running) {
            System.out.println("================================");
            System.out.println("1 - Apply for account");
            System.out.println("2 - Customer login");
            System.out.println("3 - Employee login");
            System.out.println("4 - Exit app");
            System.out.println("================================");
            try {
                option = scanner.nextInt();
            }catch (Exception e){
                System.out.println("ERROR: Must enter a number");
                break;
            }

            switch (option) {
                case 1: {
                    createAccount();
                }
                break;
                case 2: {
                    int accountNumber = 000000;
                    System.out.println("Enter your account number: ");
                    try {
                        accountNumber = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid: Must enter a 6-digit number");
                    }
                    System.out.println("Enter your password: ");
                    String password = scanner.next();
                    currentUser = customerDAO.customerLogin(accountNumber, password);
                    if (currentUser.getId() == 0) {
                        System.out.println("Invalid password/account number. Please try again");
                    } else {
                        System.out.println("Welcome " + currentUser.getName() + "! Your account ID is: " + currentUser.getId() + "\nYour account number is: " + currentUser.getAcc_number());
                        CustomerInterface.CustomerMenu(currentUser);
                    }
                }
                break;
                case 3: {
                    System.out.println("Enter your employee number: ");
                    int empNumber = scanner.nextInt();
                    System.out.println("Enter your password: ");
                    String password = scanner.next();
                    currentEmployee = employeeDAO.employeeLogin(empNumber, password);
                    if (currentEmployee.getId() == 0) {
                        System.out.println("Invalid password/employee number. Please try again");
                    } else {
                        System.out.println("Welcome " + currentEmployee.getName() + "!");
                        EmployeeInterface.employeeMenu(currentEmployee);
                    }
                }
                case 4: {
                    running = false;
                }
                break;
                default: {
                }
                break;
            }
        }
        scanner.close();
    }

    public static void getAccountNumbers() throws SQLException {
        accNumberList = customerDAO.getAccountNumbers();
    }

    public static void createAccount() throws SQLException {
        System.out.println("Enter your first name: ");
        String name = scanner.next();
        System.out.println("Enter your email: ");
        String email = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        int accountNumber = getRndNumber();
        Customer newCustomer = new Customer(name, email, password, accountNumber, 0.00);
        System.out.println("Please wait while your request is processed");
        pendingCustomer.add(newCustomer);
    }

    public static int getRndNumber() throws SQLException {
        getAccountNumbers();
        int number = functions.generateAccountNumber();
        for (int list : accNumberList) {
            while (number == list) {
                number = functions.generateAccountNumber();
            }
        }
        accNumberList.add(number);
        return number;
    }
}
