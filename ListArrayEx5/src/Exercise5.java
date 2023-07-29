import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many real numbers? ");
		int t = kb.nextInt();
		double real[] = new double[t];
		int posit = 0;
		double bigger = 0;
		for (int i = 0; i < t; i++) {
			System.out.printf("Number %d \n",i );
			real[i] = kb.nextDouble();
		}
		
		for (int i = 0; i < t; i++) {
			if (bigger < real[i]) {
				bigger = real[i];
			}
			
		}
		for (int i = 0; i < t; i++) {
			if (bigger <= real[i]) {
				posit = i;
			}
		}
		
		System.out.println(bigger);
		System.out.println(posit);
		
		kb.close();
	}

}
