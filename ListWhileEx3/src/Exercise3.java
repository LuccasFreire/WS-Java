import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int option =0, alcool = 0, gasoline = 0, diesel = 0;
		
		while (option != 4) {
			System.out.printf("Seu combustivel preferido:%n");
			option = kb.nextInt();
			switch (option) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasoline += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				break;
			default:
				System.out.println("Type an valid number!");
				break;
			}
			
		}
		System.out.printf(" Muito obrigado%nAlcool: %d%n Gasolina: %d%n Diesel: %d", alcool, gasoline, diesel);
		kb.close();
	}

}
