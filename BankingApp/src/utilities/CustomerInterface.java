package utilities;

import accounts.Customer;
import accounts.CustomerDAO;
import accounts.CustomerDAOFactory;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerInterface {
    public static CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
    private static Scanner scanner = new Scanner(System.in);
    public static boolean running = true;

    public static void CustomerMenu(Customer customer) throws SQLException {
        int option = 0;
        System.out.println("Select an action: ");

        while (running) {
            System.out.println("================================");
            System.out.println("1 - Deposit money              |");
            System.out.println("2 - Withdraw money             |");
            System.out.println("3 - View balance               |");
            System.out.println("4 - Update info                |");
            System.out.println("5 - Logout                     |");
            System.out.println("================================");
            try {
                option = scanner.nextInt();
            }catch (Exception e){
                System.out.println("ERROR: Must enter a number");
                break;
            }

            switch (option){
                case 1: {
                    System.out.println("Enter the amount you want to deposit: ");
                    double amount = scanner.nextDouble();
                    customer = customerDAO.depositMoney(customer, amount);
                    customerDAO.viewBalance(customer.getAcc_number());
                }
                break;
                case 2: {
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amount = scanner.nextDouble();
                    double balance = customerDAO.getBalance(customer.getAcc_number());
                    if (amount > balance){
                        System.out.println("ERROR: Insufficient funds");
                    }else {
                        customer = customerDAO.withdrawMoney(customer, amount);
                        customerDAO.viewBalance(customer.getAcc_number());
                    }
                }
                break;
                case 3: {
                    customerDAO.viewBalance(customer.getAcc_number());
                }
                break;
                case 4: {
                    System.out.println("Enter your ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter new email: ");
                    String email = scanner.next();
                    System.out.println("Enter new password: ");
                    String password = scanner.next();
                    customerDAO.updateCustomerInfo(email, password, id);
                }
                break;
                case 5: {
                    UserInterface.userInterfaceMenu();
                    running = false;
                }
                break;
            }
        }
        scanner.close();
    }
}
