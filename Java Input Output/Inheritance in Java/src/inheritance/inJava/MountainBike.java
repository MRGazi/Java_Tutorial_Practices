package inheritance.inJava;

public class MountainBike extends Bicycle {
	// mountain bike subclass has one field;	
	public int seatHeight;
	
	// mountain bike sub class has one constructor;
	
	public MountainBike (int startHeight,int startCadence,int startSpeed,
				         int startGear) {
		
		super(startCadence, startSpeed, startGear);
        
		seatHeight = startHeight;
			
	}
	

}
