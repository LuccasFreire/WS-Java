import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		double numX, numY;
		
		System.out.print("Type number 1: ");
		numX = kb.nextDouble();
		
		System.out.print("Type number 2: ");
		numY = kb.nextDouble();
		
		if (numX > 0 && numY > 0) {
			System.out.print("Quadrant: I");
		}
		else if (numX < 0 && numY > 0) {
			System.out.print("Quadrant: II");
		}
		else if (numX < 0 && numY < 0) {
			System.out.print("Quadrant: III");
		}
		else if (numX > 0 && numY < 0) {
			System.out.print("Quadrant: IV");
		}
		else {
			System.out.println("Origin");
		}
		kb.close();
		
	}

}
