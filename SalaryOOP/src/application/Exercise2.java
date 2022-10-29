package application;
import java.util.Scanner;

import entities.Employee;

import java.util.Locale;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Insert your name: ");
		employee.name = kb.nextLine();
		System.out.println("Insert your salary: ");
		employee.salary = kb.nextDouble();
		System.out.println("Insert the tax: ");
		employee.tax = kb.nextDouble();
		 
//		System.out.println("Employee: "+ employee.name + " $ "+ employee.netSalary()); Formatted code below
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		System.out.println("Insert the percentage to increase the salary: ");
		employee.increaseSalary(kb.nextDouble());
		
		System.out.println(employee.toString());
		kb.close();
	}

}
