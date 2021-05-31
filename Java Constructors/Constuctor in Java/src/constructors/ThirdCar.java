package constructors;

public class ThirdCar {
	
	private int iYearMake;
	private String sCarModel;
	private int iCarSpeed;
	
	public ThirdCar() {
		
	}
	
	public ThirdCar(int make, String model) {
		this.iYearMake = make;
		this.sCarModel = model;
		this.iCarSpeed = 00;
	}
	
	//getter methods;
	public int getYearMake() {
		return iYearMake;
	}
	
	public String getCarModel() {
		return sCarModel;
	}
	
	public int getCarSpeed() {
		return iCarSpeed;
	}
	
	//setter methods;
	public void setYearMake(int make) {
		this.iYearMake = make;
	}
	
	public void setCarModel(String model) {
		this.sCarModel = model;
	}
	
	public void setCarSpeed(int speed) {
		this.iCarSpeed = speed;
	}
	
	//some Calculations;
	
	public void acclerate() {
		iCarSpeed = iCarSpeed + 5;
		System.out.println("The car speed is = " + iCarSpeed);
	}
	
	public void brake() {
		iCarSpeed = iCarSpeed - 5;
		System.out.println("The car brake comes doun to " + iCarSpeed);
	}
	

}
