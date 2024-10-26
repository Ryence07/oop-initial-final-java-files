package menus.supplier_utils;

import data.SupplierData;
import menus.parent_classes.FormFiller;

public class FormFiller_Supplier extends FormFiller{
    // Opens the supplier form menu and fills in the supplier details
    public static void openMenu() {

        String[] details = FormFiller.fillFormSupplier();
        SupplierData.dataObj.fillDetails(details[0], details[1], details[2]);
        
    }
}
