package abstraction.inJava;

public abstract class AbsExercise4 {
	
	//class constructor;
	AbsExercise4 (){
		
		System.out.println("This is a class Constructor");
		
		}
	
	//abstract method that is without method body;
	public abstract void method1 ();
	
	// non abstract method with method body;
	public void nonAbsMethod () {
		System.out.println("This is a non Abstract method");
	}

}

// Child classes which inherits AbsExercise4;

class Child1 extends AbsExercise4 {
	
	public void method1 () {
		System.out.println("This is method1 in Child1 class");
	}
	
}


