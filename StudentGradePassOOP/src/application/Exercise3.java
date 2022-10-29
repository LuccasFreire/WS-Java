package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Student student1 = new Student();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Insert your name: ");
		student1.name = kb.nextLine();
		System.out.println("Insert first grade: ");
		student1.grade1 = kb.nextDouble();
		System.out.println("Insert second grade: ");
		student1.grade2 = kb.nextDouble();
		System.out.println("Insert third grade: ");
		student1.grade3 = kb.nextDouble();
		
		if (student1.validGrades() != true) {
			System.out.println("Write the grade in the limit");
			System.exit(0);
		}
		else {
			System.out.println("Proceeding...");
		}
		
		student1.finalGrade();
		student1.passNotPass();
		student1.notPass();
		
		if (student1.passNotPass() == "Pass") {
			System.out.println(student1.toString()); 
		}
		else {
			System.out.println(student1.toString());
		}
		
		
		kb.close();
	}

}
