package abstraction.inJava;

abstract class AbsExercise1 {
	
	abstract void runVehicle();

}

class Honda extends AbsExercise1 {
	public void runVehicle () {
		String s1 = "Honda is running safely in the City";
		System.out.println(s1);
	}
}

