import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num;
		
		System.out.println("Type the number of the day: ");
		num = kb.nextInt();
		
		String day;
		switch (num) {
		case 1:
			day = "Sunday";
			break;
		
		case 2:
			day = "Monday";
			break;
		
		case 3:
			day = "Tuesday";
			break;
		
		case 4:
			day = "Wednesday";
			break;
		
		case 5:
			day = "Thursday";
			break;
		
		case 6:
			day = "Friday";
		
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid number";
			break;
		}
		
		System.out.printf("Day of the week number: %s", day);
		kb.close();
	}

}
