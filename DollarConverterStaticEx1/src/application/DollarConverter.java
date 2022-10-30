package application;
import java.util.Scanner;

import util.CurrencyConverter;
public class DollarConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		double DOL = kb.nextDouble();
		System.out.println("How many dollar will be bought? ");
		double quantity = kb.nextDouble();
		
		System.out.print("Amount to be paid in BRL: R$ " + CurrencyConverter.convertDollar(quantity, DOL));
		kb.close();
	}

}
