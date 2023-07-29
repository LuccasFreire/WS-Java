import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Insert the vector size: ");
		int size = kb.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		int c[] = new int[size];
		
		for (int i = 0; i <= a.length; i++) {
			System.out.printf("Value [%d]\n", i);
			a[i] = kb.nextInt();
		}
		for (int i = 0; i <= a.length; i++) {
			System.out.printf("Value [%d]\n", i);
			b[i] = kb.nextInt();
		}
		System.out.println("Sum of Vector A and Vector B: ");
		for (int i = 0; i <= a.length; i++) {
			c[i] = a[i] + a[i];
			System.out.println(c[i]);
		}
		
		kb.close();
	}

}
