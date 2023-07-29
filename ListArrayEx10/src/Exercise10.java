import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		kb.close();
		System.out.println("How many students?");
		int t = kb.nextInt();
		Student vect[] = new Student[t];
		
		for (int i = 1; i <= t; i++) {
			System.out.println(i + " Student Name: ");
			String name = kb.nextLine();
			System.out.println(i + " Student First grade: ");
			double n1 = kb.nextDouble();
			System.out.println(i + " Student Second grade: ");
			double n2 = kb.nextDouble();
			vect[i] = new Student(name,n1,n2);
			if (vect[i].getAvg() <= 6) {
				System.out.println(vect[i].getNome());
			}
		}
		
	}

}
