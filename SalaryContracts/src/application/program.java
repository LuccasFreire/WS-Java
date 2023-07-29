package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Department name: ");
		String workerDepartment = kb.nextLine();
		System.out.println("Entre Worker data");
		System.out.println("Name: ");
		String name = kb.nextLine();
		System.out.println("Level: ");
		String workerLevel = kb.nextLine().toUpperCase();
		System.out.println("Base Salary: ");
		double baseSalary = kb.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new  Department(workerDepartment));
		
		System.out.println("How many contracts: ");
		int contractsNums = kb.nextInt();
		for (int i = 0; i<= contractsNums; i++) {
			System.out.println("Enter contract #" + ++i + " data: " );
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(kb.next());
			System.out.println("Value per hour: ");
			double valuePerHour = kb.nextDouble();
			System.out.println("Contract Duration (hours): ");
			int hours = kb.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println("Enter month and year to calculate income (MM/YYYY)");
		String monthAndYear = kb.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2))	;
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for  " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		kb.close();
	}

}
