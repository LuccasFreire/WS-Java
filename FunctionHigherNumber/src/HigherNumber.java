import java.util.Scanner;
public class HigherNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int numb1, numb2, numb3;
		
		System.out.println("Insert three numbers:");
		numb1 = kb.nextInt();
		numb2 = kb.nextInt();
		numb3 = kb.nextInt();
		kb.close();
		
		showResult(higherNum(numb1, numb2, numb3));
		
	}
	
	public static int higherNum(int n1, int n2, int n3) {
		int aux;
		if (n1 > n2 && n1 > n3) {
			aux = n1;
		}
		else if (n2 > n3){
			aux = n2;
		}
		else {
			aux = n3;
		}
		return aux;
		}
	
	public static void showResult (int x) {
		System.out.println("Higher: " + x);
	}
	
//	public static String showResult (int x) {
//		return "Higher number: "+ x;
//	}
}
