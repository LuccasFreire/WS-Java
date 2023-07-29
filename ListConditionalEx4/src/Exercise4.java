import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner kb = new Scanner(System.in);
		int startHour, endHour;
		System.out.print("What hour did the game start: ");
		startHour = kb.nextInt();
		System.out.print("What hour did the game end: ");
		endHour = kb.nextInt();
		
		if (startHour > endHour) {
			startHour = ((24 - startHour) + endHour);
			System.out.printf("O jogo durou: %d horas!", startHour);
		}
		else if (startHour < endHour) {
			int fullTime = 0;
			fullTime = endHour - startHour;
			System.out.printf("O jogo durou: %d horas!", fullTime);
		}
		else {
			System.out.println("O jogo durou 24 horas!");
		}
		kb.close();
	}

}
