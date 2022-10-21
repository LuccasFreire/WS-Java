import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num;
		System.out.print("Type a number");
		num = kb.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("The number %d is even ", num);
		}
		else {
			System.out.printf("The number %d is odd ", num);
		}
		kb.close();
	}

}
