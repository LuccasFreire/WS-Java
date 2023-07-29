import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How many persons?");
		int n = kb.nextInt();
		Person[] vect = new Person[n];
		int bigger = 0;
		String older = null;
		
		for (int i = 0; i < n; i++) {
			kb.nextInt();
			
			System.out.println("Name: ");
			String name = kb.nextLine();
			System.out.println("Age: ");
			
			int age = kb.nextInt();
			
			vect[i] = new Person(name, age);
			
			if (bigger > age) {
				bigger = age;
				older = name;
			}
		}
		
		System.out.println("Older person: " + older);
		
		kb.close();
	}

}
