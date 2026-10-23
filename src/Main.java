
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Create the manager object
InventoryManager manager = new InventoryManager();

System.out.println("=== Starting Smart Inventory System ===");

//2.create sample product objects using your constructor
Product item1 = new Product(101, "Logitech Mouse", 999.00 , 15);
Product item2 = new Product(102, "Gaming keyboard", 2499.00, 5);

//3.Add products to our inventory list
System.out.println("\n--- Adding Items ---");
manager.addProduct(item1);
manager.addProduct(item2);


//4.View the initial inventory status
manager.viewInventory();
//
////5.Test Case A: Process a successful bill transaction
//System.out.println("\n--- Customer Buying 2 Mice ---");
//manager.sellProduct(101, 2);

////6.Test Case B: Test the error handling (Out of stock check)
//System.out.println("\n--- Customer Trying to Buy 10 Keyboards (only 5 left!) ---");
//manager.sellProduct(102, 10);

//7.Test Case C: Test the error handling(Wrong Product ID)
System.out.println("\n--- Customer Typing a Wrong Product ID ---");
manager.sellProduct(999, 1);

//8. View final inventory status to see updated quantities
System.out.println("\n--- Final Inventory Check ---");
manager.viewInventory();
	}

}
