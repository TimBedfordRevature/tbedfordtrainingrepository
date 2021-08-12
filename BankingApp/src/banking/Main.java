package banking;

import utilities.*;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        UserInterface UI = new UserInterface();

        System.out.println("Welcome to the BankApp!\n");
        try {
            UI.userInterfaceMenu();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Thank you for using the BankApp");
    }
}
