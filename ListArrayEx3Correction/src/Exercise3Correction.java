import java.util.Scanner;

public class Exercise3Correction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many person: ");
		
		int p = kb.nextInt();
		String[] names = new String[p];
		double[] ages = new double[p];
		double[] height = new double[p];
		
		for (int i = 0; i < p; i ++) {
			System.out.println((i+1) + " person data: ");
			System.out.println("Name: ");
			names[i] = kb.next();
			System.out.println("Age: ");
			ages[i] = kb.nextDouble();
			System.out.println("Height: ");
			height[i] = kb.nextDouble();
		}
		double sum = 0.0;
		
		for (int i = 0; i < p; i++) {

			sum += height[i];
		}

		double avgHeight = (sum/p);
		System.out.printf("%nAverage height: %.2f%n", avgHeight);
		
		int cont = 0;
		
		for (int i = 0; i < p; i++) {
			if (ages[i] < 16) {
				cont += 1;
			}
		}
		
		double percent = cont * 100.0 / p;
		
		System.out.printf("People under 16 years old: %.1f%%%n", percent);
		
		for (int i = 0; i < p; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		kb.close();
	}

}
