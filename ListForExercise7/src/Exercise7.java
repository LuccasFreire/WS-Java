import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Type a number: ");
		int num = kb.nextInt();
		System.out.println("Linha: ");
		for (int i = 1; i <= num; i++) {
			System.out.printf(" %d %d %d%n",i, (i*i), (i*i*i));
		}
		kb.close();
	}

}
