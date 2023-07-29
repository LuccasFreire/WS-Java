
public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return "Name: " + name + "\nPrice: $"+ String.format("%.2f", price) + "\nQuantity: " + quantity + "\nTotal Price: $" + String.format("%.2f", totalValue());
		//return "Name: " + name + ", Price: $ "+ String.format("%.2f", price) + " Quantity: " + quantity + " Total Price: $ " + String.format("%.2f", totalValue());
		// shows the string formated to 2 decimal floats
	}
	public double totalValue() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
