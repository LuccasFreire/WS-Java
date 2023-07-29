import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("How many numbers will be summed? ");
		int t = kb.nextInt();
		int sum = 0;
		int[] num = new int[t];
		
		for (int i = 0; i < t; ++i) {
			System.out.printf("Insert the [%d] number: ", i+1);
			num[i] = kb.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("Numbers: %d \n",num[i]);
			sum += num[i];			
		}
		double media = sum/t;
		System.out.printf("Avg: %f", media);
		
		kb.close();
	}

}
