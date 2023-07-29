import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many elements? (array)");
		int n = kb.nextInt();
		double num[] = new double[n];
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i <= num.length; i++) {
			System.out.printf("Insert number: ");
			num[i] = kb.nextDouble();
			sum += num[i];
		}
		avg = sum/n;
		System.out.println("Elements below the avg: ");
		for (int i = 0; i <= num.length; i++) {
			if (num[i] <= avg) {
				System.out.println(num[i]);
			}
		}
		
		
		kb.close();
	}

}
