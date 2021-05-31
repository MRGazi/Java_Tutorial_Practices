package inheritance.inJava;

public class Bicycle {
	
	// three fields of the bicycle class;
	public int cadence;
	public int speed;
	public int gear;
	
	// Bicycle class has one constructor;
	public Bicycle (int startCadence, int startGear, int startSpeed) {
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
	}
	
	// four methods of bicycle class;
	public void setCadence (int newValue) {
		cadence = newValue;
	}
	
	public void setGear (int newValue) {
		gear = newValue;
	}
	
	public void applyBreak (int decrement) {
		speed -= decrement;
	}
	
	public void speedUp (int increment) {
		speed += increment;
	}


}
