import java.util.Scanner;

import entities.Rent;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many rooms: ");
		int n = kb.nextInt();
		Rent[] rooms = new Rent[10];
		
		for (int i = 1; i < n; i++) {
			System.out.println("Rent #" + i + ": ");
			System.out.println("Name: ");
			kb.nextLine();
			String name = kb.nextLine();
			System.out.println("Email: ");
			String email = kb.next();
			System.out.println("Room: ");
			int roomNumb = kb.nextInt();
			
			rooms[roomNumb] = new Rent(name, email);
			
		}
		
		for (int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
					System.out.println(rooms[i]);
			}
		}
		kb.close();
	}

}
