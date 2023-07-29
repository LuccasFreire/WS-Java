import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner kb = new Scanner(System.in);
	double salary;
	
	System.out.print("Insert your salary: ");
	salary = kb.nextDouble();
	
	if (salary <= 2000.00) {
		System.out.println("Exempt!");
	}
	else if (salary <= 3000.00) {
		salary = (((salary/100) * 8) + salary);
		System.out.printf("%.2f", salary);
	}
	else if (salary <= 4500.00) {
		salary = (((salary-2000)/100) * 18);
		System.out.printf("%.2f", salary);
	}
	else if (salary > 4500.00) {
		salary = (((salary/100) * 28) + salary);
		System.out.printf("%.2f", salary);
	}
	
	kb.close();
	}

}
