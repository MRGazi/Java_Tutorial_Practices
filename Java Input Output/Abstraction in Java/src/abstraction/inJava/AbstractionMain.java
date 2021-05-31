package abstraction.inJava;

public class AbstractionMain {

	public static void main(String[] args) {
		
		System.out.println("AbsExercise1: \n");
		//Showing result of Abstraction from AbsExercise1;
		AbsExercise1 h_Car = new Honda (); // Creating object;
		
		h_Car.runVehicle(); // calling the method
		
		System.out.println("--------------End of AbsExercise1--------------\n");
		
		System.out.println("AbsExercise2: \n");
		//Showing result of Abstraction from AbsExercise2;
		AbsExercise2 obj_1 = new DrawExercise1 (); //Creating object of DrawExercise1
		obj_1.drawObject();
		
		AbsExercise2 obj_2 = new DrawExercise2 (); //Creating object of DrawExercise2
		obj_2.drawObject();
		
		System.out.println("--------------End of AbsExercise2--------------\n");
		
		System.out.println("AbsExercise3: \n");
		
		AbsExercise3 interest;
		interest = new TDBank ();
		int a;
		a = interest.getRateOfInterest();
		System.out.println("The interest rate for TDBank is = " + a + "%");
		
		interest = new CitiBank ();
		int b = interest.getRateOfInterest();
		System.out.println("The interest rate for CitiBank is = " + b + "%");
		
		System.out.println("--------------End of AbsExercise3--------------\n");
		
		System.out.println("AbsExercise4: \n");
		
		AbsExercise4 test1 = new Child1 ();
		test1.method1();
		test1.nonAbsMethod();
		
		System.out.println("--------------End of AbsExercise4--------------\n");
		
		System.out.println("AbsExercise5: \n");
		
		AbsSub1 test2 = new AbsSub1 ();
		test2.getSum();
		//test2.getSum(35);
		//test2.getSum(35, 35);
		
		System.out.println("--------------End of AbsExercise5--------------\n");
	}

}
