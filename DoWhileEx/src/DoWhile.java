import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double celsius = 0;
		char repeat = 'S';
		do {
			
			System.out.println("Type the temperature: ");
			celsius = kb.nextDouble();
			celsius = 9 * celsius/5 + 32;
			System.out.printf("Converted to Fahrenheit: %.1f", celsius);
		} while (repeat == 'S' && repeat == 's');
		kb.close();
	}

}
