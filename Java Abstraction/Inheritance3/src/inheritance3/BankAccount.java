package inheritance3;

public class BankAccount {
	
	private String owner;
	private double balance;
	
	//constructor without parameter;
	public BankAccount() {
		owner = "Bob Bilton";
		balance = 0.00;
	}
	
	//constructor with parameter;
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	//method with parameter;
	public void diposit(double amount) {
		balance += amount;
		//balance = balance + amount;
	}
	
	//method with parameter;
	public void withdraw(double amount) {
		balance -= amount;
		//balance = balance - amount;
	
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public double getBalance() {
		return this.balance;
	}

}
