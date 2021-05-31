package constructors;

public class Car2 {
	
	public String sModel1;
	public int iMake1;
	
	private String sModel2;
	private int iMake2;
	
	public Car2 () {
		
	}
	
	//getter method;
	public String getsModel2() {
		return sModel2;
	}
	
	//setter method;
	public void setsModel2(String model2) {
		this.sModel2 = model2;
	}
	
	public int getiMake2() {
		return iMake2;
	}
	
	public void setiMake2(int make) {
		this.iMake2 = make;
	}

}
