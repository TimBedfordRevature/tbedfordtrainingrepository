package utilities;

import accounts.*;

import java.util.Scanner;

public class EmployeeInterface {
    public static EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDAO();
    public static CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean running = true;


    public static void employeeMenu(Employee employee) {
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
                        // use multi thread, can use sleep() and notify
                }
                break;
            }
        }
    }
}