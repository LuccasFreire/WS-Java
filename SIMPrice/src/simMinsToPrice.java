import java.util.Scanner;
public class simMinsToPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int min;
		
		System.out.print("Insert the time you have used your mobile data in minutes: ");
		min = kb.nextInt();
		
		double conta = 50.0;
		
		if (min > 100) {
			conta = conta + (min - 100) * 2;
		}
		
		System.out.printf("Total Price of your plan: %.2f ", conta);
		
		kb.close();
	}

}
