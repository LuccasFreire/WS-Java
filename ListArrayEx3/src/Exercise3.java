import java.util.Scanner;

import entities.Person;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 0;
//		double avgAge = 0;
		double soma = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Number of persons you'll want to insert datas: ");
		Person[] vectPerson = new Person[t];
		int minus16Person = 0;
		
		for (int i = 0; i < t; i++) {
			System.out.printf("Name: \n");
			String name = kb.nextLine();
			System.out.printf("Age: \n");
			int age = kb.nextInt();
			System.out.printf("Height: \n");
			double height = kb.nextDouble();
			
			vectPerson[i] = new Person(name, age, height);
						
			soma =+ vectPerson[i].getAge();	
			
			
			if (vectPerson[i].getAge() <= 16) {
				minus16Person++;
			}
		}
		String vectMinus16Person[] = new String[minus16Person];
		
		for (int i = 0; i < t; i++) {
			if (vectPerson[i].getAge() <= 16) {
				vectMinus16Person[i] = vectPerson[i].getName();
			}
		}
		
		
		double avgAge = soma/t;
		System.out.println(avgAge);
		
		
		kb.close();
	}

}
