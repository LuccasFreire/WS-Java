package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("How many employers: ");
		int n = kb.nextInt();
		
		List<Employer> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Employer #%d\n", i);
			System.out.printf("ID: ");
			Integer id = kb.nextInt();
			System.out.printf("Name: ");
			kb.nextLine();
			String name = kb.nextLine();
			System.out.printf("Salary: ");
			Double salary = kb.nextDouble();
			Employer employer = new Employer(id,name,salary);
			list.add(employer);
		}
		
		System.out.println("Which employer wil get the salary increased? Insert the ID: ");
		int idSalary  = kb.nextInt();
		System.out.println("Insert the increase percentage: ");
		double percent = kb.nextDouble();
		
		Integer idPosition = hasId(list, idSalary);
		
		//OPTIONAL WAY USING STREAM
		//Employer emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (idPosition != null) {
			list.get(idPosition).increaseSalary(percent);;
		} else {
			System.out.println("Type a valid Employee ID!");
		}
		kb.close();
		System.out.printf("\nIncreased salary: %.2f", list.get(idPosition).getSalary());
		
		System.out.println("\nLIST OF EMPLOYEES: ");
		for(Employer emp : list) {
			System.out.println(emp.toString());
		}
	}
	
	public static Integer hasId(List<Employer> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
