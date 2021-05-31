package javaInterface.exercise;

public abstract class MyClass4 implements MyInterface_2 {
//Using interface as abstract object and implementing;
	@Override
	public void myMethod_11() {
		System.out.println("myMethod11() is Executing the the value of data11 " + data11 + " ....");

	}

	@Override
	public void myMethod_12() {
		System.out.println("myMethod12() is Executing the the value of data12 " + data12 + " ....");

	}

	public static void main(String[] args) {
		
		MyClass4 obj1 = new MyClass4() { // abstract class as an object;

			@Override
			public void myMethod_21() {
				System.out.println("myMethod21() is Executing the the value of data21 " + data21 +  " ....");
				
			}

			@Override
			public void myMethod_22() {
				System.out.println("myMethod22() is Executing the the value of data22 " + data22 + " ....");
				
			}
			
		};
		
		obj1.myMethod_11();
		obj1.myMethod_12();
		System.out.println(obj1.myMethod_13());
		System.out.println(MyInterface_1.myMethod_14());
		obj1.myMethod_21();
		obj1.myMethod_22();
		
	}

	
}


