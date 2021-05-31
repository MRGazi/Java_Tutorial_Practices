package JavaInterface.exerciseDemo;

public class Car implements Vehicle {

	int wheel = 4;
	
	@Override
	public double maxSpeed() {
		return 280;
		
	}

	@Override
	public void vehicleCount() {
		System.out.println("Vehicle Wheel count is = " + wheel);
		
	}

}
