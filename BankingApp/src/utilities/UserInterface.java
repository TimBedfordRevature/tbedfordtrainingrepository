package utilities;

import accounts.*;

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
    public static Scanner scanner = new Scanner(System.in);

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
            option = scanner.nextInt();

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
                        System.out.println("Welcome " + currentUser.getName() + "! Your account ID is: " + currentUser.getId());
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
                    if(currentEmployee.getId() == 0){
                        System.out.println("Invalid password/employee number. Please try again");
                    } else {
                        System.out.println("Welcome " + currentEmployee.getName() + "!");
                        EmployeeInterface.employeeMenu(currentEmployee);
                    }
                }
                case 4: {
                    System.out.println("Thank you for using BankApp");
                    running = false;
                }
                break;
            }
        }
    }

    public static void getAccountNumbers() throws SQLException {
        accNumberList = customerDAO.getAccountNumbers();
        // System.out.println(accNumberList);
    }

    public static void createAccount() throws SQLException {
        System.out.println("Enter your first name: ");
        String name = scanner.next();
        System.out.println("Enter your email: ");
        String email = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        int accountNumber = getRndNumber();
        Customer customer = new Customer(name, email, password, accountNumber, 0.00);
       employeeDAO.approveApplication(customer);
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
