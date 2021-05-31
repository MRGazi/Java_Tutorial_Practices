package inheritance3;

public class SavingsAccount extends BankAccount {
	
	private final double INTEREST_RATE = 0.05;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(String owner, double initialBalance) {
		super(owner, initialBalance);
	}
	
	public void addInterest() {
		double increasedBy = (this.getBalance() * INTEREST_RATE);
		this.diposit(increasedBy);
	}

}
