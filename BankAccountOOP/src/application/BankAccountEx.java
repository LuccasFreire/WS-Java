package application;
import java.util.Scanner;

import entities.Account;
public class BankAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNum = kb.nextInt();
		System.out.println("Enter account holder: ");
		String accountHolder = kb.nextLine();
		System.out.println("Is there an initial deposit (Y/N)? ");
		String logical = kb.next().toLowerCase();
		
		if (logical != "n") {
			System.out.println("Enter initial deposit: ");
			double deposit = kb.nextDouble();
			Account account1 = new Account(accountNum, accountHolder, deposit);
			account1.makeDeposit();
		}
		else {
			Account account1 = new Account(accountNum, accountHolder);
			account1.makeDeposit();
		}
		
		kb.close();
	}

}
