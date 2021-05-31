package inheritance3;

public class InheritanceMain {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("Branden", 100);
			l(ba.getOwner());
			l(ba.getBalance());
		l("==============================================");
			
		SavingsAccount sa = new SavingsAccount("Bob", 225);
			sa.diposit(55);
			sa.addInterest();
			l(sa.getOwner());
			l(sa.getBalance());
		l("==============================================");
			
		CheckingAccount ca = new CheckingAccount("Martin", 500, 800);	
			ca.withdraw(200);
			ca.useChecks();
			l(ca.getOwner());
			l(ca.getBalance());
		l("==============================================");
		
		CheckingAccountFees caf = new CheckingAccountFees("Habard", 550, 150);
			caf.withdraw(35);
			caf.diductFees();
			caf.useChecks();
			l(caf.getOwner());
			l(caf.getBalance());
			
			
		
	}
	
	public static void l(Object s) {
		System.out.println(s);
	}

}
