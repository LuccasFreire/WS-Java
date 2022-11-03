package application;
import java.util.Scanner;

import entities.Account;
public class BankAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNum = kb.nextInt();
		
		System.out.print("Enter account holder: ");
		String accountHolder = kb.next();
		
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
		
		System.out.println("Enter deposit value: ");
		double amount = kb.nextDouble();
		Account account1 = new Account(amount);
		account1.makeDeposit();
		
		System.out.println(account1.toString());
		
		System.out.println("Enter a withdraw value: ");
		amount = kb.nextDouble();
		account1.makeWithdraw(amount);

		System.out.println(account1.toString());
		kb.close();
	}

}
