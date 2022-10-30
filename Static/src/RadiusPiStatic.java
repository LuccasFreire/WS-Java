import java.util.Scanner;

import util.Calculator;
public class RadiusPiStatic {
	public static final double PI = 3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Insert the radius value: ");
		double radius = kb.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Circumference: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", PI);
		
		kb.close();
	}
	
}
