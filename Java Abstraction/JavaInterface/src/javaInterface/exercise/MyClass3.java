package javaInterface.exercise;

public class MyClass3 implements MyInterface_2 {

	@Override
	public void myMethod_11() {
		//data11 = 2300; it cannot initialize here because it is constant type in Interface;
		System.out.println("myMethod11() is Executing the the value of data11" + data11 + "....");

	}

	@Override
	public void myMethod_12() {
		System.out.println("myMethod12() is Executing the the value of data12" + data12 + "....");

	}

	@Override
	public void myMethod_21() {
		System.out.println("myMethod21() is Executing the the value of data21" + data21 + "....");

	}

	@Override
	public void myMethod_22() {
		System.out.println("myMethod22() is Executing the the value of data22" + data22 + "....");

	}

}
