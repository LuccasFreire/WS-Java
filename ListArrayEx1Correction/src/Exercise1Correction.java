import java.util.Scanner;

public class Exercise1Correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many numbers: ");
		int n = kb.nextInt();
		
		int[] vet = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Insert numb: ");
			vet[i] = kb.nextInt();
		}
		System.out.println("Negative numbers: ");
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		kb.close();
	}

}
