package edu.mrgJava.method;

public class MethodExample2 {
	
	private static double x, y, z;
	
	MethodExample2(double a, double b, double c){
		a = MethodExample2.getX();
		b = MethodExample2.getY();
		c = MethodExample2.getZ();
	}

	public static double getX() {
		return x;
	}

	public static void setX(double x) {
		MethodExample2.x = x;
	}

	public static double getY() {
		return y;
	}

	public static void setY(double y) {
		MethodExample2.y = y;
	}

	public static double getZ() {
		return z;
	}

	public static void setZ(double z) {
		MethodExample2.z = z;
	}
	
	
	public static double addition() {
		return MethodExample2.getX() + MethodExample2.getY() + MethodExample2.getZ();
	}
	
	public static double multiplication() {
		return MethodExample2.getX() * MethodExample2.getY() * MethodExample2.getZ();
	}

}
