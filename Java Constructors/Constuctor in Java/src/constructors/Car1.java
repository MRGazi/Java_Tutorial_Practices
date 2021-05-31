package constructors;

public class Car1 {
	//Class Member Variables or Fields;
	String sModel;
		int iGear;
		int iHighestSpeed;
		String sColor;
		int iMake;
		boolean bLeftHandDrive;
		String sTransmission;
		int iTyres;
		int iDoors;
		
		/*
		Syntax to create a default Constructor;
		
		public Car1() {
			
		}
		
		*/
		
		//Assign default value to the default constructor;
		
		public Car1() {
			sModel = "BMW 1000";
			iGear = 5;
			iHighestSpeed = 300;
			sColor = "White";
			iMake = 2019;
			bLeftHandDrive = true;
			sTransmission = "Auto";
			iTyres = 4;
			iDoors = 4;
					
		}
		
		//Constructor with values passed; true, "Auto", 4, 4
		public Car1(String model, int gear, int highestSpeed, String color, int make, 
				boolean leftHandDrive, String transmission, int tyres, int doors) {
			this.sModel = model;
			this.iGear = gear;
			this.iHighestSpeed = highestSpeed;
			this.sColor = color;
			this.iMake = make;
			this.bLeftHandDrive = leftHandDrive;
			this.sTransmission = transmission;
			this.iTyres = tyres;
			this.iDoors = doors;
			
		}
		
		public void displayCar1Characteristic() {
			System.out.println("The Car1 Model is = " + sModel);
			System.out.println("The Car1 Gear is = " + iGear);
			System.out.println("The Car1 Highest speed is = " + iHighestSpeed);
			System.out.println("The Car1 Color is = " + sColor);
			System.out.println("The Car1 Make is = " + iMake);
			System.out.println("The Car1 Left Hand Drive is = " + bLeftHandDrive);
			System.out.println("The Car1 Transmission is = " + sTransmission);
			System.out.println("The Car1 Number of Tyers is = " + iTyres);
			System.out.println("The Car1 Number of Doors is = " + iDoors);
		}
		
		public void displayCar1Features() {
			System.out.println("The Car1 Model is = " + sModel);
		}
		
		
	

}
