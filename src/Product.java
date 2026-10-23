
public class Product {
private int id;
private String name;
private double price;
private int stockQuantity;


//Constructor
public Product(int id, String name, double price, int stockQuantity) {
	this.id = id;
	this.name = name;
	this.price = price;
	this.stockQuantity = stockQuantity;
}


public int getId() {return id;}

public String getName() {return name;}

public double getPrice() {	return price;}

public int getStockQuantity() {	return stockQuantity;}

//Setter
public void setStockQuantity(int stockQuantity) {this.stockQuantity = stockQuantity;}

public void displayProduct() {	System.out.println("ID: " + id+ "Name: " + name +" Price: " + price+ "StockQuantity: " + stockQuantity);
}
}
