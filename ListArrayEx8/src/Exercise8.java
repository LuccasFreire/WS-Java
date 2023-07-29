import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many elements? (array)");
		int t = kb.nextInt();
		int num[] = new int[t];
		int pares = 0;
		double sum = 0;
		
		for (int i = 0; i <= num.length; i++) {
			System.out.println("Insert number: ");
			num[i] = kb.nextInt();
			if (num[i] % 2 == 0) {
				pares++;
				sum += num[i];
			}
		}
		
		double avg = sum/pares;
		
		if (sum == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.println("MEDIA DOS PARES: " + avg);
		}
		kb.close();
	}

}
