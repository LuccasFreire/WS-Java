import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Type the number 1: ");
		num1 = kb.nextInt();
		System.out.println("Type the number 2: ");
		num2 = kb.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		
		kb.close();
	}

}
