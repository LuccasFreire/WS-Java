package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Insert number of shapes: ");
		int n = kb.nextInt();
		List<Shape> list = new ArrayList<>();
		
		for (int i = 0; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or circle? (R/C)");
			char select = kb.next().charAt(0);
			System.out.println("Color: (Black/Blue/Red)");
			Color color = Color.valueOf(kb.next());
			
			if(select == 'r') {
				System.out.print("Width: ");
				double width = kb.nextDouble();
				System.out.print("Height: ");
				double height = kb.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = kb.nextDouble();
				list.add(new Circle(radius));
			}
			System.out.println();
			System.out.println("Shape areas:");
			
			for (Shape shape : list) {
				System.out.println(String.format("%.2f", shape.area()));
			}
		}
		kb.close();
		
	}

}
