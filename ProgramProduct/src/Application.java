import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		Product product;
		product = new Product();
		
		System.out.println("Enter the product infos: ");
		System.out.print("Name: ");
		product.name = kb.next();
		System.out.print("Price: ");
		product.price = kb.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = kb.nextInt();
		
		String showData = product.ShowData();
		System.out.println(showData);
		
		System.out.println("Enter the number of products to be added in stock: ");
		
		int quant = kb.nextInt();
		product.quantity = product.quantity + quant;
		
		System.out.println(showData);
		
		
		
		kb.close();
		
	}

}
