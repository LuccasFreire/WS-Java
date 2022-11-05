package application;
import java.util.Scanner;

import entities.Account;
public class BankAccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNum = kb.nextInt();
		
		System.out.print("Enter account holder: ");
		String accountHolder = kb.next();
		
		String logical = kb.nextLine();
		System.out.println("Is there an initial deposit (Y/N)? ");
		logical = kb.next().toLowerCase();
		
		
		if (logical != "n") {
			System.out.println("Enter initial deposit: ");
			double deposit = kb.nextDouble();
			account1 = new Account(accountNum, accountHolder, deposit);
		}
		else {
			account1 = new Account(accountNum, accountHolder);
		}
		
//		System.out.println("Enter deposit value: ");
//		double deposit = kb.nextDouble();
//		Account account1 = new Account(deposit);
//		account1.makeDeposit(deposit);
		
		System.out.println(account1.toString());
		
		System.out.println("Enter a withdraw value: ");
		double amount = kb.nextDouble();
		account1.makeWithdraw(amount);

		System.out.println(account1.toString());
		kb.close();
	}

}
