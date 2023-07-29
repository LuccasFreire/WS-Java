import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num;
		System.out.print("Insert a number: ");
		num = kb.nextInt();
		
		for (int i = 1; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		kb.close();
	}

}
