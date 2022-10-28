import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter the product infos: ");
		
		System.out.print("Name: ");
		product.name = kb.next();
		
		System.out.print("Price: ");
		product.price = kb.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = kb.nextInt();
		
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
