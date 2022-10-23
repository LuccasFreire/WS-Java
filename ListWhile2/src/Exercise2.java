import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner kb = new Scanner(System.in);
		
		double numX, numY;
		
		System.out.println("Insert the value X: ");
		numX = kb.nextDouble();
		System.out.println("Insert the value Y: ");
		numY = kb.nextDouble();
		
		while (numX != 0 && numY != 0) {
			
			System.out.println("Insert the value X: ");
			numX = kb.nextDouble();
			System.out.println("Insert the value Y: ");
			numY = kb.nextDouble();
			
			if (numX > 0 && numY > 0) {
				System.out.println("Quadrant: I");
			}
			else if (numX < 0 && numY > 0) {
				System.out.println("Quadrant: II");
			}
			else if (numX < 0 && numY < 0) {
				System.out.println("Quadrant: III");
			}
			else if (numX > 0 && numY < 0) {
				System.out.println("Quadrant: IV");
			}
		}
			kb.close();
	}

}
