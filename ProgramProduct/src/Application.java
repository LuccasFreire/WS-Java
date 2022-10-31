import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter the product infos: ");
		
		System.out.print("Name: ");
		String name = kb.next();
		
		System.out.print("Price: ");
		double price = kb.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = kb.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added to stock: ");
		product.addProducts(kb.nextInt());
//		product.totalValue();
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be removed from the stock: ");
		product.removeProducts(kb.nextInt());
		
		System.out.println(product.toString());
		
		kb.close();
		
	}

}
