package application;

import java.util.Scanner;

import entities.Rectangle;
import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter rectangle width: ");
		rectangle.width = kb.nextDouble();
		System.out.print("Enter rectangle height: ");
		rectangle.height = kb.nextDouble();
		
		rectangle.calculateArea();
		rectangle.calculateDiagonal();
		rectangle.calculatePerimeter();
		
		System.out.println(rectangle.toString());
		
		kb.close();
	}

}
