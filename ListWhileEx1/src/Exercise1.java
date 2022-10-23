import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int insertPassw;
		int passw = 2002;
		
		System.out.println("Type the password: ");
		insertPassw = kb.nextInt();
		
		while ( insertPassw != passw) {
			System.out.println("Wrong password, type again: ");
			insertPassw = kb.nextInt();
		}
		
		System.out.println("Access granted!");
		kb.close();
	}

}
