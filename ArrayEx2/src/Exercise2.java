import java.util.Scanner;

import entities.Product;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Insert the number of items: ");
		int num = kb.nextInt();
		Product[] vector = new Product[num];
		
		for (int i = 0; i < vector.length; i++) {
			kb.nextLine();
			System.out.printf("Name of the product: ");
			String name = kb.nextLine();
			System.out.printf("Price of the product: ");
			double price = kb.nextDouble();
			vector[i] = new Product(price, name);
		}
		
		double sumOfPrice = 0;
		for (int i = 0; i < vector.length; i++) {
			sumOfPrice += vector[i].getPrice();
		}
		double avgPrice = sumOfPrice / vector.length;
		
		System.out.printf("Average price of the items: %.2f", avgPrice);
		
		kb.close();
	}

}
