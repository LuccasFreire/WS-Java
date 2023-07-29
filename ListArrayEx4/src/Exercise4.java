import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many int numbers? ");
		int t = kb.nextInt();
		
		int numb[] = new int[t];
		int quant = 0;
		
		for (int i = 0; i < t; i++) {
			System.out.printf("Insert number %d/n", i);
			numb[i] = kb.nextInt();			
		}
		System.out.println("Numeros Pares: ");
		for (int i = 0; i < t; i++) {
			if (numb[i] % 2 == 0) {
				System.out.printf("%d",numb[i]);
				quant++;
			}
		}
		System.out.printf("Quantidade de pares: %d", quant);
		kb.close();
	}

}
