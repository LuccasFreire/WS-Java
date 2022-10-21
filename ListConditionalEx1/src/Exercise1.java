import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num;
		System.out.print("Type a number: ");
		num = kb.nextInt();
		
		if (num < 0) {
			System.out.printf("%d is a negative number", num);
		}
		else {
			System.out.printf("%d is a positive number", num);
		}
		
		kb.close();
	}

}
