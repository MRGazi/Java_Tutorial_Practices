package edu.mrgJavaEdu.controlFlowStatements;

public class ControlFlowMain {

	public static void main(String[] args) {
		
		SwitchCase sc = new SwitchCase();
		//sc.switchCase();
		
		//Selection statements
		SelectionStatements ss = new SelectionStatements();
		//ss.ifStatement();
		//ss.ifElseStatement();
		//ss.nestedIfStatement();
		//SelectionStatements.nestedIfStatement1(); //this is static method
		
		//ss.ifElseIf_Else();
		//ss.switchStatement();
		
			//static method calling, no need to create object;
		//LoopingStatements.whileStatement1();
		//LoopingStatements.whileStatement2();
		//LoopingStatements.whileStatement3();
		//LoopingStatements.whileStatement4();
		
			//instance Method calling object creation is needed;
		LoopingStatements ls = new LoopingStatements();
		//ls.doWhile();
		//ls.doWhile1();
		
			//Static method calling no need to create Object;
		//LoopingStatements2.forLoop();
		LoopingStatements2 ls2 = new LoopingStatements2();
		//ls2.forLoop1();
		//ls2.forLoop2();
		ls2.forLoop3();
	}

}
