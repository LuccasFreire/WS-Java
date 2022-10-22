import java.util.Scanner;
import java.util.Locale;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		double A, B, C;
		double triangleArea, circleArea, trapezoidArea,squareArea, rectangleArea;
		
		System.out.print("Type the value of A: ");
		A = kb.nextDouble();
		
		System.out.print("Type the value of B: ");
		B = kb.nextDouble();
		
		System.out.print("Type the value of C: ");
		C = kb.nextDouble();
		
		triangleArea = ((C * A)/2);
		circleArea =  (3.14159 * Math.pow(C, 2));
		trapezoidArea = ((A + B) / 2 * C);
		squareArea = (B * 4);
		rectangleArea = (A * B);
		
		System.out.printf("TRIANGLE: %.3f%nCIRCLE: %.3f%nTRAPEZOID: %.3f%nSQUARE: %.3f%nRECTANGLE: %.3f ",triangleArea, circleArea, trapezoidArea, squareArea, rectangleArea);
		kb.close();
	}

}
