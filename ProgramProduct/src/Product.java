
public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Name: " + name + ", Price: $ "+ price + " Quantity: " + quantity + " Total Price: $ " + totalValue();
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
