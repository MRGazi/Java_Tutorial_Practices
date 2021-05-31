package constructors;

public class Calculation1 {
	
	double perDayTotal;
	double totalSalary;
	double parcentageOfBasicSalary;
	
	double rate, basic, percentage, hour;
	
	String format = " =>"+" $ ";
	String ts = "Total Salary of the week";
	String pbs = "Parcentage of basic Salary ";
	
	public Calculation1(double rate, double basic, 
			double parcentage, double hour) {
		this.rate= rate;
		this.basic = basic;
		this.parcentageOfBasicSalary= parcentage;
		this.hour= hour;
		
		perDayTotal = (rate * hour)/5;
		totalSalary = perDayTotal * 5 + basic;
		parcentageOfBasicSalary = (basic/100) * parcentage;
	}
	
	public void salaryPerDay() {
		System.out.println("Total Salary of a Day" + format + this.perDayTotal);
	}
	
	public void totalSalaryOfWeek() {
		System.out.println(ts + format + this.totalSalary);
	}
	
	public void basicSalaryParcentage() {
		System.out.println(pbs + format + this.parcentageOfBasicSalary);
	}
	
	public double computePayment(
			double loanAmount,
			double rate,
			double futureValue,
			int numberOfPeriod) {
		
		double interest = rate / 100;
		double partial1 = Math.pow((1 + interest), -numberOfPeriod);
		double denominator = (1 - partial1) / interest;
	    double answer = (-loanAmount / denominator)
	                    - ((futureValue * partial1) / denominator);
		
		return answer;
	}

}
