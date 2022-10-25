import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int repeat = 0;
		double num1 = 0, num2 = 0;
		System.out.println("Insert how many divisions do you want: ");
		repeat = kb.nextInt();
		
		for (int i = 1; i <= repeat; i++ ) {
				System.out.printf("Insert number: 1 ");
				num1 = kb.nextInt();
				System.out.printf("Insert number: 1 ");
				num2 = kb.nextInt();
	
				double resp = 0, division = 0;
				
				resp = (num2 == 0) ? (0) : (division = num1/num2);
				System.out.println(resp);
			
/*			System.out.printf("Insert number: 1 "); meh cant make the if in a single var
			double num = kb.nextInt();
			System.out.printf("Insert number: 2 ");
			num = num / kb.nextInt();
			System.out.printf("Division: %.1f", num);
			kb.close(); */
		}
		kb.close();
	}

}
