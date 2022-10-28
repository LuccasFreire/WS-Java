package NotUsingOOP;

import java.util.Scanner;

import UsingOOP.Triangle;
public class TriangleAreaNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
//		double xA, xB, xC, yA,yB,yC;
//		
//		System.out.println("Insert the three measures of Triangle X: ");
//		xA = kb.nextDouble();
//		xB = kb.nextDouble();
//		xC = kb.nextDouble();
//		System.out.println("Insert the three measures of Triangle X: ");
//		yA = kb.nextDouble();
//		yB = kb.nextDouble();
//		yC = kb.nextDouble();
//		
//		double p = (xA + xB + xC) / 2.0;
//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
//		
//		p = (xA + xB + xC) / 2.0;
//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
//		
//		
//		System.out.printf("Area X: %.4f%n", areaX);
//		System.out.printf("Area Y: %.4f%n", areaY);
//		
//		if (areaX > areaY) {
//			System.out.println("Bigger area =  X");
//		}
//		else {
//			System.out.println("Bigger area = Y");
//		}
//		kb.close();
		
		
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insert the three measures of Triangle X: ");
		x.a = kb.nextDouble();
		x.b = kb.nextDouble();
		x.c = kb.nextDouble();
		
		System.out.println("Insert the three measures of Triangle Y: ");
		y.a = kb.nextDouble();
		y.b = kb.nextDouble();
		y.c = kb.nextDouble();
		
		double areaX = x.calculateArea();
		double areaY = y.calculateArea(); 
		
		System.out.printf("Area X: %.4f%n", areaX);
		System.out.printf("Area Y: %.4f%n", areaY);
		
		if ( areaX > areaY ) {
			System.out.println("Bigger area =  X");
		}
		else {
			System.out.println("Bigger area = Y");
		}
		kb.close();
	}

}
