package entities;

public class Account {
	private int accountNum;
	private String accountHolder;
	private double amount;
	private double balance;
	
	public Account(int accountNum, String accountHolder, double amount) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		makeDeposit(amount);
	}
	public Account(int accountNum, String accountHolder) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.amount = 0.0; 
	}
	public Account(double amount) {
		this.amount = amount;
	}
	public String toString() {
		return "Account " + getAccountNum() + " Holder: " + getAccountHolder() + " Balance: " + String.format("%.2f",getBalance());
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountHolder(String name) {
		this.accountHolder = name;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public void makeDeposit(double amount) {
		this.balance += amount;
	}
	public void makeWithdraw(double price) {
		this.balance -= (price) + 5.0;
	}
}
