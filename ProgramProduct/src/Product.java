
public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public String toString() {
		return "Name: " + name + ", Price: $ "+ price + " Quantity: " + quantity + " Total Price: $ " + totalValue();
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
