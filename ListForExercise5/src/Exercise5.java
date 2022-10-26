import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1, num = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Insert the number you want to see the factorial: ");
		num = kb.nextInt();
		kb.close();
		int c = num;
		for (; c >= 0; c--) {
			factorial = factorial * num;
			num = num - 1;
			
			System.out.println(factorial);
		}
		
	}

}
