import menus.FrontMenu;
import menus.RoleSelection;
import menus.SupplierMenu;
import menus.buyer_utils.Purchase_Buyer;
import menus.supplier_utils.AddSupply_Supplier;
import menus.supplier_utils.CheckSupply_Supplier;
import utils.SystemFunctions;

public class Main {
    public static void main(String[] args) {

        do {
            switch (SystemFunctions.getCurrentMenu()) { // Check the current menu to determine what to display
                // The enum constants are named based on the class file of the menus
                case FrontMenu: {
                    FrontMenu.openMenu(); // Open the Front Menu
                    break;
                }
                case RoleSelection: {
                    RoleSelection.openMenu(); // Open the Role Selection Menu
                    break;
                }
                case SupplierMenu: {
                    SupplierMenu.openMenu(); // Open the Supplier Menu
                    break;
                }
                case CheckSupply_Supplier: {
                    CheckSupply_Supplier.openMenu(); // Open the Check Supply Menu
                    break;
                }
                case AddSupply_Supplier: {
                    AddSupply_Supplier.openMenu(); // Open the Add Supply Menu
                    break;
                }
                case Purchase_Buyer: {
                    Purchase_Buyer.openMenu(); // Open the Buyer Purchase Menu
                    break;
                }
                default: {
                    System.out.println(SystemFunctions.getCurrentMenu()); // Print the current menu for debugging
                    System.out.println("AN ERROR HAS OCCURED IN THE CODE. PLEASE DOUBLE CHECK ALL METHOD CALLS FOR SystemFunctions.changeMenu()");
                    SystemFunctions.shutDownProgram(); // Shut down the program due to an error
                    break;
                }
            }


        } while (SystemFunctions.getProgramStatus()); // Continue running the program if the status is true

    }

}
