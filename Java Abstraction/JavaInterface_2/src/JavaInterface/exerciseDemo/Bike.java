package JavaInterface.exerciseDemo;

public class Bike implements Vehicle {
	int wheel = 2;
	
	
	@Override
	public double maxSpeed() {
		
		return 150;
		
	}

	@Override
	public void vehicleCount() {
		System.out.println("Vehicle Wheel Count is = " + wheel);
		
	}

}
