package edu.mrgJava.keyword.finalExample;

public class FinalMethodExample {
	//Super class;
	public class A{
		
		//final method;
		public final void test() {
			System.out.println("This is a Final Method test inside clsss A");
		}
		
		//regular method;
		public void test1() {
			System.out.println("This is a Method not final test inside clsss A");
		}
		
	}
	
	//sub class which extends A;
	public class B extends A{
		
		//Cannot override the final method from FinalMethodExample.A;
		public void test() {
			System.out.println("This is a Final Method test inside clsss B");
		}
		
		//no error message for this method override;
		public void test1() {
			System.out.println("This is a Method not final test inside clsss B");
		}
	}

}
