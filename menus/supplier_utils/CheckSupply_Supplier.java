package menus.supplier_utils;

import java.util.Scanner;
import data.SupplierData;
import data.VehicleModelData;
import utils.SystemFunctions;
import utils.SystemVariables.MenuConstants;

public class CheckSupply_Supplier {
    private static Scanner scanner = new Scanner(System.in);

    // Display supply details for each model and variant
    public static void openMenu() {
        SystemFunctions.clearConsole();
        System.out.println("====================================================\r\n" + //
                           "| QUANTITY  | MODEL               | VARIANT        |\r");

        // Loop through each supply record
        for (String[] supplyDetails : SupplierData.dataObj.records) {
            // Format and display quantity, model, and variant with padding for alignment
            System.out.print("| " + supplyDetails[0] + " ".repeat(10 - supplyDetails[0].length()));
            System.out.print("| " + VehicleModelData.getModelFullName(supplyDetails[1]) + " ".repeat(20 - VehicleModelData.getModelFullName(supplyDetails[1]).length()));
            System.out.print("| " + VehicleModelData.getVariant(supplyDetails[1], Integer.parseInt(supplyDetails[2])) + " ".repeat(15 - VehicleModelData.getVariant(supplyDetails[1], Integer.parseInt(supplyDetails[2])).length()) + "|");
            System.out.println("");
        }

        System.out.println("====================================================");
        
        // Wait for user input before returning to the menu
        System.out.println("Enter anything to return to the menu.");
        scanner.nextLine();
        SystemFunctions.changeMenu(MenuConstants.SupplierMenu);
    }
}
