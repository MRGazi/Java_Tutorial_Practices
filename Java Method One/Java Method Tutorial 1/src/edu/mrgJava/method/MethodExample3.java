package edu.mrgJava.method;

public class MethodExample3 {
	
	private int x, y, z;
	
	public MethodExample3(int a, int b, int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public int addition() {
		return getX() + getY() + getZ();
	}
	
	public int multiplication() {
		return getX() * getY() * getZ();
	}
	
	public void resultAddition() {
		System.out.println(this.addition());
	}
	
	public void resultMultiplication() {
		System.out.println(this.multiplication());
	}
	
	public void count1() {
		if(x > y && y > z) {
			System.out.print("The Addition Result is: ");
			System.out.println(this.addition());
		} else {
			System.out.println("The Condition, x>y>z is not true");
		}
	}
	
	public void count2() {
		if(getX() > getY() && getY() < getZ()) {
			System.out.print("The conditional addition result is = ");
			System.out.println(this.multiplication());
		} else {
			System.out.println("The Condition is not true in Method count2()");
			System.out.println("Please Check the Method count2()");
		}
	}

}
