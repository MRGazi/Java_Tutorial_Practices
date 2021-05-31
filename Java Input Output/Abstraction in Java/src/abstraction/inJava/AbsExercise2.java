package abstraction.inJava;

public abstract class AbsExercise2 {
	
	abstract void drawObject ();

}

class DrawExercise1 extends AbsExercise2 {
	public void drawObject () {
		System.out.println("Drawing a Rectangle");
	}
}

class DrawExercise2 extends AbsExercise2 {
	public void drawObject () {
		System.out.println("Drawing a Circle");
	}
}
