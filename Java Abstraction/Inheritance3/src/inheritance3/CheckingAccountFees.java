package inheritance3;

public class CheckingAccountFees extends CheckingAccount {
	
	private final double FEES = 20.00;
	
	public CheckingAccountFees() {
		super();
	}
	
	public CheckingAccountFees(String owner, double initialBalance, int initialCheckCount) {
		
		super(owner, initialBalance, initialCheckCount);
	}
	
	public void diductFees() {
		this.withdraw(FEES);
		
	}

}

//https://www.youtube.com/watch?v=q-qLne_Ixgg
//https://www.youtube.com/watch?v=h6YLR4K4I5g&t=860s