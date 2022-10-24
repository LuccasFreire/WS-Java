import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num,repeat=0,in = 0,out = 0;
		System.out.println("Insert the amount of times the program will repeat itself:  ");
		repeat = kb.nextInt();
		
		for (int i = 1; i <= repeat; i++) {
			System.out.println("Insert the number: "+ i);
			num = kb.nextInt();
			
			if (num >= 10 && num <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.printf(" %d in%n %d out", in, out);
		kb.close();
	}

}
