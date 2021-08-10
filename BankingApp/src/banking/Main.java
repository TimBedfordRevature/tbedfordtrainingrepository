package banking;

import utilities.*;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        UserInterface UI = new UserInterface();

        try {
            UI.userInterfaceMenu();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
