import java.util.Scanner;
import java.util.Locale;

public class Exercise3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Inser the how many times the program will run: ");
		int repeat = kb.nextInt();
		double n1 = 0;

		for (int i = 1; i <= repeat; i++) {
			System.out.println("Type number 1: ");
			n1 = kb.nextDouble();
			System.out.println("Type number 1: ");
			n1 = n1 + kb.nextDouble();
			System.out.println("Type number 1: ");
			n1 += kb.nextDouble();
			n1 = n1 / 3;
			System.out.printf("Media: %.2f",n1);
		}

		kb.close();
	}

}
