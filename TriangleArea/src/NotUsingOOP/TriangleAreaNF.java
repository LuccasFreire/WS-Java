package NotUsingOOP;

import java.util.Scanner;
public class TriangleAreaNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double xA, xB, xC, yA,yB,yC;
		
		System.out.println("Insert the three measures of Triangle X: ");
		xA = kb.nextDouble();
		xB = kb.nextDouble();
		xC = kb.nextDouble();
		System.out.println("Insert the three measures of Triangle X: ");
		yA = kb.nextDouble();
		yB = kb.nextDouble();
		yC = kb.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (xA + xB + xC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		
		System.out.printf("Area X: %.4f%n", areaX);
		System.out.printf("Area Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Bigger area =  X");
		}
		else {
			System.out.println("Bigger area = Y");
		}
		kb.close();
	}

}
