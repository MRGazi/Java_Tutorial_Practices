package javaInterface.exercise;

public class MyClass_5 {
	
	public static void main(String[]args) {
		//Creating interface object and Executing in different Class;
		
		MyInterface_1 obj1 = new MyInterface_1() { //interface object;

			@Override
			public void myMethod_11() {
				System.out.println("myMethod11() is Executing the the value of data11 " + data11 + " ....");
				
			}

			@Override
			public void myMethod_12() {
				System.out.println("myMethod12() is Executing the the value of data12 " + data12 + " ....");
				
			}
			
		};
		
		obj1.myMethod_11();
		obj1.myMethod_12();
		System.out.println(obj1.myMethod_13());
		System.out.println(MyInterface_1.myMethod_14());
		
	}

}
