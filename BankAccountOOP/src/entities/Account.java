package entities;

public class Account {
	private int accountNum;
	private String accountHolder;
	private double amount;
	private double balance;
	
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
	public void makeDeposit(double amount) {
		this.balance += amount;
	}
	public void makeWithdraw(double amount) {
		this.balance -= amount;
	}
}
