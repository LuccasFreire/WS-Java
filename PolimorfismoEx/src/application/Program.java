package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Insert the number o employees: ");
		int n = kb.nextInt();
		
		for(int i = n; i <= n; i++) {
			System.out.println("EMPLOYEE #" + i + " DATA:");
			System.out.print("Outsourced (Y/N)? ");
			char select = kb.next().charAt(0);
			System.out.print("Name: ");
			kb.nextLine();
			String name = kb.nextLine();
			System.out.print("Hours: ");
			int hours = kb.nextInt();
			System.out.print("Value per hours: ");
			float valueP = kb.nextFloat();
			
			if (select == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = kb.nextDouble();
				//Employee emp = new OutsourcedEmployee(name, hours, valueP, addCharge);
				
				list.add(new OutsourcedEmployee(name, hours, valueP, addCharge));
			} else {
				//Employee emp = new Employee(name, hours, valueP);
				
				list.add(new Employee(name, hours, valueP));
			}
			System.out.println();
			System.out.println("Payments: ");
			
			for (Employee emp : list) {
				System.out.println(emp.getName() + " R$ " + emp.payment());
			}
			kb.close();
		}
		
	}

}
