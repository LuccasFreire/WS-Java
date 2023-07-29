import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many numbers do you want to insert? ");
		t = kb.nextInt();
		int[] num = new int[t];
		
		for (int i = 0; i < t; ++i) {
			System.out.printf("Insert the [%d] number: ", i+1);
			num[i] = kb.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		kb.close();
	}

}
