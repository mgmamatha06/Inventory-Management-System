import java.util.*; //  Step A: Import Scanner to read keyboard inputs
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Create the manager object
		
		        InventoryManager manager = new InventoryManager();
		        Scanner scanner = new Scanner(System.in); // Creates the input reader
		        
		        System.out.println("=== Welcome to Smart Inventory & Billing System ===");
		        
		        while (true) { //  Keeps the menu running in a continuous loop
		            System.out.println("\n--- Dashboard Menu ---");
		            System.out.println("1. Add New Product");
		            System.out.println("2. View Current Stock");
		            System.out.println("3. Create Customer Bill (Sell)");
		            System.out.println("4. Shut Down System");
		            System.out.print(" Enter choice (1-4): ");
		            
		            int choice = scanner.nextInt();
		            
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Product ID (Integer): ");
		                    int id = scanner.nextInt();
		                    scanner.nextLine(); // Clear scanner buffer space
		                    
		                    System.out.print("Enter Product Name: ");
		                    String name = scanner.nextLine();
		                    
		                    System.out.print("Enter Price (₹): ");
		                    double price = scanner.nextDouble();
		                    
		                    System.out.print("Enter Initial Stock Quantity: ");
		                    int stock = scanner.nextInt();
		                    
		                    // Create object dynamically from user typing and pass it to manager
		                    Product newProduct = new Product(id, name, price, stock);
		                    manager.addProduct(newProduct);
		                    break;
		                    
		                case 2:
		                    manager.viewInventory();
		                    break;
		                    
		                case 3:
		                    System.out.print("Enter Product ID to purchase: ");
		                    int sellId = scanner.nextInt();
		                    
		                    System.out.print("Enter Quantity to buy: ");
		                    int qty = scanner.nextInt();
		                    
		                    manager.sellProduct(sellId, qty);
		                    break;
		                    
		                case 4:
		                    System.out.println("🔌 Shutting down system. Thank you for using!");
		                    scanner.close(); // Close scanner to free memory resources
		                    return; // Terminates the entire program loop execution
		                    
		                default:
		                    System.out.println(" Invalid selection! Please enter a number between 1 and 4.");
		            }
		        }
		    

	}

}
