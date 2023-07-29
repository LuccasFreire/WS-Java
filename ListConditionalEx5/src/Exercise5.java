import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int code,quant;
		System.out.println("Type the code of the food: ");
		code = kb.nextInt();
		System.out.println("Quantity: ");
		quant = kb.nextInt();
		
		if (code == 1) {
			double price = ((double) quant * 4.00);
			System.out.printf("Total: %.2f", price);
		}
		else if (code == 2) {
			double price = ((double) quant * 4.50);
			System.out.printf("Total: %.2f", price);
		}
		else if (code == 3) {
			double price = ((double) quant * 5.00);
			System.out.printf("Total: %.2f", price);
		}
			else if (code == 4) {
				double price = ((double) quant * 2.00);
				System.out.printf("Total: %.2f", price);
			}
		else if (code == 5) {
			double price = ((double) quant * 1.50);
			System.out.printf("Total: %.2f", price);
		}
		else {
			System.out.println("Wrong code, type from 1 to 5!");
		}
		kb.close();
	}

}
