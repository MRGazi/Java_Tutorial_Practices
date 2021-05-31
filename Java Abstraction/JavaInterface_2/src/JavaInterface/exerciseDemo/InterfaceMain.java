package JavaInterface.exerciseDemo;

public class InterfaceMain {

	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car = new Car();
		
		System.out.println("Maximum Speed of the Bike is = " + bike.maxSpeed());
		bike.vehicleCount();
		
		System.out.println("Maximum Speed of the Car is = " + car.maxSpeed());
		car.vehicleCount();

	}

}
