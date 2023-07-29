package application;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double sumOfHeight = 0;
		int num;
		
		System.out.printf("How many heights do you want to insert? ");
		num = kb.nextInt();
		
		double[] vector = new double[num];
		
		for (int i = 0; i < num; i++) {
			System.out.printf(i + 1 +" height: ");
			vector[i] = kb.nextDouble();
			sumOfHeight += vector[i];
		}
		
		
		double averageHeight = sumOfHeight / num;
		
		System.out.printf("Average height: %.2f", averageHeight);
		
		kb.close();
	}

}
