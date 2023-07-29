import java.util.Scanner;
public class sumOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Type a number ( type 0 to exit the program ): ");
		int num = kb.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num;
			num = kb.nextInt();
		}
		System.out.printf("The sum of the numbers: %d", sum);
		
		kb.close();
	}

}
