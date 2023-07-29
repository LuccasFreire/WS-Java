package application;

import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Array size: ");
		int size = kb.nextInt();
		int[][] array = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println((i+ 1) + " Linha " + (j+1) + " coluna: ");
				array[i][j] = kb.nextInt();
			}
		}
		System.out.println("Printing the array: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
				i++;
			}
			System.out.println();
		}
		System.out.println("Negative numbers: ");
		int neg = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] < 0) {
					neg ++;
				}
			} 
		}
		System.out.println(neg);
		kb.close();
	}

}
