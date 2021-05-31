package edu.mrgJava.classes.nestedClass;

public class FirstExample {
	
	public String name;
	public final int MEMBER = 20;
	
	public class A{
		private String designation;
		
		public A() {
			
		}
		
		public A(String desig) {
			this.designation = desig;
		}
		
		public String getDesignation() {
			return designation;
		}
		
	}
	//************************************************************
	public class B extends A{
		private String designation;
		
		public B() {
			
		}
		
		public B(String desig) {
			super(desig);
			this.designation = desig;
		}
		
		public String getDesignation() {
			return designation;
		}
		
		public void setDesignation(String desig) {
			this.designation = desig;
		}
		
	}

}
