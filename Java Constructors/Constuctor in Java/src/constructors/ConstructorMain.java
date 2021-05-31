package constructors;



public class ConstructorMain {
	
	
	
	public static void main(String[] args) {
		double rate = 20;
		double basic = 500;
		double parcentage = 20;
		double hour = 40;
		
		Calculation1 c1 = new Calculation1(rate, basic, parcentage, hour);	
		
		//c1.salaryPerDay();
		//c1.totalSalaryOfWeek();
		//c1.basicSalaryParcentage();
		
		double x = c1.computePayment(40000, 3.75, 60000, 30);
		//System.out.println(x);
		
		ConstChaining1 cc1 = new ConstChaining1("Hasan", 250, 1000);
		cc1.empDetails();
		
		ConstChaining2 cc2 = new ConstChaining2("Robin", 333, 1200, 45);
		
		cc2.empDetails();
	}

}
