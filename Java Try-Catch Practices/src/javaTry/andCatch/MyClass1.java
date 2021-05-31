package javaTry.andCatch;

public class MyClass1 {
	double length;
	double height;
	double weidth;
	double size;
	
	public MyClass1() {
		System.out.println("This is a simple program");
	}
	
	public MyClass1(double l, double w) {
		this.length = l;
		this.weidth = w;
	}
	
	public void size() {
		size = length * weidth;
	}

}
