package menus;

import java.util.Scanner;

import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

public class RoleSelection {
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() {

        while (true) {
            SystemFunctions.clearConsole();
            System.out.println("=================================\r\n" + //
                        "| Greetings, welcome to… |\r\n" + //
                        "| DL Auto Care! |\r\n" + //
                        "=================================\r\n" + //
                        "1.1 Supplier\r\n" + //
                        "1.2 Buyer\r\n" + //
                        "1.3 Back");
            System.out.print("Enter choice: ");
            String userInput = scanner.nextLine().trim();
            switch (userInput) {
                case "1.1": {
                    // Navigate to the Supplier menu
                    SystemFunctions.changeMenu(MenuConstants.SupplierMenu);
                    return;
                }
                case "1.2": {
                    // Navigate to the Buyer purchase menu
                    SystemFunctions.changeMenu(MenuConstants.Purchase_Buyer);
                    return;
                }
                case "1.3": {
                    // Navigate back to the Front menu
                    SystemFunctions.changeMenu(MenuConstants.FrontMenu);
                    return;
                }
                default: {
                    // Handle invalid input
                    System.out.println("Invalid input. Please try again");
                    SystemFunctions.delay(1);
                }
            }
        }
    }
}
