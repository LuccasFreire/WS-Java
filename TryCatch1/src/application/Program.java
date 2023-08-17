package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		try {
			String[] array = kb.nextLine().split(" ");
			int position = kb.nextInt();
			System.out.println(array[position]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		} catch (InputMismatchException a) {
			System.out.println("Type a number");
		}
		
		System.out.println("END!");
		kb.close();
	}

}
