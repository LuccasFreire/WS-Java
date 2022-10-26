import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Type a number 1: ");
		int num1 = kb.nextInt();
		kb.close();
		
		System.out.println("Divisores: ");
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) { 
				System.out.printf("%d ", i);
			}
		}
		kb.close();
	}

}
