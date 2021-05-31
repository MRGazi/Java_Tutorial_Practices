package abstraction.inJava;

public abstract class AbsExercise5 {
	
	public abstract int getSum ();
	public abstract int getSum (int a);
	public abstract int getSum (int a, int b);

}

class AbsSub1 extends AbsExercise5 {
	
	int a = 5;
	
	public int getSum () {
		return a + a;
	}
	
	public int getSum (int a) {
		return a + a;
	}
	
	public int getSum (int a, int b) {
		int x = a + b;
		System.out.println("x");
		return x;
	}
	
}