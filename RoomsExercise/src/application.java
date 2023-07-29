import java.util.Scanner;

import entities.Student;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int rooms[] = new int[9];
		int n;
		
		System.out.println("How many students? ");
		n = kb.nextInt();
		Student student[] = new Student[n];
		
		for (int i = 0; i <= rooms.length; i++) {
			System.out.printf("Rent %d\n", i+1);
			System.out.println("Insert your name: ");
			String name = kb.nextLine();
			System.out.println("Insert your email: ");
			String email = kb.nextLine();
			System.out.println("Room: ");
			int chosenRoom = kb.nextInt();
			student[chosenRoom] = new Student(name, email, chosenRoom);
		}
		for (int i = 0; i <= rooms.length; i++) {
			System.out.println(student[i].toString());
		}
		
		kb.close();
	}

}
