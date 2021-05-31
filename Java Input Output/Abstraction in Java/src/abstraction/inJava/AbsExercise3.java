package abstraction.inJava;

public abstract class AbsExercise3 {

	public abstract void publicBank ();
	
	public abstract int getRateOfInterest ();
	
}

class TDBank extends AbsExercise3 {
	
	public void publicBank () {
		
	}
	
	public int getRateOfInterest () {
		return 10;
	}
}

class CitiBank extends AbsExercise3 {
	
	public void publicBank () {
		
	}
	
	public int getRateOfInterest () {
		return 15;
	}
}


