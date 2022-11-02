package entities;

public class Account {
	private int accountNum;
	private String accountHolder;
	private double amount;
	private double balance;
	
	public Account(int accountNum, String accountHolder, double amount) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.amount = amount;
	}
	public Account(int accountNum, String accountHolder) {
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.amount = 0.0; 
	}
	public Account(double amount) {
		
	}
	
	public void setAccountNum(int num) {
		this.accountNum = num;
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
	public void setAmount(double price) {
		this.amount = price;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public void makeDeposit() {
		this.balance += amount;
	}
	public void makeWithdraw(double amount) {
		this.balance -= amount;
	}
}
