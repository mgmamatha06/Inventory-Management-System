import java.util.*;
public class InventoryManager {
	
	
	//creating a dynamic list to hold out product objects
     private ArrayList<Product> productList = new ArrayList<>();
     
     
     //1. Logic to Add a Product
     public void addProduct(Product product) {
	 productList.add(product);
	 System.out.println("Product added successfully: " + product.getName());
    }

     
     //	2. Logic to View All Products
    public void viewInventory() {
	if(productList.isEmpty()) {
		System.out.println("Inventory is completely empty!");
		return;
	}
	

	System.out.println("\n-- Current Inventory Stock ---");
	for(Product p: productList) {
		p.displayProduct();
		}
    }
 
    
    
    // 3.Smart Business Logic: Process a Sale (Billing)
    public void sellProduct(int productId, int quantityToBuy) {
    	for(Product p : productList) {
    		
    		//Check if the ID matches the product you want to buy!
    		if(p.getId() == productId) {
    			//Check if we have enough items in stock
    		if(p.getStockQuantity() >= quantityToBuy) {
    			
    			int newStock = p.getStockQuantity() - quantityToBuy;
    			p.setStockQuantity(newStock);
    			double totalBill = p.getPrice() * quantityToBuy;
    			System.out.println("Sale Successful total bill: " + totalBill);
    		}
    		else {
    			System.out.println("Error: Not enough stock available");
    		}
    			return;//Exit method after finding the product
    		}
    	}
    
//    This will only print if the loop finishes without finding the ID
    System.out.println("Error: Product ID not found");

    
}
}
