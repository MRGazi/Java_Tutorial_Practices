package edu.mrgJava.keyword.finalExample;

public class FinalKeyword {
	
	//Variable is final/ constant;
	final String name = "Bangladesh";
	
	//variable is not final;
	private String name1 = "Bangladesh";
	
	//Change the value;
	private void changeValue() {
		name = "Chittagong"; //The final field FinalKeyword.name cannot be assigned;
	}
	
	//variable name can be changed;
	private void changeValue1() {
		name1 = "Chittagong";
	}

}
