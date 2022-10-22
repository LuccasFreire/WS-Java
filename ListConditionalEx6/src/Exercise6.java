import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double num;
		System.out.print("Insert a number: ");
		num = kb.nextDouble();
		
		if (num <= 25.0) {
			System.out.printf("The number you typed is between 0 and 25");
		}
		else if (num <= 50.0) {
			System.out.printf("The number you typed is between 25 and 50");
		}
		else if (num <= 75.0) {
			System.out.printf("The number you typed is between 50 and 75");
		}
		else if (num <= 100.0) {
			System.out.printf("The number you typed is between 75 and 100");
		}
		else {
			System.out.println("The number you typed is out of the rage");
		}
		kb.close();
	}

}
