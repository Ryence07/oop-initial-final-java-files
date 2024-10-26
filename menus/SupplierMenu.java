package menus;

import java.util.Scanner;

import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

public class SupplierMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void openMenu() { 
        
        while (true) {
            SystemFunctions.clearConsole(); // Clear the console for a fresh menu display
            System.out.println("=================================\r\n" + //
                        "| Greetings, welcome to… |\r\n" + //
                        "| DL Auto Care! |\r\n" + //
                        "=================================\r\n" + //
                        "1.1.1 Add Supply\r\n" + // Option to add supply
                        "1.1.2 Check Supply\r\n" + // Option to check supply
                        "1.1.3 Back\r\n" ); // Option to go back
            System.out.print("Enter choice: ");
            String userInput = scanner.nextLine().trim(); // Get user input
            switch (userInput) {
                case "1.1.1": {
                    SystemFunctions.changeMenu(MenuConstants.AddSupply_Supplier); // Navigate to Add Supply menu
                    return;
                }
                case "1.1.2": {
                    SystemFunctions.changeMenu(MenuConstants.CheckSupply_Supplier); // Navigate to Check Supply menu
                    return;
                }
                case "1.1.3": {
                    // back
                    SystemFunctions.changeMenu(MenuConstants.RoleSelection); // Navigate back to Role Selection menu
                    return;
                }
                default: {
                    System.out.println("Invalid input. Please try again"); // Handle invalid input
                    SystemFunctions.delay(1); // Delay before showing the menu again
                }
            }
        }
    }
}
