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
		
		Product product = new Product(name, price);
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added to stock: ");
		product.addProducts(kb.nextInt());
//		product.totalValue();
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(kb.nextInt());
		
		System.out.println(product.toString());
		
		kb.close();
		
	}

}
